public class CWM_LogicalOperators {
    public static void main(String[] args) {
        System.out.println("For Logical AND....");
        boolean a = true;
        boolean b = false;
        boolean c = false;
        if (a && b && c ) {
            System.out.println("Y");
        } else {
            System.out.println("N");
        }


        System.out.println("For Logical OR....");
        if (a || b || c ) {
            System.out.println("Y");
        } else {
            System.out.println("N");
        }


        System.out.println("For Logical NOT....");
        System.out.println("Not(A) is");
        System.out.println(!a);
        System.out.println("Not(B) is");
        System.out.println(!b);

    }
}
