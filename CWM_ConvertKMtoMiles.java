import java.util.*;
public class CWM_ConvertKMtoMiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Kilometers");
        double km = sc.nextInt();
        double conversionFactor = 0.621371;
        double miles = km * conversionFactor;
        System.out.println(km+"km is equals to "+miles+"miles");

    }
}
