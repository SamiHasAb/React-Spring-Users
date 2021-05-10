package org.study.app.student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/api/v1/students")
public class StudentController {

	@GetMapping
	public List<Student> getAllstudents(){
		  List<Student> studentList = Arrays.asList( 
						  new Student(1L,"ALI","ali@gmail.com",Gender.MALE),
						 new Student(2L,"Mariam","mariam@gmail.com",Gender.FEMALE),
						 new Student(3L,"omar","omar@gmail.com",Gender.MALE)
					);
				
		  return studentList;
		
	}
	
}
