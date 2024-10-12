package BillAmount;
import java.util.Scanner;
import java.util.Stack;
public class BillAmount {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("What is the bill amount? $");
	double billAmount = input.nextDouble();
			
	System.out.println("How many adult men?");
	double numAdultMen = input.nextDouble();
			
	System.out.println("How many adult women?");
	double numAudltWomen = input.nextDouble();
			
	System.out.println("How many childrens?");
	double numChildrens = input.nextDouble();

	int numAdultMen1 = 4;
	int numAdultWomen = 3;
	int numChildren = 5;
	double costPerAdultMan = billAmount / (numAdultMen1 * 4 + (numAdultWomen * 3) + (numChildren *5));

	int $185 = 0;
	int costPerChild = $185;
	double totalChildren = costPerChild * numChildren;

	int $592 = 0;
	int totalAdultMen =  $592;
	int $222 = 0;
	int totalAdultWomen = $222;
	double subtotal = totalAdultMen + totalAdultWomen + totalChildren;
			
	System.out.println("Total $" + (totalAdultMen + totalAdultWomen + totalChildren));
	System.out.println("Subtotal for Adult Men: $" + totalAdultMen);
	System.out.println("Subtotal for Adult Women: $" + totalAdultWomen);
	String totalChildrens = null;
	System.out.println("Subtotal for Childrens: $" + totalChildrens);
	System.out.println("Amount Paid: $ + billAmount");		
	input.close();
	}
}
