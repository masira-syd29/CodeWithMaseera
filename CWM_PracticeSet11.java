////Problem01 - Create an abstract class pen with methods write() and refill as abstract methods
//abstract class Pen{
//    abstract void write();
//    abstract void refill();
//
//}
////Problem02- Use the pen class form Q1 to create a concrete class fountain with additional method changeNib()
//class FountainPen extends Pen{
//   void write(){
//       System.out.println("Write");
//   }
//   void refill(){
//       System.out.println("Refill");
//   }
//   void changeNib(){
//       System.out.println("Change the Nib");
//   }
//}
//
//public class CWM_PracticeSet11 {
//    public static void main(String[] args) {
//        FountainPen pen = new FountainPen();
//        pen.changeNib();
//    }
//}

//Problem03 - Create a class monkey with jump() and bite() methods. Create a clas human which inherits this monkey class and implements basicAnimal interface with eat() and sleep methods
//Problem05 - Demostrate polymorphism using mokey class from Q3
//class Monkey{
//    void jump(){
//        System.out.println("Jumping..");
//    }
//    void bite(){
//        System.out.println("Bite..");
//    }
//}
//interface BasicAnimal{
//    void eat();
//    void sleep();
//}
//class Human extends Monkey implements BasicAnimal{
//    public void speak(){
//        System.out.println("Hello Sir");
//    }
//    public void eat(){
//        System.out.println("Eating");
//    }
//    public void sleep(){
//        System.out.println("Sleeping");
//    }
//
//}
//
//
//public class CWM_PracticeSet11 {
//    public static void main(String[] args) {
//       Human maseera = new Human();
//       maseera.sleep();
//
//       Monkey M1 = new Human();
//       M1.jump();
//       M1.bite();
//
//       //M1.speak(); -->cannot use speak method because the reference is Monkey which does not have speak method
//       BasicAnimal ba = new Human();
//       ba.eat();
//       ba.sleep();
//
//    }
//}


//Problem04 - Create a class Telephone with ring(), lift() and disconnect() methods as abstract methods .
// Create another class SmartTelephone and demonstrate polymorphism
abstract class Telephone{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}
class SmartTelephone extends Telephone{
    public void ring(){
        System.out.println("Ringing...");
    }
    public void lift(){
        System.out.println("The phone is lifted...");
    }
    public void disconnect(){
        System.out.println("The phone is disconnecting...");
    }
}

public class CWM_PracticeSet11 {
    public static void main(String[] args) {
       SmartTelephone st = new SmartTelephone();
       st.disconnect();
       st.ring();
       st.lift();
    }
}

//Problem06 - Create an interface TVRemote and use it to inherit another interface  SmartTvRemote
//Problem07 - Create a class TV which implements TVRemote interface from Q6

interface TVRemote{
    void powerOff();
    void pressButtons();
}
interface SmartTvRemote extends TVRemote{
    void changeChannel();
    void favourites();
}

//Problem07 - Create a class TV which implements TVRemote interface from Q6
class TV implements TVRemote{
    @Override
    public void powerOff() {
        System.out.println("Switch off Tv");
    }

    @Override
    public void pressButtons() {
        System.out.println("Press buttons");
    }
}