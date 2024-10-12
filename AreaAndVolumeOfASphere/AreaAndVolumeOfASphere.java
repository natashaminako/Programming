package AreaAndVolumeOfASphere;
import java.util.Scanner;
public class AreaAndVolumeOfASphere {
	public static void main(String []args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter to receive the radius of a sphere");
	double radius = input.nextDouble();
	double volume = (4.0/3.0) * Math.PI * Math.pow(radius,3);

	System.out.println("Volume of a sphere is: " + volume);
	double area = 4 * Math.PI + Math.pow(radius,2);

	System.out.println(" Area of a sphere is: " + area);
	}
}