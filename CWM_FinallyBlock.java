public class CWM_FinallyBlock {
    public static int greet(){
        try {
            int a = 50;
            int b = 10;
            int c = a/b;
            return c;
        }
        catch (Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("Cleaning up resources ...This is the end of the program");
        }
        return -1;
    }
    public static void main(String[] args) {
       int k = greet();
        System.out.println(k);
        int a = 7;
        int b = 9;
        while (true){
            try {
                System.out.println(a/b);
            }
            catch (Exception e){
                System.out.println(e);
                break;
            }
            finally {
                System.out.println("I am finally " +b);
            }
            b--;
        }
        try{
            System.out.println(10/5);
        }
        finally {
            System.out.println("yes this is finally");
        }
    }
}