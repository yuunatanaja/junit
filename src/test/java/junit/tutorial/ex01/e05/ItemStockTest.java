package junit.tutorial.ex01.e05;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ItemStockTest {
	
	ItemStock itemStock = new ItemStock();
	Item item1 = new Item("book",100);
	Item item2 = new Item("cd",1400);
	
	

	@Test
	void testadd1() {
		int result = itemStock.getNum(item1);
		assertEquals(0,result,"getNum()が失敗しました");
		
	}
	
	@Test
	void testadd2() {
		itemStock.add(item1);
		Integer result = itemStock.getNum(item1);
		assertEquals(1,result,"getNum()が失敗しました");
		
	}
	
	@Test
	void testadd3() {
		itemStock.add(item1);
		itemStock.add(item1);
		Integer result = itemStock.getNum(item1);
		assertEquals(2,result,"getNum()が失敗しました");
	}
	
	@Test 
	void testadd4(){
		itemStock.add(item1);
		itemStock.add(item2);
		Integer result = itemStock.getNum(item1);
		assertEquals(1,result,"getNum()が失敗しました");
		
	}

}
