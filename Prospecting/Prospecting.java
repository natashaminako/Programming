package Prospecting;
import java.util.Scanner;
public class Prospecting {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int option;

	do {
        System.out.println("---------------------------------------------- MENU ----------------------------------------------");
        System.out.println("Choose an option: ");
        System.out.println("1 - Media Arithmetic");
        System.out.println("2 - Weighted mean");
        System.out.println("0 - End");

        option = scanner.nextInt();

        if (option == 1) {
	System.out.print("Enter the first note: ");
	double note1 = scanner.nextDouble();
	System.out.print("Enter the second note: ");
  	double note2 = scanner.nextDouble();

	double arithmeticMean = (note1 + note2) / 2;
	System.out.printf("Arithmetic mean: %.2f%n", arithmeticMean);
	} else if (option == 2) {
	System.out.print("Enter first grade: ");
	double grade1 = scanner.nextDouble();
	System.out.print("Enter second grade: ");
	double grade2 = scanner.nextDouble();

	double weightedAverage = (grade1 * 3 + grade2 * 7) / 10;
	System.out.printf("Weighted Average: %.2f%n", weightedAverage);
	} else if (option == 0) {
	System.out.println("Closing...");
	} else {
	System.out.println("Invalid option!");
        }

	if (option != 0) {
	System.out.print("Do you want to perform another calculation? (yes/no): ");
	String continueOption = scanner.next();
	if (continueOption.equalsIgnoreCase("no")) {
	option = 0;
	}
	}

	} while (option != 0);

	scanner.close();
	}
}
