package AreaCalculation;
import java.util.Scanner;
public class AreaCalculation {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int option = -1;

	while (option != 0) {
	System.out.println("----------------------------------------------- MENU OF OPTIONS -----------------------------------------------");
	System.out.println("Choose an option: ");
	System.out.println("1 - Square");
	System.out.println("2 - Circle");
	System.out.println("3 - Triangle");
	System.out.println("0 - Exit");
	System.out.print("Option: ");
	option = input.nextInt();

	if (option == 1) {
	System.out.print("Enter the length of the side of the square: ");
	double side = input.nextDouble();
	double areaSquare = side * side;
	System.out.println("The area of the square is: " + areaSquare);

	} else if (option == 2) {
	System.out.print("Enter the radius of the circle: ");
	double radius = input.nextDouble();
	double areaCircle = Math.PI * radius * radius;
	System.out.println("The area of the circle is: " + areaCircle);

	} else if (option == 3) {
	System.out.print("Enter the base of the triangle: ");
	double baseTriangle = input.nextDouble();
 	System.out.print("Enter the height of the triangle: ");
	double heightTriangle = input.nextDouble();
	double areaTriangle = (baseTriangle * heightTriangle) / 2;
	System.out.println("The area of the triangle is: " + areaTriangle);

	} else if (option != 0) {
	System.out.println("You have entered an invalid option!");
	}
	}

	System.out.println("Exiting...");
	input.close();
	}
}