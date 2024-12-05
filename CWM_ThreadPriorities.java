class thread1 extends Thread{
    public thread1(String name){
        super(name);
    }
    public void run(){
        int i=10;
        while (true){
            System.out.println("Thank you: "+this.getName());
        }
    }
}

public class CWM_ThreadPriorities {
    public static void main(String[] args) {
        System.out.println();
        //Ready queue: T1 T2 T3 T4 T5
        thread1 t1 = new thread1("Maseera");
        thread1 t2 = new thread1("Irfan");
        thread1 t3 = new thread1("Ali");
        thread1 t4 = new thread1("Sayed");
        thread1 t5 = new thread1("Tehmina most important");
        t5.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t4.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();





    }
}
