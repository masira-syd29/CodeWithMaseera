public class CWM_BreakandContinue {
    public static void main(String[] args) {
        //break and continue using loops!
//        for(int i=0; i<50; i++) {
//            System.out.println(i);
//            System.out.println("Java is great");
//            if(i==2) {
//                System.out.println("Ending the loop");
//                break;
//            }
        int i = 0;
        do{
            System.out.println(i);
            System.out.println("Java is great");
            if(i==2) {
                System.out.println("Ending the loop");
                break;
            }
            i++;

        } while(i<5);
        System.out.println("Loop ends here");

    }
}
