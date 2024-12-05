//Problem01 - Create an ArrayList and store the names of 10 students inside it Print it using a for each loop
//Problem02 - Use the date class in java to print time in the following format: 21: 47: 02
//Problem03 - Repeat 2 using Calendar class
//Problem04 - Repeat 2 using java.time API
//Problem05 - Create a Set(Is abstract and cannot be instantiated) use HashSet in java. Try to store duplicate elements inside this set and verify that only one instance is stored


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class CWM_PracticeSet15 {
    public static void main(String[] args) {

        //Problem01
//        ArrayList ar = new ArrayList();
//        ar.add("Student1");
//        ar.add("Student2");
//        ar.add("Student3");
//        ar.add("Student4");
//        ar.add("Student5");
//        ar.add("Student6");
//        ar.add("Student7");
//        ar.add("Student8");
//        ar.add("Student9");
//        ar.add("Student10");
//        for(Object o: ar){
//            System.out.println(ar);
//        }

        //Problem05
//        HashSet<Integer> s = new HashSet<>();
//
//        s.add(5);
//        s.add(6);
//        s.add(46);
//        s.add(60);
//        s.add(9);
//        s.add(6);
//
//        System.out.println(s);

        //Problem02
//        Date d = new Date();
//        System.out.println(d.getHours()+":"+d.getMinutes()+":"+d.getSeconds()); //hh:mm:ss

        //Problem03
//        Calendar cd = Calendar.getInstance();
//        System.out.println(cd.get(Calendar.HOUR_OF_DAY)+":"+ cd.get(Calendar.MINUTE)+":"+cd.get(Calendar.SECOND));

        //Problem04 Latest API always use this not the above two
        LocalDateTime dt = LocalDateTime.now(); //This is the date
        DateTimeFormatter df = DateTimeFormatter.ofPattern("H:m:s"); //This is the format
        String myDate = dt.format(df);//Creating date string using date and format
        System.out.println(myDate);


    }
}
