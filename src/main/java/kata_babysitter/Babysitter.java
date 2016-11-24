package kata_babysitter;

public class Babysitter {

	private int regularPayRate = 12;
	private int bedtimePayRate = 8;
	private int midnightPayRate = 16;

	public static void main(String[] args) {

	}

	// (Post-completion refactoring)
	// Methods to simply return the input times are not needed for completion of
	// the kata.
	/*
	 * public int returnStartTime(int startTime) { return startTime; }
	 * 
	 * public int returnEndTime(int endTime) {
	 * 
	 * return endTime; }
	 * 
	 * public int returnBedTime(int bedTime) {
	 * 
	 * return bedTime; }
	 */

	public int convertTime(int inputTime) {

		if (inputTime <= 12 && inputTime >= 5) {
			return inputTime - 5;
		} else
			return inputTime + 7;

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
			return convertTime(endTime) - convertTime(12);
		} else
			return 0;

	}

	public int calculateBedtimeShiftHours(int startTime, int endTime, int bedTime) {

		if (convertTime(startTime) < convertTime(12)) {
			return convertTime(12) - convertTime(bedTime);
		} else
			return 0;

	}

	public int calculateRegularShiftHours(int startTime, int endTime, int bedTime) {

		if (convertTime(bedTime) >= convertTime(12)) {
			return convertTime(12) - convertTime(startTime);
		} else if (convertTime(bedTime) < convertTime(12)) {
			return convertTime(bedTime) - convertTime(startTime);
		} else
			return 0;

	}

	public int calculateTotalPay(int startTime, int bedTime, int endTime) {

		return (calculateRegularShiftHours(startTime, endTime, bedTime) * regularPayRate)
				+ (calculateBedtimeShiftHours(startTime, endTime, bedTime) * bedtimePayRate)
				+ (calculateMidnightShiftHours(endTime) * midnightPayRate);

	}

}
