import java.util.*;

public class CWM_ElseIf {
    public static void main(String[] args) {
        int var;
        System.out.println("Enter your age");
        Scanner  sc = new Scanner(System.in);
        var = sc.nextInt();
        switch (var) {
            //enhanced switch does not need break
            case 18 -> System.out.println("You are going to become an Adult");
            case 23 -> System.out.println("You are going to take up a job");
            case 60 -> System.out.println("You are going to get retired");
            default -> System.out.println("Enjoy your life!");
        }

        /*
         int age;
        System.out.println("Enter your age");
        Scanner  sc = new Scanner(System.in);
        age = sc.nextInt();if(age>56) {
            System.out.println("You are experienced");
        } else if (age>46) {
            System.out.println("You are semi experienced");
        } else if (age>36) {
            System.out.println("You are semi-semi experienced");
        } else {
            System.out.println("You are not experienced");
        } */

    }
}
