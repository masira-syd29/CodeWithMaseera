import java.util.Scanner;

class MyException extends Exception{
    @Override
    public  String toString(){
        return "I am toString()";
    }
    @Override
    public String getMessage(){
        return "I am getMessage()";
    }
}

public class CWM_ExceptionClass {
    public static void main(String[] args) {
        int a = 8;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        if(a<99){
            try{
                //throw new MyException();
                throw new ArithmeticException("This is an exception");
            }
            catch (Exception e){
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                System.out.println(e);
                e.printStackTrace();
            }

        }
    }
}
