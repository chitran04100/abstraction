package abstraction;

public class Master extends GetInformation {
	private static final int MELBOURNE_UNI = 1;
	private static final int SYDNEY_UNI = 2;
	private static final int RMIT = 3;

	int tuitionFee;

	@Override
	public void showSchoolList() {
		System.out.println("List of school provides bachelor degree in IT:");
		System.out.println("1. Melbourne University");
		System.out.println("2. Sydney University");
		System.out.println("3. RMIT");
	}

	@Override
	public void showTuitionFee(int schoolChoice) {
		switch (schoolChoice) {
		case (MELBOURNE_UNI):
			tuitionFee = 166452;
		case (SYDNEY_UNI):
			tuitionFee = 50500;
		case (RMIT):
			tuitionFee = 80000;
		default:
			System.out.println("Wrong option, please choose again!");
		}
		System.out.println("Tuition fee is $AUD " + tuitionFee);
	}

}
