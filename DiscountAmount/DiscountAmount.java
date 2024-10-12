package DiscountAmount;
import java.util.Scanner;
public class DiscountAmount {
	public static void main(String []args) {
	Scanner input = new Scanner(System.in);	
	System.out.println("Enter the original amount");
	double originalAmount = input.nextDouble();	
	double discountAmount;
	if (originalAmount > 1000) {
	discountAmount = originalAmount * 0.9;
	} else {
	discountAmount = originalAmount;
	}
		
	System.out.println("The discounted amount is: $" + discountAmount);
	System.out.println("Thank you for your purchase!");
	input.close();
	}
}