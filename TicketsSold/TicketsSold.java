package TicketsSold;
import java.util.Scanner;
public class TicketsSold {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("Enter the number of tickets available for sale: ");
	int ticketsAvailable = input.nextInt();
	
	System.out.print("Enter the number of tickets remaining after the sale: ");
	int ticketsLeft = input.nextInt();
	
	System.out.print("Enter the ticket price: ");
	double valueTicket = input.nextDouble();
	int ticketsSold = ticketsAvailable - ticketsLeft;
	double valueAccurated = ticketsSold * valueTicket;
	
	System.out.println("Number of tickets sold: " + ticketsSold);
	System.out.println("Revenue from ticket sales: R$ " + valueAccurated);
	ticketsAvailable = ticketsAvailable - ticketsSold;
	
	System.out.println("Number of tickets available: " + ticketsAvailable);
	input.close();
	}
}