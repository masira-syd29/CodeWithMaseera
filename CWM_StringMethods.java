import java.sql.SQLOutput;

public class CWM_StringMethods {
    public static void main(String[] args) {
        String name = "Harry";
        /*int value = name.length();
        System.out.println(value);

        String lstring = name.toLowerCase();
        System.out.println(lstring);

        String nonTrimmedString = "    HARRY";
        System.out.println(nonTrimmedString);
        String trimmedString;
        System.out.println(nonTrimmedString.trim()); */
        System.out.println(name.substring(1));
        System.out.println(name.substring(1,4));
        System.out.println(name.replace('r', 'p'));

    }
}
