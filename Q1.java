/*Q1. Check First Character of String
Input a string and check the first character:
If it's a vowel.
If it's a consonant.
If it’s something else. */
import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a string: ");
        char input = obj.next().charAt(0);
        if (input == 'a' || input == 'e' || input == 'i' || input == 'o' || input == 'u') {
            System.out.println("First letter is a Vowel.");
        } else if ((input >= 'a' && input <= 'z')) {
            System.out.println("First letter is a consonant.");
        } else {
            System.out.println("It's something else.");
        }
    }
}
