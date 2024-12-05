public class CWM_VarArgs {
//    static int sum(int a, int b) {
//        return a+b;
//    }
//    static int sum(int a, int b, int c) {
//        return a+b+c;
//    }
//    static int sum(int a, int b, int c, int d) {
//        return a+b+c+d;
//    }
    static int sum(int ...arr) {
        //Available as int []arr;
        int result = 0;
        for(int a: arr) {
            result += a;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("Welcome");
        //sum of nothing is 0 since you're not putting a value
        System.out.println(sum());
        System.out.println(sum(4,5,6));
        System.out.println(sum(4,5, 6, 7));
    }
}
