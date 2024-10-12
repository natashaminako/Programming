package BMIBodyMassIndex;
import java.util.Scanner;
public class BMIBodyMassIndex {
	public void main(String []args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter your weight?");
	double weight = input.nextDouble();
			
	System.out.println("Enter your height?");
	double height =  input.nextDouble();
			
	System.out.println(" Your BMI is: +bmi");
	double BMI = weight / (height * height);
	input.close();
	}
}
