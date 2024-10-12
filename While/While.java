package While;
import java.util.Scanner;
public class While {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int registrationNumber;
        double hoursWorked, salary;
        
        do {
            System.out.print("Enter the registration number: ");
            registrationNumber = input.nextInt();
            
        if (registrationNumber >= 1000 && registrationNumber <= 1999) {
                System.out.print("Enter the hours worked: ");
                
                hoursWorked = input.nextDouble();
                salary = hoursWorked * 15;
                
                System.out.println("Salary: $ " + salary);
	} else {
                System.out.println("Invalid registration number!");
        }
	} while (registrationNumber != 999);
	
	System.out.println("End of the program.");
        input.close();
	}
}
