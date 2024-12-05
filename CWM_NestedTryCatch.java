import java.util.Scanner;

public class CWM_NestedTryCatch {
    public static void main(String[] args) {
        int[] marks = new int[3];
        marks[0] = 8;
        marks[1] = 6;
        marks[2] = 7;
        Scanner sc = new  Scanner(System.in);
        boolean flag = true;
        while(flag) {
            System.out.println("Enter the value of index: ");
            int ind = sc.nextInt();

            try {
                System.out.println("Welcome to the video");
                try {
                    System.out.println(marks[ind]);
                    flag = false;
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Sorry this index does not exist");
                    System.out.println("Exception in level 2");
                }
            } catch (Exception e) {
                System.out.println("Exception in level 1");
            }
        }
        System.out.println("ThaNKS For using this program");
    }
}
