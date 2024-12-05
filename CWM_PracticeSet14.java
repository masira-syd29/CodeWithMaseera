//Problem01 Demonstrate syntax logical and runtime errors
//Problem02 Program that prints "haha" during arithmetic exception and "hehe" during an illegal argument exception
//Problem03Programs that allows you to keep accessing an array until a valid index is given if max retries exceed 5 print "Error"
//Problem04 Modify program in Q3 to throw a custom exception if max retries are reached
//Problem05 Wrap the program in Q3 inside a method which throws your custom exception
import java.util.*;
class MythrowCustomException extends Exception {
    //throw
    public MythrowCustomException(String message){
        super(message);
    }
}

public class CWM_PracticeSet14 {
    public static void main(String[] args) {
        //int a = 0  syntax error
        // int age = 78;
        //int yearBorn = 2000-78; logical error
        //System.out.println(6/0); Arithmetic exception


        //Problem2
//        try {
//            int a = 666/0;
//        }
//        catch (IllegalArgumentException e){
//            System.out.println("Haha");
//        }
//        catch (ArithmeticException e){
//            System.out.println("Hehe");
//        }

        //Problem3
//        boolean flag = true;
//        int[] marks = new int[3];
//        marks[0] = 7;
//        marks[1] = 56;
//        marks[2] = 6;
//        Scanner sc = new Scanner(System.in);
//        int index;
//        int i = 0;
//            while (flag && i<5) {
//                try {
//                    System.out.println("Enter the value of index: ");
//                    index = sc.nextInt();
//                    System.out.println("The value of marks[index] is: " + marks[index]);
//                    break;
//                } catch (Exception e) {
//                    System.out.println("Invalid index");
//                    i++;
//                }
//            }
//            if (i >= 5) {
//                System.out.println("Error");
//            }

        //Problem04
        boolean flag = true;
        int[] marks = new int[3];
        marks[0] = 7;
        marks[1] = 56;
        marks[2] = 6;
        Scanner sc = new Scanner(System.in);
        int index;
        int i = 0;
            while (flag && i<5) {
                try {
                    System.out.println("Enter the value of index: ");
                    index = sc.nextInt();
                    System.out.println("The value of marks[index] is: " + marks[index]);
                    //break;
                    flag = false; // Exit loop if valid index is found
                }
                catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Invalid index. Please try again.");
                    i++;
                }
                catch (Exception e) {
                    System.out.println("An unexpected error occurred: " + e.getMessage());
                    i++;
                }

            }
            if (i >= 5) {
                try {
                    throw new MythrowCustomException("Maximum retries reached. Exiting...");
                } catch (MythrowCustomException e) {
                    System.out.println(e.getMessage());
                    e.printStackTrace();

                }
                flag = false;
            }
    }
}
