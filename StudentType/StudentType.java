package StudentType;
import java.util.Scanner;
public class StudentType {
	public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	System.out.println("Enter the number of subjects failed:");
    	int failedSubjects = input.nextInt();

    	System.out.println("Enter the type of student: N-normal or B-scholarship holder:");
    	String studentType = input.next();
    	while (!studentType.equals("N") && !studentType.equals("B")) {
        
    	System.out.println("Invalid student type. Check if it's N for normal or B for scholarship holder.");
    	studentType = input.next();
    	}
    	double monthlyFee = 600.0;
    	int discount;
    	if (studentType.equals("B")) {
    	double scholarshipDiscount = 0.3;
    	discount = (int) ((monthlyFee - (failedSubjects * 50.0)) * scholarshipDiscount);
    	} else {
    	discount = (int) (failedSubjects * 50.0); 
    	}
    	double finalFee = monthlyFee - discount;
        
    	System.out.println("The value of the monthly fee is: " + finalFee);
    	}
}
