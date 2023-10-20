package abstraction;

import java.util.Scanner;

public class Main {
	static final int DIPLOMA = 1;
	static final int BACHELOR = 2;
	static final int MASTER = 3;
	static final int SCHOOL_LIST = 1;
	static final int TUITION_FEE = 2;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int degreeChoice = degreeListMenu();
		int menuChoice = schoolListOrFee();

		GetInformation degreeLevel = GetInformation.degreeInformation(degreeChoice);

		switch (menuChoice) {
		case SCHOOL_LIST:
			degreeLevel.showSchoolList();
		case TUITION_FEE:
			System.out.println("Which school do you want to know the tuition fee? ");
			int schoolChoiceForFee = scanner.nextInt();
			degreeLevel.showTuitionFee(schoolChoiceForFee);
			break;
		default:
			System.out.println("Wrong choice! Try again!");
		}
	}

	public static int degreeListMenu() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please choose the education level you want to study: ");
		System.out.println("1. Diploma Degree ");
		System.out.println("2. Bachelor Degree ");
		System.out.println("3. Master Degree ");
		int degreeChoice = scanner.nextInt();
		return degreeChoice;
	}

	public static int schoolListOrFee() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("What do you want to know?");
		System.out.println("1. Show all school list ");
		System.out.println("2. Show tuition fee ");
		int schoolListOrFee = scanner.nextInt();
		return schoolListOrFee;
	}

}
