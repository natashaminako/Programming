package MinutesAndSeconds;
import java.util.Scanner;
public class MinutesAndSeconds {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter the first number:");
	int hour = input.nextInt();
	int minutes = hour * 60;
	int seconds = hour * 3600;
	
	System.out.println(hour + " hours is equivalent to " + minutes + " minutes and " + seconds + " seconds.");
	input.close();
	}
}
