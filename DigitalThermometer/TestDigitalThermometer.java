package DigitalThermometer;
import java.util.Scanner;
public class TestDigitalThermometer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Serial Number: ");
        String serialNumber = input.next();

        System.out.println("Type (single character): ");
        char type = input.next().charAt(0);

        System.out.println("Temperature: ");

        DigitalThermometer dt = new DigitalThermometer(serialNumber, type);

        System.out.println("Serial Number: " + dt.getSerialNumber());
        System.out.println("Type: " + dt.getType());
        System.out.println("Temperature: " + dt.getTemperature());
        System.out.println("Diagnosis: " + dt.getDiagnosis());

        System.out.println("New Type: ");
        char newType = input.next().charAt(0);

        dt.hurtTemperature(38.5);
        System.out.println("Diagnosis: " + dt.getDiagnosis());

        input.close();
    }
}
