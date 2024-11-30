package PowerCalculator;
import java.util.Scanner;
public class PowerCalculator {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("Electric Power Calculator");
	double electricPower = input.nextDouble();

	System.out.print("Enter the voltage (in volts): ");
	double voltage = input.nextDouble();

	System.out.print("Enter the resistance (in ohms): ");
	double resistance = input.nextDouble();

	if (resistance <= 0) {
	System.out.print("Error: Resistance must be greater than zero.");
	} else {
	double power = (voltage * voltage) / resistance;

	System.out.printf("The electric power is %.2f watts.%n", power);
	}
	input.close();
	}
}
