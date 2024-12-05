class NegativeRadiusException extends Exception{
    @Override
    public  String toString(){
        return "Radius cannot be Negative()";
    }
    @Override
    public String getMessage(){
        return "Radius cannot be Negative()";
    }
}
public class CWM_ThrowAndThrows {
    public static double area(int r) throws NegativeRadiusException{
        if(r<0){
            throw new NegativeRadiusException();
        }
        double result = Math.PI * r * r;
        return result;
    }
    public static int divide(int a, int b) throws ArithmeticException{
        //made by maseera
        int result = a/b;
        return result;
    }
    public static void main(String[] args) {
       // uses divide function created by harry
        try {
//            int c = divide(30,6);
//            System.out.println(c);
            double ar = area(6);
            System.out.println(ar);

        } //catch (ArithmeticException e)
        catch (Exception e) {
            System.out.println("Exception");
        }
//        double ar = area(6);
    }
}
