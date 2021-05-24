package org.study.app;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

//@SpringBootTest
class AppApplicationTests {

	Calculator calc = new Calculator();

    @Test
    void itShouldAddTwoNumbers() {
    	// given
		int num1 = 20;
		int num2 = 30;

		// when
		int result = calc.add(num1, num2);

		// then
		int expected = 50;
		assertThat(result).isEqualTo(expected);
	}

    class Calculator {
        int add(int a, int b) {
            return a + b;
        }
    }

}
