package junit.tutorial.ex01.e02;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	void testDivide() {
			
	Calculator calculator = new Calculator();
			int result = calculator.divide(2,0);
		assertThrows(IllegalArgumentException.class,() -> calculator.divide(2,0));
	}


}