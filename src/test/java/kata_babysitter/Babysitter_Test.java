package kata_babysitter;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Babysitter_Test {
	
	private Babysitter testObject;
	
	@Before
	public void executedBeforeEachTest(){
		//Arrange
		testObject = new Babysitter();
	}
	
	@Test
	public void shouldReturnStartTime(){
		//Act
		int actual = testObject.returnStartTime(6);
		//Assert
		assertEquals(6, actual);
	}
	
	@Test public void shouldReturnStartTimeWithADifferentTime() {
		assertEquals(7, testObject.returnStartTime(7));
	}

}
