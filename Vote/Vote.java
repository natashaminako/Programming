package Vote;
import java.time.Year;
import java.util.Scanner;
public class Vote {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your birth year: ");
        int birthYear = input.nextInt();
        int currentYear = Year.now().getValue();

        if (birthYear > currentYear) {
        System.out.println("Invalid birth year. You cannot be born in the future!");
        } else {

        String voteMessage;
        voteMessage = getString(currentYear, birthYear);

        System.out.println(voteMessage);
        input.close();
        }
        }

        private static String getString(int currentYear, int birthYear) {
        int age = currentYear - birthYear;

        String voteMessage;

        if (age < 16) {
        voteMessage = "Cannot vote.";
        } else if (age < 18 || age > 70) {
        voteMessage = "You are " + age + " years old. Voting is optional for you.";
        if (age < 18) {
        voteMessage += " You can choose to vote or not.";
        } else {
        voteMessage += " For people over 70, voting is also optional.";
        }
        } else {
        voteMessage = "You are " + age + " years old. Voting is mandatory!";
        }
        return voteMessage;
        }
}
