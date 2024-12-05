//Create a class Circle and use inheritance to create another class cylinder from it
//class Circle{
//    Circle(int r){
//        System.out.println("I am a circle parameterized constructor");
//        this.radius = r;
//    }
//    public int radius;
//
//    public double area(){
//        return Math.PI*this.radius*this.radius;
//    }
//}
//class Cuboid extends Circle{
//    public int height;
//    Cuboid(int r, int h){
//        super(r);
//        System.out.println("I am cylinder1 parameterized constructor");
//        this.height = h;
//    }
//    public double volume(){
//        return Math.PI*this.radius*this.radius*this.height;
//    }
//}
//public class CWM_PracticeSet10 {
//    public static void main(String[] args) {
//        Cuboid obj = new Cuboid(12, 4);
//        //Circle objc = new Circle(12);
//    }
//}
//Problem02 Create a clas rectangle and use inheritance to create another class cuboid keep close to real world scenario
class Rectangle2{
    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public int length;
    public int breadth;

    Rectangle2(int l, int b){
        System.out.println("I am a Rectangle parameterized constructor");
        this.length = l;
        this.breadth = b;
    }

    public double area(){
        return this.length*this.breadth;
    }
}
class Cuboid extends Rectangle2{
    public int height;
    Cuboid(int l, int b, int h){
        super(l,b);
        System.out.println("I am Cuboid parameterized constructor");
        this.height = h;
    }
    public double area(){
        //2𝒍𝒘 + 2𝒘𝒉 + 2𝒍𝒉
        return 2*this.length*this.breadth+2*this.breadth*this.height+2*this.length*this.height;
    }
}
public class CWM_PracticeSet10 {
    public static void main(String[] args) {
        Cuboid obj = new Cuboid(3, 4, 6);
        //Circle objc = new Circle(12);
        Rectangle2 rec = new Rectangle2(2,3);
    }
}
//