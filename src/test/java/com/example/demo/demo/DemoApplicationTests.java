package com.example.demo.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	@Test
	public void addPositiveNumbers() {
		Calculator calculator = new Calculator();
		int result = calculator.processNumbers(3,5,'+');
		assertEquals(8, result);
	}

	@Test
	public void subtractPositiveNumeber() {
		Calculator calculator = new Calculator();
		int result = calculator.processNumbers(8,3,'-');
		assertEquals(5, result);
	}

	@Test
	public void multiplayPositiveNumbers() {
		Calculator calculator = new Calculator();
		int result = calculator.processNumbers(3, 5, '*');
		assertEquals(15,result);
	}

	@Test
	public void dividePositiveNumbers() {
		Calculator calculator = new Calculator();
		int result = calculator.processNumbers(10, 2, '/');
		assertEquals(5, result);
		}

	@Test
	public void moduloOperation() {
		Calculator calculator = new Calculator();
		int result = calculator.processNumbers(10, 3,'%');
		assertEquals(1, result);
	} 

	@Test
	public void maxPositiveInteger() {
		Calculator calculator = new Calculator();
		int result = calculator.processNumbers(Integer.MAX_VALUE, 1, '-');
		assertEquals(Integer.MAX_VALUE - 1, result);
	}

	@Test
	public void addOppositeNumbers() {
		Calculator calculator = new Calculator();
		int result = calculator.processNumbers(5, -5, '+');
		assertEquals(0, result);
	}

	@Test
	public void square() {
		Calculator calculator = new Calculator();
		int result = calculator.processNumbers(5, 0, 's');
		assertEquals(25, result);

	}

	@Test
	public void absoluteDifference() {
		Calculator calculator = new Calculator();
		int result = calculator.processNumbers(5, 10, 'a');
		assertEquals(5, result);
	}

	@Test
	public void maxNumber() {
		Calculator calculator = new Calculator();
		int result = calculator.processNumbers(5, 10, 'm');
		assertEquals(10, result);
	}
}


