

class C1{
    public int x = 5;
    protected int u = 8;
    int z = 7;
    private int r = 6;
    public  void meth1(){
        System.out.println(x);
        System.out.println(u);
        System.out.println(z);
        System.out.println(r);
    }

}
class C2 extends C1{


}

public class CWM_AccessModifiers {
    public static void main(String[] args) {
        C1 c = new C1();
       // c.meth1();
        System.out.println(c.z);
        System.out.println(c.x);
        System.out.println(c.u);
       // System.out.println(c.r);
    }
}
