package Grade;
import java.util.Scanner;
public class Grade {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    char averageType;


    do {
    System.out.print("Enter the type of average (A for Arithmetic or P for Weighted): ");
    averageType = input.next().toUpperCase().charAt(0);
    if (averageType != 'A' && averageType != 'P') {
    System.out.print("Invalid average type! Please enter 'A' or 'P'.");
    }
    } while (averageType != 'A' && averageType != 'P');

    double grade1, grade2;


    do {
    System.out.print("Enter the first grade (0 to 10): ");
    while (!input.hasNextDouble()) {
    System.out.print("Invalid input! Please enter a number.");
    input.next();
    }
    grade1 = input.nextDouble();
    if (grade1 < 0 || grade1 > 10) {
    System.out.print("Invalid grade! Enter the first grade (0 to 10).");
    }
    } while (grade1 < 0 || grade1 > 10);


    do {
    System.out.print("Enter the second grade (0 to 10): ");
    while (!input.hasNextDouble()) {
    System.out.print("Invalid input! Please enter a number.");
    input.next();
    }
    grade2 = input.nextDouble();
    if (grade2 < 0 || grade2 > 10) {
    System.out.print("Invalid grade! Enter the second grade (0 to 10).");
    }
    } while (grade2 < 0 || grade2 > 10);

    double weight1, weight2;


    do {
    System.out.print("Enter the weight of the first grade: ");
    while (!input.hasNextDouble()) {
    System.out.print("Invalid weight! Please enter a number.");
    input.next();
    }
    weight1 = input.nextDouble();
    if (weight1 <= 0) {
    System.out.print("Invalid weight! The weight must be greater than 0.");
    }
    } while (weight1 <= 0);


    do {
    System.out.print("Enter the weight of the second grade: ");
    while (!input.hasNextDouble()) {
    System.out.print("Invalid weight! Please enter a number.");
    input.next();
    }
    weight2 = input.nextDouble();
    if (weight2 <= 0) {
    System.out.print("Invalid weight! The weight must be greater than 0.");
    }
    } while (weight2 <= 0);

    double average;


    if (averageType == 'A') {
    average = (grade1 + grade2) / 2;
    System.out.printf("Arithmetic Average: %.2f%n", average);
    } else {
    average = (grade1 * weight1 + grade2 * weight2) / (weight1 + weight2);
    System.out.printf("Weighted Average: %.2f%n", average);
    }

    int courseLoad = 0;
    boolean validEntry = false;


    do {
    System.out.print("Enter the course load (1 for 30 hours or 2 for 60 hours): ");
    if (input.hasNextInt()) {
    courseLoad = input.nextInt();
    if (courseLoad == 1 || courseLoad == 2) {
    validEntry = true;
    } else {
    System.out.println("Invalid course load. Enter 1 for 30 hours or 2 for 60 hours.");
    }
    } else {
    System.out.print("Invalid input. Please enter a number (1 or 2).");
    input.next();
    }
    } while (!validEntry);

    int missedClasses = 0;
    boolean validClassCount = false;


    do {
    System.out.print("Enter the number of classes the student missed: ");
    if (input.hasNextInt()) {
    missedClasses = input.nextInt();
    if (missedClasses >= 0) {
    validClassCount = true;
    } else {
    System.out.print("Invalid! Please enter a number for the number of absences.");
    }
    } else {
    System.out.print("Invalid! Please enter a number for the number of absences.");
    input.next();
    }
    } while (!validClassCount);


    double totalClasses = (courseLoad == 1) ? 30 / 1.5 : (double) 60 / 3;
    double absencePercentage = (double) missedClasses / totalClasses * 100;

    String status = (average >= 6 && absencePercentage <= 25) ? "Approved" : "Failed";


    System.out.printf("Course load: %d hours%n", courseLoad == 1 ? 30 : 60);
    System.out.printf("Number of missed classes: %d%n", missedClasses);
    System.out.printf("Student's average: %.2f%n", average);
    System.out.printf("Absence percentage: %.2f%%%n", absencePercentage);
    System.out.println("Status: " + status);

    input.close();
    }
}
