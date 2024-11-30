package ReverseSentence;
import java.util.Scanner;
public class ReverseSentence {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.print("Enter a sentence: ");
	String sentence = input.nextLine();

	String reversedSentence = new StringBuilder(sentence).reverse().toString();

	System.out.println("The reversed sentence is: " + reversedSentence);

	input.close();
	}
}
