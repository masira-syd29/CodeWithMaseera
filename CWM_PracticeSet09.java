//Problem01 Create a class cylinder and use setters and getters to set its radius and height

//class Cylinder{
//    private int radius;
//    private int height;
//
//    public int getRadius() {
//        return radius;
//    }
//
//    public void setRadius(int radius) {
//        this.radius = radius;
//    }
//
//    public int getHeight() {
//        return height;
//    }
//
//    public void setHeight(int height) {
//        this.height = height;
//    }
//}
//
//public class CWM_PracticeSet09 {
//    public static void main(String[] args) {
//        Cylinder myCylinder = new Cylinder();
//        myCylinder.setHeight(12);
//        System.out.println(myCylinder.getHeight());
//        myCylinder.setRadius(9);
//        System.out.println(myCylinder.getRadius());
//
//    }
//}
//Problem 02 Use 1) to calculate surface area and volume of the cylinder
//class Cylinder{
//    private int radius;
//    private int height;
//
//    public int getRadius() {
//        return radius;
//    }
//
//    public void setRadius(int radius) {
//        this.radius = radius;
//    }
//
//    public int getHeight() {
//        return height;
//    }
//
//    public void setHeight(int height) {
//        this.height = height;
//    }
//    public float surfaceArea(){
//        return 2 * 3.142f * radius * radius +2 * 3.142f * radius * height;
//    }
//    public float volume(){
//        return 3.142f*radius*radius*height;
//    }
//}
//public class CWM_PracticeSet09{
//    public static void main(String[] args) {
//        Cylinder myCylinder = new Cylinder();
//        myCylinder.setHeight(12);
//        System.out.println(myCylinder.getHeight());
//        myCylinder.setRadius(9);
//        System.out.println(myCylinder.getRadius());
//        System.out.println(myCylinder.surfaceArea());
//        System.out.println(myCylinder.volume());
//    }
//}
//Problem03 Do the same program but using constructors instead of setters and getters
//class Cylinder{
//    private int radius;
//    private int height;
//
//    public Cylinder(int height, int radius) {
//        this.height = height;
//        this.radius = radius;
//    }
//
//    public int getRadius() {
//        return radius;
//    }
//
//    public void setRadius(int radius) {
//        this.radius = radius;
//    }
//
//    public int getHeight() {
//        return height;
//    }
//
//    public void setHeight(int height) {
//        this.height = height;
//    }
//    public float surfaceArea(){
//        return 2 * 3.142f * radius * radius +2 * 3.142f * radius * height;
//    }
//    public float volume(){
//        return 3.142f*radius*radius*height;
//    }
//}
//public class CWM_PracticeSet09{
//    public static void main(String[] args) {
//        Cylinder myCylinder = new Cylinder(12,9);
//        //myCylinder.setHeight(12);
//        System.out.println(myCylinder.getHeight());
//        //myCylinder.setRadius(9);
//        System.out.println(myCylinder.getRadius());
//        System.out.println(myCylinder.surfaceArea());
//        System.out.println(myCylinder.volume());
//    }
//}
//Problem04 Overload a constructor used to initialize a rectangle of length 4 and breadth 5 for using custom parameters
class Cylinder{
    private int radius;
    private int height;

    public Cylinder(int height, int radius) {
        this.height = height;
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public float surfaceArea(){
        return 2 * 3.142f * radius * radius +2 * 3.142f * radius * height;
    }
    public float volume(){
        return 3.142f*radius*radius*height;
    }
}
class Rectangle{
    private int length;
    private int breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }
}
public class CWM_PracticeSet09{
    public static void main(String[] args) {
        Cylinder myCylinder = new Cylinder(12,9);
        //myCylinder.setHeight(12);
        System.out.println(myCylinder.getHeight());
        //myCylinder.setRadius(9);
        System.out.println(myCylinder.getRadius());
        System.out.println(myCylinder.surfaceArea());
        System.out.println(myCylinder.volume());

        Rectangle r = new Rectangle(4,5);
        System.out.println(r.getLength());
        System.out.println(r.getBreadth());

    }
}
