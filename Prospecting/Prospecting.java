package Prospecting;
import java.util.Scanner;
public class Prospecting {
			public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			int option = -1;

			while (option != 0) {
			System.out.println("----------------------------------------------- MENU OF OPTIONS -----------------------------------------------");
			System.out.println("Choose an option: ");
			System.out.println("1 - Arithmetic Mean");
			System.out.println("2 - Weighted Mean");
			System.out.println("0 - Exit");
			System.out.print("Option: ");
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

			} else if (option != 0) {
			System.out.println("You have entered an invalid option!");
			}
			}

			System.out.println("Exiting...");
			scanner.close();
			}
}