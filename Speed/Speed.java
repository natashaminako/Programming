package Speed;
import java.util.Scanner;
public class Speed {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter the car speed (km/h):");
	double speed = input.nextDouble();
	if (speed <= 75) {
	
	System.out.println("Go");
	} else if (speed <= 80) {
	System.out.println("Attention");
	} else {
	
	System.out.println("Stop");
	}
	input.close();
	}
}