public class CWM_PracticeSet07 {

    //Problem 01
//    static void multiplication(int n) {
//        for(int i=1; i<=10; i++) {
//            System.out.format("%d X %d = %d\n", n, i, n*i);
//        }
//    }
//    public static void main(String[] args) {
//        //write a java program to print ht e multiplication table of a given number N
//        multiplication(7);
//    }
    //Problem 02 Print pattern 1
//    static  void pattern(int n) {
//        for(int i=0; i<n; i++) {
//            for(int j=0; j<i+1; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//
//    public static void main(String[] args) {
//        pattern(4);
//    }
    //Problem 03 Recursive function to calculate sum of first n natural numbers
//    static int sumRec(int n) {
//        //sum(n) = 1+2+3+4+5
//        //sum(n)=sum(n-1)+n
//        //base condition
//        if(n==1) {//base condition
//            return 1;
//        }
//        return n + sumRec(n-1);
//    }
//
//    public static void main(String[] args) {
//        int c = sumRec(4);
//        System.out.println(c);
//    }
    //Problem 04 Print the pattern 2
//    static  void pattern(int n) {
//        for(int i=n; i>0; i--) {
//            for(int j=0; j<i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//
//    public static void main(String[] args) {
//        pattern(4);
//    }

    //Problem 05 Fibonacci series nth term
//    static int fib(int n) {
//        if(n==1) {
//            return 0;
//        } else if (n==2) {
//            return 1;
//        }
//        if(n==1 || n==2) {
//            return n-1;
//        }
//        else {
//            return fib(n-1) + fib(n-2);
//        }
//    }
//
//    public static void main(String[] args) {
//        int result = fib(7);
//        System.out.println(result);
//    }
    //Problem 06 Find average of a set of numbers passed as arguments
//    static int sum(int ...arr) {
//        //Available as int []arr;
//        int result = 0;
//        for(int a: arr) {
//            result += a;
//        }
//        return result/arr.length;
//    }
//    public static void main(String[] args) {
//        System.out.println(sum(4,5,6));
//        System.out.println(sum(10,2));
//    }
    //Problem 07 Do Problem02 by recursion
    static  void pattern1rec(int n) {

        if(n>0) {
            pattern1rec(n-1);
            for(int i=0; i<n; i++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern1rec(5);
    }

}

