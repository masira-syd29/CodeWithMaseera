
//Problem01
//class Employee{
//    int salary;
//    String name;
//
//    public int getSalary(){
//        return salary;
//    }
//    public String getName(){
//        return name;
//    }
//    public void setName(String n){
//        name = n;
//    }
//}
//
//public class CWM_PracticeSet08 {
//    public static void main(String[] args) {
//        //Problem01
//        Employee maseera = new Employee();
//        maseera.setName("Code with Maseera");
//        maseera.salary = 233;
//        System.out.println(maseera.getName());
//        System.out.println(maseera.getSalary());
//
//    }
//}

//Problem02 Create a class cellphone with methods to print "ringing" "vibrating"..etc
//class Cellphone{
//    public void ringing(){
//        System.out.println("Ringing...");
//    }
//    public void vibrating(){
//        System.out.println("Vibrating...");
//    }
//    public void calling(){
//        System.out.println("Calling...");
//    }
//}
//
//public class CWM_PracticeSet08 {
//    public static void main(String[] args) {
//        Cellphone iphone = new Cellphone();
//        iphone.calling();
//        iphone.ringing();
//        iphone.vibrating();
//
//
//    }
//}
//Problem03 Create a class square with a method to initialize its side, calculating area, perimeter etc
//class Square{
//    int side;
//    public int area(){
//        return side*side;
//    }
//    public int perimeter(){
//        return 4*side;
//    }
//}
//
//public class CWM_PracticeSet08 {
//    public static void main(String[] args) {
//        Square sq = new Square();
//        sq.side = 3;
//        System.out.println(sq.area());
//        System.out.println(sq.perimeter());
//
//
//    }
//}
//Problem04 Create a class rectangle with a method to initialize its side, calculating area, perimeter etc
//class Rectangle1{
//    int length;
//    int breadth;
//    public int area(){
//        return length*breadth;
//    }
//    public int perimeter(){
//        return 2*length*breadth;
//    }
//}
//
//public class CWM_PracticeSet08 {
//    public static void main(String[] args) {
//        Rectangle1 rt = new Rectangle1();
//        rt.length = 4;
//        rt.breadth = 5;
//        System.out.println(rt.area());
//        System.out.println(rt.perimeter());
//
//
//    }
//}
//Problem05 Create a class TommyVecetti for Rockstar Games capable of hitting(print hitting), running, firing, etc
class Rectangle1{
    int length;
    int breadth;
    public int area(){
        return length*breadth;
    }
    public int perimeter(){
        return 2*length*breadth;
    }
}
class Tommy{
    public void hit(){
        System.out.println("Hitting the enemy");
    }
    public void run(){
        System.out.println("Running from the enemy");
    }
    public void fire(){
        System.out.println("Firing on the enemy");
    }
}

public class CWM_PracticeSet08 {
    public static void main(String[] args) {
        Tommy player1 = new Tommy();
        player1.fire();
        player1.run();
        player1.hit();

    }
}