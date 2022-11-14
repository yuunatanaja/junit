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
		//戻り値の受け取り
		List<Employee> actual = Employee.load(input);
		//リストから情報の取り出し
		Employee employee = actual.get(0);
		//assertAllは１つのテストに失敗しても残りのテストがすべて実行される
		assertAll(
				() -> assertEquals(1,actual.size()),
		        () -> assertEquals("Ichiro",employee.getFirstName()),
		        () -> assertEquals("Tanaka",employee.getLastName()),
		        () -> assertEquals("ichiro@example.com",employee.getEmail())
		        		);
		
		
		
		
		
		
		
		
		
		
	}

}
