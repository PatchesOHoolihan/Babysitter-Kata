package kata_babysitter;

public class Babysitter {

	public static void main(String[] args) {

	}

	public int returnStartTime(int startTime) {
		return startTime;
	}

	public int returnEndTime(int endTime) {

		return endTime;
	}

	public int returnBedTime(int bedTime) {

		return bedTime;
	}

	public int convertTime(int inputTime) {

		int convertedTime = 0;

		if (inputTime <= 12 && inputTime >= 5) {
			convertedTime = inputTime - 5;
		} else if (inputTime >= 1 && inputTime <= 4) {
			convertedTime = inputTime + 7;
		}

		return convertedTime;
	}

	public boolean validateStartTime(int startTime) {

		if (convertTime(startTime) < 11) {
			return true;
		} else
			return false;
	}

}
