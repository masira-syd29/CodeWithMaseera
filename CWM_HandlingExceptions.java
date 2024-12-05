import java.util.Scanner;

public class CWM_HandlingExceptions {
    public static void main(String[] args) {

        int[] marks = new int[3];
        marks[0] = 8;
        marks[1] = 6;
        marks[2] = 7;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array index: ");
        int ind = sc.nextInt();
        System.out.println("Enter the number you wan to divide the value with: ");
        int number = sc.nextInt();
        try {
            System.out.println("The value at array index entered is: "+marks[ind]);
            System.out.println("The value at array- value/number is: "+marks[ind]/number);
        }
        catch (ArithmeticException e){
            System.out.println("Some exception occurred");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Some exception occurred");
            System.out.println(e);
        }
        catch (Exception e){
            System.out.println("Some other exception occurred");
            System.out.println(e);
        }
    }
}
