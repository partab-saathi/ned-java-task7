/*Q3. Uppercase or Lowercase
Accept a character as input and check whether it is an uppercase letter (A-Z) or a lowercase letter (a-z). If not an alphabet, display "Invalid input.
 */
import java.util.Scanner;

public class Q3 {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a string: ");
        char input = obj.next().charAt(0);
        if ((input >= 'a' && input <= 'z')) {
            System.out.println("It's a small letter");
        } else if ((input >= 'A' && input <= 'Z')) {
            System.out.println("It's a capital letter");
        } else {
            System.out.println("Invalid Input");
        }
    }
}
