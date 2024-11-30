package Distances;
import java.util.Scanner;
public class Distances {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("Enter the coordinates of the first point: ");
	double coordinates = input.nextDouble();

	System.out.print("X1: ");
	double x1 = input.nextDouble();

	System.out.print("Y1: ");
	double y1 = input.nextDouble();

	System.out.print("Z1: ");
	double z1 = input.nextDouble();

	System.out.print("Enter the coordinates of the second point: ");

	System.out.print("X2: ");
	double x2 = input.nextDouble();

	System.out.print("Y2: ");
	double y2 = input.nextDouble();

	System.out.print("Z2: ");
	double z2 = input.nextDouble();

	double distance = Math.sqrt(
	Math.pow(x2 - x1, 2) +
	Math.pow(y2 - y1, 2) +
	Math.pow(z2 - z1, 2)
	);

	System.out.printf("The distance between the two points in 3D space is: %.2f%n", distance);

	input.close();
	}
}
