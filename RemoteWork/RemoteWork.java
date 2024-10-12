package RemoteWork;
import java.util.Scanner;
public class RemoteWork {
	public static void main(String []args) {
	Scanner input = new Scanner(System.in);
	int daysRemoteWork = 0;
	double totalReimbursementAmount = 0;
	for (int i = 0; i < 5; i++) {
            
	System.out.print("Enter the minimum expected temperature for day " + (i + 1) + ": ");
	int minimumTemperature = input.nextInt();
	if (minimumTemperature < 0) {
	daysRemoteWork++;
	totalReimbursementAmount += 80 * 2.0;
	}
	}
        
	System.out.println("Days with remote work: " + daysRemoteWork);
	System.out.println("Total reimbursement amount: R$ " + totalReimbursementAmount);
	input.close();
	}
}
