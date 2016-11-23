package kata_babysitter;

import org.junit.Test;

public class Babysitter_Test {
	
	@Test
	public void shouldReturnStartTime(){
		
		//Arrange
		Babysitter testObject = new Babysitter();
		
		//Act
		actual = testObject.returnStartTime(6);
		
		//Assert
		assertEquals(6, actual);
	}

}
