package RetirementTime;
import java.util.Scanner;
import java.time.LocalDate;
public class RetirementTime {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.println("Enter your birth month:");
	int birthMonth = input.nextInt();

	System.out.println("Enter your birth year:");
	int birthYear = input.nextInt();

	System.out.println("Enter your years of contribution:");
	int contributionYears = input.nextInt();

	System.out.println("Enter your gender (M/F):");
	char gender = input.next().toUpperCase().charAt(0);

	LocalDate currentDate = LocalDate.now();
	int currentYear = currentDate.getYear();
	int currentMonth = currentDate.getMonthValue();

	int age = currentYear - birthYear;
	if (birthMonth > currentMonth) {
	}

	int points = age + contributionYears;

	boolean canRetire = false;

	if (gender == 'M') {
	if ((age >= 65 && contributionYears >= 35) || (points >= 100 && contributionYears >= 15)) {
	canRetire = true;
	}
	} else if (gender == 'F') {
	if ((age >= 60 && contributionYears >= 30) || (points >= 90 && contributionYears >= 15)) {
	canRetire = true;
            }
	} else {
	System.out.println("Invalid gender! Please enter 'M' for male or 'F' for female.");
	return;
	}

	if (canRetire) {
	System.out.println("You are eligible for retirement!");
	} else {
	System.out.println("You are not eligible for retirement.");
	}

	input.close();
	}
}
