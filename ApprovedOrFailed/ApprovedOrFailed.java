package ApprovedOrFailed;
import java.util.Scanner;
public class ApprovedOrFailed {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter the indicator for the first assessment (A, B, or C): ");
	String assessment1 = input.nextLine();
	System.out.println("Enter the indicator for the second assessment (A, B, or C): ");
	String assessment2 = input.nextLine();
	System.out.println("Enter the attendance percentage: ");
	double attendance = input.nextDouble();
			    
	if (attendance < 75) {
			System.out.println("FAILED (Insufficient attendance)");
	} else if ((assessment1.equals("A") && assessment2.equals("A")) || 
	(assessment1.equals("A") && assessment2.equals("B")) || 
	(assessment1.equals("B") && assessment2.equals("A")) || 
	(assessment1.equals("B") && assessment2.equals("B"))) {

	System.out.println("PASSED");
	} else if (assessment1.equals("C") || assessment2.equals("C")) {
		
	System.out.println("Enter the indicator for the final assessment (A, B, or C): ");
	String finalAssessment = input.next();
	if (finalAssessment.equals("A") || finalAssessment.equals("B")) {
		
	System.out.println("PASSED IN FINAL");
	} else {
		
	System.out.println("FAILED (Final assessment with indicator C)");
	}
	} else {
		
	System.out.println("FAILED");
	}
	input.close();
	}
}