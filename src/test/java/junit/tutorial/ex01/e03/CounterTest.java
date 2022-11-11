package junit.tutorial.ex01.e03;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CounterTest {
	Counter counter = new Counter();

	@Test
	void testincrement1() {
		int result = counter.increment(); 
		assertEquals(1,result,"increment()メソッドが失敗しました");
		
	}
	
	@Test
	void testincrement2() {
		int result = counter.increment() * 2;
		assertEquals(2,result,"increment()メソッドが失敗しました");
	}
	
	@Test
	void testincrement3() {
		int result = counter.increment() * 51 ;
		assertEquals(51,result,"increment()メソッドが失敗しました");
	}

}
