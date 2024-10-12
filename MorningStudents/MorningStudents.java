package MorningStudents;
import java.util.Scanner;
public class MorningStudents {
	public static void main(String []args) {
        Scanner input = new Scanner(System.in);
        int numStudents = 7;
        int morningStudents = 0;
        int nightStudents = 0;
        double morningRevenue = 0;
        double nightRevenue = 0;
        for (int i = 0; i < numStudents; i++) {
        
        System.out.println("Enter the student's shift " + (i+1) + ": (M for morning, N for night)");
        String shift = input.nextLine();
        while (!(shift.equals("M") || shift.equals("N"))) {
        
        System.out.println("Invalid shift. Enter M for morning or N for night.");
        shift = input.nextLine();
        }
        
        if (shift.equals("M")) {
        morningStudents++;
        morningRevenue += 400;
        
        } else if (shift.equals("N")) {
        nightStudents++;
        nightRevenue += 500;
        } 
        }
        
        System.out.println("Number of students in shift M: " + morningStudents);
        System.out.println("Number of students in shift N: " + nightStudents);
        System.out.println("Amount collected from type M: R$" + morningRevenue);
        System.out.println("Amount collected from type N: R$" + nightRevenue);
    	}
}