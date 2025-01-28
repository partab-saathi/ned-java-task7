/*Q5. Check for Special Character
Accept a character as input and check whether it is a special character (anything other than alphabets and digits). */
import java.util.Scanner;

public class Q5 {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter here single character: ");
        char input = obj.next().charAt(0);
        if ((input >= 'a' && input <= 'z')) {
            System.out.println("It's an alphabet");
        } else if ((input >= '0' && input <= '9')) {
            System.out.println("It's a number.");
        } else {
            System.out.println("It's a Special Character");
        }
    }
}
