package abstraction;

public class Diploma extends GetInformation {

	private static final int LATROBE_UNI = 1;
	private static final int VIC_UNI = 2;
	private static final int KAPLAN = 3;

	int tuitionFee;

	@Override
	public void showSchoolList() {
		System.out.println("List of school provides diploma certification in IT:");
		System.out.println("1. La Trobe University");
		System.out.println("2. Victoria University");
		System.out.println("3. Kaplan Business School Melbourne");
	}

	@Override
	public void showTuitionFee(int schoolChoice) {
		switch (schoolChoice) {
		case (LATROBE_UNI):
			tuitionFee = 9371;
			break;
		case (VIC_UNI):
			tuitionFee = 14900;
			break;
		case (KAPLAN):
			tuitionFee = 10100;
			break;
		default:
			System.out.println("Wrong option, please choose again!");
		}
		System.out.println("Tuition fee is $AUD " + tuitionFee);
	}
}
