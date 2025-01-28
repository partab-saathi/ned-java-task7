/*Q2. Check Alphabet or Not
Input a single character and check if it is an alphabet (A-Z or a-z). If not, display "Not an alphabet. */
import java.util.Scanner;

public class Q2 {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a string: ");
        char input = obj.next().charAt(0);
        if ((input >= 'a' && input <= 'z')) {
            System.out.println("It's an alphabet");
        } else if ((input >= 'A' && input <= 'Z')) {
            System.out.println("It's an alphabet");
        } else {
            System.out.println("Not an alphabet.");
        }
    }
}
