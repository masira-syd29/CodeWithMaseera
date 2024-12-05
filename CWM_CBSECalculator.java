import java.util.*;

public class CWM_CBSECalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks of English: ");
        int eng = sc.nextInt();
        System.out.print("Enter marks of Maths: ");
        int maths = sc.nextInt();
        System.out.print("Enter marks of Geography: ");
        int geo = sc.nextInt();
        System.out.print("Enter marks of History: ");
        int history = sc.nextInt();
        System.out.print("Enter marks of Science: ");
        int sci = sc.nextInt();
        float percentage = (float)(eng + maths + geo + history + sci)/500*100;
        System.out.println("The percentage is "+percentage+"%");
    }
}
