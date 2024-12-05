class NewThread1 extends Thread{
//    public thread2(String name){
//        super(name);
//    }
    public void run(){
        int i=0;
        while (true){
            System.out.println("Thank you: "+this.getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            i++;
        }
    }
}
class NewThread2 extends Thread{

    public void run(){
        int i=10;
        while (true){
            System.out.println("Thank you: "+this.getName());
        }
    }
}

public class CWM_ThreadMethods {
    public static void main(String[] args) {
        NewThread1 m1 = new NewThread1();
        NewThread2 m2 = new NewThread2();
        m1.start();
//        try{
//            m1.join();
//        }
//        catch (Exception e){
//            System.out.println(e);
//        }

        m2.start();

    }
}
