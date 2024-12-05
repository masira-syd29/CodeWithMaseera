import java.sql.SQLOutput;
import java.util.*;

public class CWM_PracticeSet04 {
    public static void main(String[] args) {

        //problem01
        /*byte m1, m2, m3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks in physics");
        m1 = sc.nextByte();

        System.out.println("Enter your marks in Chemistry");
        m2 = sc.nextByte();

        System.out.println("Enter your marks in Mathematics");
        m3 = sc.nextByte();
        float avg = (m1+m2+m3)/3.0f;
        System.out.println("Overall percentage is : "+ avg);

        if(avg>40 && m1>=33 && m2>=33 && m3>=33) {
            System.out.println("Congratulations you have been promoted");
        } else {
            System.out.println("Sorry you have not been promoted");
        } */

        //problem02
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter your income in lacs:");
        float tax = 0;
        float income = sc.nextFloat();
        if(income<2.5) {
            tax = tax + 0;
        }
        else if(income>2.5f && income<=5.0f) {
            tax = tax + 0.05f * (income - 2.5f);
        }
        else if(income>5.0f && income<=10.0f) {
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.05f * (income - 5.0f);
        }
        else if(income>10.0f) {
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.02f * (10.0f - 5.0f);
            tax = tax + 0.03f * (income - 10.0f);
        }
        System.out.println("The total tax paid by the employee is: " + tax);
         */


        //Problem03
        /*Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        switch(day) {
            case 1 -> System.out.println("Sunday");
            case 2 -> System.out.println("Monday");
            case 3 -> System.out.println("Tuesday");
            case 4 -> System.out.println("Wednesday");
            case 5 -> System.out.println("Thursday");
            case 6 -> System.out.println("Friday");
            case 7 -> System.out.println("Saturday");

        }
         */

        //Problem05
        /*Scanner sc = new Scanner(System.in);
        String website = sc.next();
        if(website.endsWith(".org")) {
            System.out.println("This is an Organisational website.");
        }
        else if(website.endsWith(".com")) {
            System.out.println("This is a commercial website.");
        }
        else if(website.endsWith(".in")) {
            System.out.println("This is an Indian website.");
        }

         */

        //Problem05
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your year");
        int year = sc.nextInt();

        if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + "This is a leap year");
        } else {
            System.out.println(year+"This is not a leap year");
        }

    }
}
