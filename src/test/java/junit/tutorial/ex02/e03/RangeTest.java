package junit.tutorial.ex02.e03;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class RangeTest {
	
	
	@Test
	void testcontains1() {
		Range range = new Range(0.0,10.5);
		boolean result = range.contains(-0.1);
		assertEquals(false,result,"contains()メソッドが失敗しました");
		boolean result2 = range.contains(0.0);
		assertEquals(true,result2,"contains()メソッドが失敗しました");
		boolean result3 = range.contains(10.5);
		assertEquals(true,result3,"contains()メソッドが失敗しました");
		boolean result4 = range.contains(10.6);
		assertEquals(false,result4,"contains()メソッドが失敗しました");
		
	}
	
	@Test
	void testcontains2() {
		Range range = new Range(-5.1,5.1);
		boolean result = range.contains(-5.2);
		assertEquals(false,result,"contains()メソッドが失敗しました");
		boolean result2 = range.contains(-5.1);
		assertEquals(true,result2,"contains()メソッドが失敗しました");
		boolean result3 = range.contains(5.1);
		assertEquals(true,result3,"contains()メソッドが失敗しました");
		boolean result4 = range.contains(5.2);
		assertEquals(false,result4,"contains()メソッドが失敗しました");
		
	}
	
	}

