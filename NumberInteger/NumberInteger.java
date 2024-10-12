package NumberInteger;
import java.util.Scanner;
public class NumberInteger {
	public static void main(String []args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter the integer: ");
	int number = input.nextInt();
	for (int i = 1; i <= number; i++) {
	
	System.out.println(i + " ");
	}

	System.out.println();
	input.close();
	}
}