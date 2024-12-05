interface Bicycle{
    int a = 45;
    void applyBrake(int decrement);
    void speedUp(int increment);
}
interface HornBicycle{
    void blowHorn1();
    void blowHorn2();
}
class AvonCycle implements Bicycle, HornBicycle{
    void blowhorn(){
        System.out.println("Pom pom");
    }
    public void applyBrake(int decrement){
        System.out.println("Applying Brake");
    }
    public void speedUp(int increment){
        System.out.println("Applying SpeedUp");
    }
    public void blowHorn1(){
        System.out.println("Blowing Horn1");
    }
    public void blowHorn2(){
        System.out.println("Blowing Horn2");
    }
}

public class CWM_Interfaces {
    public static void main(String[] args) {
        AvonCycle cycleMaseera = new AvonCycle();
        //you can create properties in interfaces
        cycleMaseera.applyBrake(1);
        //you cannot modify the properties in interfaces as they are final
        System.out.println(cycleMaseera.a);
        cycleMaseera.blowHorn1();
        cycleMaseera.blowHorn2();
        cycleMaseera.blowhorn();
    }
}
