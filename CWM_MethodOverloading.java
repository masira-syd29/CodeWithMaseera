public class CWM_MethodOverloading {
    static void foo() {
        System.out.println("Good morning bro");
    }
    static void foo(int a) {
        System.out.println("Good morning " + a + "bro");
    }
    static void foo(int a, int b) {
        System.out.println("Good morning " + a + "bro");
        System.out.println("Good morning " + b + "bro");
    }
    //Method overloading cannot be performed by changing the return type of methods
    //Which is why its throwing an error
//    static int foo(int a, int b, int c) {
//        System.out.println("Good morning " + a + "bro");
//        System.out.println("Good morning " + b + "bro");
//    }

    static void change(int a) {
        a = 98;
    }
    static void change2(int []arr) {
        arr[0] = 98;
    }
    static  void tellJoke() {
        System.out.println("I invented a new joke");
    }

    public static void main(String[] args) {
        //tellJoke();
        //Case 1 : Changing the integer
//        int []marks = {83, 95, 67, 78, 79};
//        int x = 45;
//        change(x);
//        System.out.println("The value after changing x is " +x);

        //Case 2 : Changing the array
//        int []marks = {83, 95, 67, 78, 79};
//        change2(marks);
//        System.out.println("The value of X after running change is " +marks[0]);

        //Method overloading
        foo();
        foo(2900);
        foo(3000,4000);
        //arguments are actual
    }
}
