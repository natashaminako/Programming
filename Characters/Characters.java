package Characters;
import java.util.Scanner;
public class Characters {
	public static void main(String []args) {
	System.out.println("Enter the digit eight characters: ");
        Scanner input = new Scanner(System.in);
        String characters = input.nextLine();
        int vowels = 0;
        int consonants = 0;
        int digits = 0;
        int others = 0;
        for (int i = 0; i < characters.length(); i++) {
        char character = characters.charAt(i);
        if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u' || character == 'A' || character == 'E' || character == 'I' || character == 'O' || character == 'U') {
        vowels++;
        } else if (character >= 'a' && character <= 'z' || character >= 'A' && character <= 'Z') {
                consonants++;
        } else if (character >= '0' && character <= '9') {
                digits++;
        } else {
                others++;
        }
        }
        
        System.out.println("Number of vowels: " + vowels);
        System.out.println("Number of consonants: " + consonants);
        System.out.println("Number of digits: " + digits);
        System.out.println("Number of other characters: " + others);
    	}
}