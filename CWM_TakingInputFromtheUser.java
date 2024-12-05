import java.util.*;

public class CWM_TakingInputFromtheUser {
    public static void main(String[] args){
        System.out.println("Taking input from the user....");
        Scanner sc = new Scanner(System.in);
        //System.out.println("Enter number 1");
        //int m = sc.nextInt();
        //System.out.println("Enter number 2");
        //int n = sc.nextInt();
        //int sum = m + n;
        //System.out.println("The sum of the numbers is"+sum);
        boolean b1 = sc.hasNextInt();
        System.out.println(b1);
        String str = sc.next();
        System.out.println(str);
    }
}

