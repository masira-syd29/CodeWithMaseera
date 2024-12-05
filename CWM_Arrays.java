public class CWM_Arrays {
    public static void main(String[] args) {
        /* Classroom of 500 students you have to store marks of these 500 students
        * you have two options:
        * 1. Create 500 Variables
        * 2. Use Arrays
        * There are three main ways to create and array in java
        * 1. Declaration and memory Allocation
        * int []marks = new int[5];
        *
        * 2. Declaration and then Memory Allocation
        * int []marks;
        * marks = new int[5];
        * Initialization
        * marks[0] = 100;
        * marks[1] = 50;
        * marks[2] = 86;
        * marks[3] = 75;
        * marks[4] = 90;
        *
        * 3. Declaration, Memory Allocation and Initialization together */
        int []marks = {98, 45, 86, 79, 91, 95};

        //marks[5] = 98; -> gives array out of bound exception
        System.out.println(marks[4]);
    }
}
