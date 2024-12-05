public class CWM_Arrays1 {
    public static void main(String[] args) {
        //int []marks = {98, 45, 86, 79, 91, 95};
        /*float []marks = {98.1f, 45.5f, 86.0f, 79.5f, 91.7f, 95.6f};
        System.out.println(marks.length);
        System.out.println(marks[2]);
        String []students = {"Harry", "Sameera", "Rohan", "Lara", "Jenny"};
        System.out.println(students.length);
        System.out.println(students[2]);*/

        //Display the array (naive way)
        int []marks = {98, 45, 86, 79, 91, 95};

        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);

        //Display array (for loop)
        System.out.println("Printing using for loop");
        for(int i=0; i< marks.length; i++) {
            System.out.println(marks[i]);
        }
        //Displaying array in reverse order
        System.out.println("Displaying array in reverse order");
        for(int i= marks.length-1; i>=0; i--) {
            System.out.println(marks[i]);
        }

        //Displaying the array using for each loop
        System.out.println("Displaying array using for each loop: ");
        for(int element : marks) {
            System.out.println(element);
        }



    }
}
