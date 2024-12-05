class Base1{
    Base1(){
        System.out.println("I am a Constructor");
    }
    Base1(int x){
        System.out.println("I am an Overloaded Constructor with value of x as: "+x);
    }

}
class Derived1 extends Base1{
    Derived1(){
        //super(0);
        System.out.println("I am Derived Class Constructor");
    }
    Derived1(int x, int y){
        super(x);
        System.out.println("I am an Overloaded Constructor of Derived class with value of y as: "+y);
    }
}
class ChildOfDerived extends Derived1{
    ChildOfDerived(){
        System.out.println("I am a Child of Derived Constructor");
    }
    ChildOfDerived(int x, int y, int z){
        super(x,y);
        System.out.println("I am an Overloaded Constructor of ChildOfDerived class with value of z as: "+z);
    }
}

public class CWM_ConstructorsInInheritance {
    public static void main(String[] args) {
//        Base1 b = new Base1();
//        Derived1 d = new Derived1();
//        Derived1 d = new Derived1(4,9);
//        ChildOfDerived cd = new ChildOfDerived();
        ChildOfDerived cd = new ChildOfDerived(12,13,14);

    }
}
