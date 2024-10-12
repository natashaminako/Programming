package Odometer;
import java.util.Scanner;
public class Odometer {
	public static void main(String []args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter the initial odometer value:");
	int initial = input.nextInt();
	
	System.out.println("Enter the final odometer value:");
	int finalPos = input.nextInt();
	
	System.out.println("Enter the time traveled in minutes:");
	int traveledMinutes = input.nextInt();
	
	double distanceTraveled = finalPos - initial;
	double hoursTraveled = traveledMinutes / 60.00;
	double averageSpeed = distanceTraveled / hoursTraveled;
    
	System.out.println("Distance Traveled: " + distanceTraveled + " km");
	System.out.println("Time Traveled: " + hoursTraveled + " hours");
	System.out.println("The average speed of the car was " + averageSpeed + " km/h");
	input.close();
	}
}