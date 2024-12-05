//Problem1 - print "Good morning" and "welcome" continuously on the screen using threads
//Problem02 - add a sleep method in welcome thread of Q1 to delay its execution for 200ms
//Problem03 - Demonstrate getPriority and setPriority methods in thread
//Problem04- how do you get state of given thread in java
//Problem05 - how to get reference to a thread?


class Greeting extends Thread{
    public void run(){
        int i=0;
//        while (true) {
//            System.out.println("Good Morning!");
//            try {
//                Thread.sleep(200);
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }
    }
}
class Welcoming extends Thread{
    public void run(){

//        while (false) {
//            System.out.println("Welcome");
//        }
    }
}

public class CWM_PracticeSet13 {
    public static void main(String[] args) {
        Greeting g1 = new Greeting();
        Welcoming w1 = new Welcoming();
        g1.setPriority(Thread.NORM_PRIORITY);
        w1.setPriority(Thread.NORM_PRIORITY);
        System.out.println(g1.getPriority());
        System.out.println(w1.getPriority());
        System.out.println(g1.getState());

//        g1.start();
        w1.start();
        System.out.println(w1.getState());
        System.out.println(Thread.currentThread().getState());

    }
}
