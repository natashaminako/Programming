package CompareWords;
import java.util.Scanner;
public class CompareWords {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("Enter the first word: ");
	String firstWord = input.nextLine();

	System.out.print("Enter the second word: ");
  	String secondWord = input.nextLine();

	if (firstWord.equals(secondWord)) {
	System.out.println("The words are the same.");
	} else {
	System.out.println("The words are different.");
	}

	input.close();
	}
}