package BillAmount;
import java.util.Scanner;
public class BillAmount {
	public static void main(String[]args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter the total bill amount:");
	double totalBillAmount = input.nextDouble();
	
	int numberOfAdultMen = 4;
	int numberOfAdultWomen = 3;
	int numberOfChildren = 5;
	int totalPeople = 12;
	double amountPerPerson = totalBillAmount / totalPeople;
	double amountForAdultMen = amountPerPerson * numberOfAdultMen;
	double amountForAdultWomen = amountPerPerson * numberOfAdultWomen;
	double amountForChildren = amountPerPerson * numberOfChildren;
	
	System.out.println("Amount for Adult Me: " + amountForAdultMen);
	System.out.println("Amount for Adult Women: " + amountForAdultWomen);
	System.out.println("Amount for Children: " + amountForChildren);
	input.close();
	}
}