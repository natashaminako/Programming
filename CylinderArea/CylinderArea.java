package CylinderArea;
import java.util.Scanner;
public class CylinderArea {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Provide the radius (r) of the base and the height (h) of the cylinder.");
	double radius = input.nextDouble();

	System.out.println("Provide the height (h) of the cylinder.");
	double height = input.nextDouble();

	double volume = Math.PI * radius * height;
	System.out.println("The volume of the cylinder is " + height);
	}
}
