package junit.tutorial.ex01.e02;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	void testDivide() {
			
	Calculator calculator = new Calculator();
		assertThrows(IllegalArgumentException.class,() -> calculator.divide(2,0));
	}


}