package junit.tutorial.ex02.e02;

import static org.junit.jupiter.api.Assertions.*;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class EmployeeTest {
	
	List<Employee> empList = new ArrayList<>();

	@Test
	void testLoad() throws IOException {
		InputStream input = getClass().getResourceAsStream("Employee.txt");
		InputStream bufferedStream = new BufferedInputStream(input);
		assertEquals("Ichiro",empList.get(0),"load()メソッドが失敗しました");
		assertEquals("Tanaka",empList.get(1),"load()メソッドが失敗しました");
		assertEquals("ichiro@example.com",empList.get(2),"load()メソッドが失敗しました");
		bufferedStream.close();
		
		
		
		
		
		
		
		
		
	}

}
