package junit.tutorial.ex01.e04;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NumberUtilsTest {
	
	NumberUtils numberUtils = new NumberUtils();

	@Test
	void testIsEven1() {
		boolean result =  numberUtils.isEven(10);
		assertEquals(true,result,"isEven()メソッドが失敗しました");
		
	}
	
	@Test
	void testIsEven2() {
		boolean result = numberUtils.isEven(7);
		assertEquals(false,result,"isEven()メソッドが失敗しました");
	}

}
