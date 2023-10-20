package abstraction;

public abstract class GetInformation {
	static final int DIPLOMA = 1;
	static final int BACHELOR = 2;
	static final int MASTER = 3;

	public abstract void showSchoolList();

	public abstract void showTuitionFee(int schoolChoice);

	public static GetInformation degreeInformation(int degreeLevel) {
		switch (degreeLevel) {
		case (DIPLOMA):
			return new Diploma();
		case (BACHELOR):
			return new Bachelor();
		case (MASTER):
			return new Master();
		default:
			return null;
		}
	}
}
