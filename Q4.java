/*Q4. Digit or Alphabet
Write a program to input a character and check if it is:
A digit (0-9).
An alphabet (A-Z, a-z).
Something else. */
import java.util.Scanner;

public class Q4 {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter here single character: ");
        char input = obj.next().charAt(0);
        if ((input >= 'a' && input <= 'z')) {
            System.out.println("It's an alphabet");
        } else if ((input >= '0' && input <= '9')) {
            System.out.println("It's a number.");
        } else {
            System.out.println("Invalid Input");
        }
    }
}
