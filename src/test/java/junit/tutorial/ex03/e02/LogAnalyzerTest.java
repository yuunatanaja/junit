package junit.tutorial.ex03.e02;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.doThrow;

import java.io.IOException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
@ExtendWith(MockitoExtension.class)
class LogAnalyzerTest {
	
	@InjectMocks
	LogAnalyzer logAnalyzer = new LogAnalyzer();
	
	@Mock
	private LogLoader mockedLogLoader;
	


	@Test
	void test() throws Exception{
		doThrow(new IOException ("error by stub")).when(mockedLogLoader).load("test");
		AnalyzeException e = assertThrows(AnalyzeException.class,
				() -> logAnalyzer.analyze("test"));
		
		Throwable throwable = e.getCause();
		assertTrue(throwable instanceof IOException);
		assertEquals("error by stub" ,throwable.getMessage());
		
	}

}
