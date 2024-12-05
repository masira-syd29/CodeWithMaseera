class Phone{
    public void on(){
        System.out.println("Turning on phone...");
    }
    public void greet(){
        System.out.println("Good morning");
    }
}
class SmartPhone extends Phone{
    public void welcome(){
        System.out.println("You are Welcome");
    }
    public void on(){
        System.out.println("Turning on Smartphone...");
    }
}

public class CWM_DynamicMethodDispatch {
    public static void main(String[] args) {
//        Phone obj = new Phone();
//        SmartPhone samsung = new SmartPhone();
//        obj.name();
        Phone obj = new SmartPhone();
        obj.greet();
        obj.on();
    }
}
