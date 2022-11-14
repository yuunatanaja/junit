package junit.tutorial.ex03.e01;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.junit.jupiter.MockitoExtension;

class MonthlyCalendarTest {
	
	
    @ParameterizedTest
    @CsvSource({
    	
    	"2012-01-31,0",
    	"2012-01-30,1",
    	"2012-02-01,28"
    })
    
    
    

	void testgetRemainingDays(LocalDate cal,int expected) {
		MonthlyCalendar monthlyCalendar = new MonthlyCalendar(cal);
		assertEquals(monthlyCalendar.getRemainingDays(),expected);
		
		
	}
    

}
