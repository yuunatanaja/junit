package junit.tutorial.ex03.e01;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

class MonthlyCalendarTest {
	
	

	@Test
	void testgetRemainingDays() {
		MonthlyCalendar monthlyCalender = new MonthlyCalendar();
		LocalDate nowdate = LocalDate.of(2012, 01, 31);
		int result = monthlyCalender.getRemainingDays();
		assertEquals(0,result,"getRemainingDays()が失敗しました");
		
		
	}
    

}
