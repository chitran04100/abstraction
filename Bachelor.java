package abstraction;

public class Bachelor extends GetInformation {
	private static final int TASMANIA_UNI = 1;
	private static final int DARWIN_UNI = 2;
	private static final int FLINDER_UNI = 3;

	int tuitionFee;

	@Override
	public void showSchoolList() {
		System.out.println("List of school provides bachelor degree in IT:");
		System.out.println("1. Tasmania University");
		System.out.println("2. Charles Darwin University");
		System.out.println("3. Flinders University");
	}

	@Override
	public void showTuitionFee(int schoolChoice) {
		switch (schoolChoice) {
		case (TASMANIA_UNI):
			tuitionFee = 112601;
			break;
		case (DARWIN_UNI):
			tuitionFee = 60000;
			break;
		case (FLINDER_UNI):
			tuitionFee = 65000;
			break;
		default:
			System.out.println("Wrong option, please choose again!");
		}
		System.out.println("Tuition fee is $AUD " + tuitionFee);
	}

	
}
