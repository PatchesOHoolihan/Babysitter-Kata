package kata_babysitter;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Babysitter_Test {
	
	private Babysitter testObject;
	
	@Before
	public void executedBeforeEachTest(){
		// Arrange
		testObject = new Babysitter();
	}
	
	// Creating methods to return times.
	@Test
	public void shouldReturnStartTime(){
		assertEquals(6, testObject.returnStartTime(6));
	}
	
	@Test
	public void shouldReturnStartTimeWithADifferentTime() {
		assertEquals(7, testObject.returnStartTime(7));
	}
	
	@Test
	public void shouldReturnEndTime() {
		assertEquals(6, testObject.returnEndTime(6));
	}
	
	@Test
	public void shouldReturnBedTime() {
		assertEquals(6, testObject.returnBedTime(6));
	}
	
	// Creating a method to convert time to a 0-11 scale.
	@Test
	public void shouldConvertTime5to0() {
	assertEquals(0, testObject.convertTime(5));
	}
	
	@Test
	public void shouldConvertTime4to11() {
		assertEquals(11, testObject.convertTime(4));
	}
	
	// Creating a method to validate that converted start time is before 4am (i.e. is less than 11).
	@Test
	public void shouldReturnTrueConvertedStartTime5pmIsLessThan11() {
		assertEquals(true, testObject.validateStartTime(5));
	}
	
	@Test
	public void shouldReturnFalseConvertedStartTime4amIsLessThan11() {
		assertEquals(false, testObject.validateStartTime(4));
	}
	
	
	
//	// Creating a method to validate that end time is after start time.
//	@Test
//	public void shouldReturnTrueIfConvertedEndTimeIsGreaterThanConvertedStartTime() {
//		testObject.validateEnd
//	}
	

}
