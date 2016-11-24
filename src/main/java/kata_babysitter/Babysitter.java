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

	public boolean validateEndTime(int endTime, int startTime) {
		if (convertTime(endTime) > convertTime(startTime)) {
			return true;
		} else
			return false;

	}

	public boolean validateBedTime(int bedTime, int startTime, int endTime) {
		if (convertTime(startTime) <= convertTime(bedTime) && convertTime(bedTime) <= convertTime(endTime)) {
			return true;
		} else
			return false;
	}

	public int calculateMidnightShiftHours(int endTime) {
		if (convertTime(endTime) > convertTime(12)) {
			int midnightShiftHours = 0;
			midnightShiftHours = convertTime(endTime) - convertTime(12);
			return midnightShiftHours;
		} else
			return 0;
	}

	public int calculateBedtimeShiftHours(int bedTime, int startTime, int endTime) {
		if (convertTime(startTime) < convertTime(12)) {
			int bedtimeShiftHours = 0;
			bedtimeShiftHours = convertTime(12) - convertTime(bedTime);
			return bedtimeShiftHours;
		} else
			return 0;

	}

	public int calculateRegularShiftHours(int startTime, int endTime, int bedTime) {
		if (convertTime(bedTime) >= convertTime(12)){
			return convertTime(12) - convertTime(startTime);
		}else
		if (convertTime(bedTime) < convertTime(12)) {
			return convertTime(bedTime) - convertTime(startTime);
		} else
			return 0;
	}
}
