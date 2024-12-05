interface Camera{
    void takeSnap();
    void recordVideo();
    private void greet(){
        System.out.println("Good morning");
    }
    default void record4KVideo(){
        System.out.println("Recording in 4k");
    }

}
interface Wifi{
    String[] getNetworks();
    void connectToNetworks(String network);
}
class MyCellPhone{
    void callNumber(int phoneNumber){
        System.out.println("Calling "+phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting...");
    }

}
class MySmartPhone extends MyCellPhone implements Wifi, Camera{
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

}

public class CWM_DefaultMethods {
    public static void main(String[] args) {
        MySmartPhone ms = new MySmartPhone();
        ms.record4KVideo();
        String[] ar = ms.getNetworks();
        for(String item: ar){
            System.out.println(item);
        }
    }

}
