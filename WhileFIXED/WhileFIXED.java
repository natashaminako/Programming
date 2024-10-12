package WhileFIXED;
import java.util.Scanner;
public class WhileFIXED {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int registrationNumber;
	double hoursWorked, salary;
	do {
     
	System.out.print("Enter the registration number (999 to exit): ");
	registrationNumber = input.nextInt();

	if (registrationNumber >= 1000 && registrationNumber <= 1999) {
	
	System.out.print("Enter the hours worked: ");
	hoursWorked = input.nextDouble();

	if (hoursWorked < 0) {
	
	System.out.println("Hours worked cannot be negative!");
    
	} else {
	salary = hoursWorked * 15;
    
	System.out.printf("Salary: $%.2f%n", salary);
	}
    
	} else if (registrationNumber != 999) {
	
	System.out.println("Invalid registration number!");
	}
    
	} while (registrationNumber != 999);
	System.out.println("End of the program.");
	}
}