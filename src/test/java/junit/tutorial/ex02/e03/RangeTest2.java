package junit.tutorial.ex02.e03;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
@Nested
class RangeTest2 {
		@CsvSource({
			"-0.1,false",
			"0.0,true",
			"10.5,true",
			"10.6,false"
		})
		
		@ParameterizedTest
		void testcontains(double value,boolean test) {
			Range range = new Range(0.0, 10.5);
			assertEquals(test,range.contains(value));
		}
		
}

@Nested
class RangeTest3{
	@CsvSource({
		"-5.2,false",
		"-5.1,true",
		"5.1,true",
		"5.2,false"
	})
	
	@ParameterizedTest
	void testcontains(double value,boolean test) {
		Range range = new Range(-5.1,5.1);
		assertEquals(test,range.contains(value));
	}
}
