package kata_babysitter;

import static org.junit.Assert.*;

import org.junit.Test;

public class Babysitter_Test {
	
	@Test
	public void shouldReturnStartTime(){
		
		//Arrange
		Babysitter testObject = new Babysitter();
		
		//Act
		int actual = testObject.returnStartTime(6);
		
		//Assert
		assertEquals(6, actual);
	}

}
