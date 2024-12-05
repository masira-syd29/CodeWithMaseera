public class CWM_TryCatch {
    public static void main(String[] args) {
        int a= 6000;
        int b = 0;

        //without try
        //int c = a/b;

        //with try catch
        try {
           int c = a/b;
            System.out.println("Result is: "+ c);
        } catch (Exception e) {
            System.out.println("we failed to divide, reason: ");
            System.out.println(e);
        }
        System.out.println("End of the program");
    }
}
