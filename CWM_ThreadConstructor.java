
class thread extends Thread{
    public thread(String name){
        super(name);
    }
    public void run(){
        while (true){
            System.out.println("I AM A THREAD");
        }
    }
}

public class CWM_ThreadConstructor {
    public static void main(String[] args) {
        thread t = new thread("maseera");
        t.setName("Maseera");
        System.out.println("The name of the thread is "+t.getName());
        System.out.println("The ID of the thread is " +t.threadId());
        t.start();
    }
}
