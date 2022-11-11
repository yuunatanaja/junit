package junit.tutorial.ex02.e02;

import static org.junit.jupiter.api.Assertions.*;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.junit.jupiter.api.Test;

class EmployeeTest {
	
	Employee employee = new Employee();

	@Test
	void testLoad() throws IOException {
		InputStream sytemin = System.in;
		InputStream fileStream = new FileInputStream("Employee.tex");
		InputStream bufferedStream =  new BufferedInputStream(fileStream);
		employee.load(fileStream);
		assertEquals("Ichiro",employee.getFirstName(),"load()メソッドが失敗しました");
		assertEquals("Tanaka",employee.getLastName(),"load()メソッドが失敗しました");
		assertEquals("ichiro@example.com",employee.getEmail(),"load()メソッドが失敗しました");
		bufferedStream.close();
		
		
		
		
		
		
		
		
	}

}
