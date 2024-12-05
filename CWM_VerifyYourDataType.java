import java.util.Scanner;

public class CWM_VerifyYourDataType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter your number: ");

        // Check and print whether the input is an integer, double, or float
        if (sc.hasNextInt()) {
            System.out.println("The input is of type Integer.");
        } else if (sc.hasNextDouble()) {
            System.out.println("The input is of type Double.");
        } else if (sc.hasNextFloat()) {
            System.out.println("The input is of type Float.");
        } else {
            System.out.println("The input is of another type or invalid.");
        }

        // Close the scanner
        sc.close();
    }
}
