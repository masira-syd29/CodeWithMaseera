import java.util.ArrayList;

public class CWM_Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>(4);
        l2.add(45);
        l2.add(67);
        l2.add(43);
        l2.add(5);
        l1.addAll(l2);
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(5);
        l1.add(0,7);
        System.out.println(l1.contains(22));
        System.out.println(l1.indexOf(5));
        System.out.println(l1.lastIndexOf(5));
        l1.set(2,66);
        //l1.clear();
        for (int i=0; i<l1.size(); i++) {
            System.out.print(l1.get(i));
            System.out.print(", ");
        }
    }
}
