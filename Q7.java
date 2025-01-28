/*Q7. Check for Whitespace
Accept a character and check if it is a whitespace ( ), tab (\t), or newline (\n). If not, display "Not a whitespace. */
import java.util.Scanner;


public class Q7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char input = scanner.nextLine().charAt(0);
        if (input == ' ' || input == '\t' || input == '\n') {
            System.out.println("It is a whitespace character.");
        } else {
            System.out.println("Not a whitespace.");
        }
    }
}
