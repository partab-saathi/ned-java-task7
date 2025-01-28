/*Q6. Character Category
Accept a character and check if it is:
Uppercase letter.
Lowercase letter.
Digit.
Special character. */
import java.util.Scanner;

public class Q6 {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a string: ");
        char input = obj.next().charAt(0);
        if ((input >= 'a' && input <= 'z')) {
            System.out.println("It's a Lowercase letter");
        } else if ((input >= 'A' && input <= 'Z')) {
            System.out.println("It's a Uppercase letter");
        } else if ((input >= '0' && input <= '9')) {
            System.out.println("It's a Digit.");
        } else {
            System.out.println("It's a Special Character");
        }
    }
}
