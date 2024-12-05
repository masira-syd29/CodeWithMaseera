import java.util.Date;

public class CWM_DateClass {
    public static void main(String[] args) {
//        System.out.println(Long.MAX_VALUE); //it's safe to store the value in a long type variable
//        System.out.println(System.currentTimeMillis());
        Date d = new Date();
        System.out.println(d);
        System.out.println(d.getTime());
        System.out.println(d.getDate());
        System.out.println(d.getSeconds());
        System.out.println(d.getDay());
        System.out.println(d.getYear());
    }
}
