package org.study.app.student;

import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;


import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

@DataJpaTest // used to run h2 db as a test

public class StudentRepositoryTest {

	
	// to auto generate this class press ctrl+shift+T in intellij
	
	   @Autowired
	    private StudentRepository underTest;

	    @AfterEach
	    void tearDown() {
	        underTest.deleteAll();
	    }

	    @Test
	    void itShouldCheckWhenStudentEmailExists() {
	        // given
	        String email = "jamila@gmail.com";
	        Student student = new Student(
	                "Jamila",
	                email,
	                Gender.FEMALE
	        );
	        underTest.save(student);

	        // when
	        boolean expected = underTest.selectExistsEmail(email);

	        // then
	        assertThat(expected).isTrue();
	    }

	    @Test
	    void itShouldCheckWhenStudentEmailDoesNotExists() {
	        // given
	        String email = "jamila@gmail.com"; // due aftereach methode this email will not be found

	        // when
	        boolean expected = underTest.selectExistsEmail(email);

	        // then
	        assertThat(expected).isFalse();
	    }
	
}
