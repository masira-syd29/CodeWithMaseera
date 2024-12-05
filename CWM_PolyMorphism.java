interface MyCamera{
    void takeSnap();
    void recordVideo();
    private void greet(){
        System.out.println("Good morning");
    }
    default void record4KVideo(){
        System.out.println("Recording in 4k");
    }

}
interface MyWifi{
    String[] getNetworks();
    void connectToNetworks(String network);
}
class MyCellPhone1{
    void callNumber(int phoneNumber){
        System.out.println("Calling "+phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting...");
    }

}
class MySmartPhone1 extends MyCellPhone1 implements MyWifi, MyCamera{
    public void takeSnap(){
        System.out.println("Taking Snap");
    }
    public void recordVideo(){
        System.out.println("Recording Video");
    }
    public String[] getNetworks(){
        System.out.println("Getting list of Networks!");
        String[] networkList = {"Lara", "John", "Jenny"};
        return networkList;
    }
    public void record4KVideo(){
        System.out.println("Recording.. 4k video");
    }
    public void connectToNetworks(String network){
        System.out.println("Connecting to " +network);
    }
    public void sampleMeth(){
        System.out.println("Meth");
    }

}

public class CWM_PolyMorphism {
    public static void main(String[] args) {
        MyCamera cam1 = new MySmartPhone1(); //this is a smartphone use it as a camera
        //cam1.getNetworks(); --> Not allowed for good
        cam1.record4KVideo();
        //cam1.sampleMeth(); --> not allowed for good
        MySmartPhone1 sp = new MySmartPhone1();
        sp.sampleMeth();
        sp.getNetworks();
        sp.record4KVideo();
        sp.callNumber(932612);

    }
}
