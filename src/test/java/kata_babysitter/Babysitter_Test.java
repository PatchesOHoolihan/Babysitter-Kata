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
	
	// Creating a method to validate that end time is after start time.
	@Test
	public void shouldReturnTrueEndTime4amIsAfterStartTime5pm(){
		assertEquals(true, testObject.validateEndTime(4, 5));
	}
	
	@Test
	public void shouldReturnFalseEndTime7pmIsAfterStartTime8pm() {
		assertEquals(false, testObject.validateEndTime(7, 8));
	}
	
	// Creating a method to validate that bedtime is within range of start time to end time.
	@Test
	public void shouldReturnTrueBedTime9pmIsWithinStartTime5pmEndTime4am() {
		assertEquals(true, testObject.validateBedTime(9, 5, 4));
	}
	
	@Test
	public void shouldReturnFalseBedTime6pmIsWithinStartTime7pmEndTime11pm() {
		assertEquals(false, testObject.validateBedTime(6, 7, 11));
	}
	
	// Creating a method to calculate amount of hours in the midnight shift.
	@Test
	public void shouldReturn4HoursFromMidnightToEndTime4am() {
		assertEquals(4, testObject.calculateMidnightShiftHours(4));
	}
	
	@Test
	public void shouldReturn2HoursFromMidnightToEndTime2am() {
		assertEquals(2, testObject.calculateMidnightShiftHours(2));
	}
	

}
