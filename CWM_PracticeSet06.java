public class CWM_PracticeSet06 {
    public static void main(String[] args) {
        //Problem 1 Create and array of five floats and Calculate their sum
//        float []marks = {23.5f, 45.7f, 35.7f, 8.69f, 56.9f};
//        float sum = 0;
//        for (float element:marks) {
//            sum = sum + element;
//        }
//        System.out.println("The value of sum is : " +sum);

        //Problem 2 find out whether a given integer is present in an array or not
//        float []marks = {23.5f, 45.7f, 35.7f, 8.69f, 56.9f};
//        float num = 45.9f;
//        boolean isInArray = false;
//        for (float element:marks) {
//            if(num==element) {
//                isInArray = true;
//                break;
//            }
//        }
//        if(isInArray) {
//            System.out.println("The value is present in the array ");
//        } else {
//            System.out.println("The value is not present in the array");
//        }

        //Problem 3 - Calculate the average marks from an array containing marks of all students in physics using for each loop
//        float []marks = {23.5f, 45.7f, 35.7f, 8.69f, 56.9f};
//        float sum = 0;
//        for (float element:marks) {
//            sum = sum + element;
//        }
//        System.out.println("The value of average marks is : " +sum/marks.length);

        //Problem 4 Create a java program to add two matrices of size 2x3
//        int [][]mat1 = { {1, 2, 3},
//                        {4, 5, 6}};
//
//        int [][]mat2 = { {7, 8, 9},
//                        {10, 11, 12}};
//        int [][]results = { {0, 0, 0},
//                            {0, 0, 0}};
//        for(int i=0; i<mat1.length; i++) {//row number of times
//            for(int j=0; j<mat1[i].length; j++) { //column number of times
//                System.out.format("Setting value for i=%d and j=%d\n", i, j);
//                results[i][j] = mat1[i][j] + mat2[i][j];
//
//            }
//        }
//        for(int i=0; i<mat1.length; i++) {//row number of times
//            for(int j=0; j<mat1[i].length; j++) { //column number of times
//                System.out.print(results[i][j] + " ");
//                results[i][j] = mat1[i][j] + mat2[i][j];
//
//            }
//            System.out.println(" ");
//        }

        //Problem 5 Reverse an Array
//        int []arr = {1, 2, 3, 4, 5, 6};
//        int l = arr.length;
//        int n = Math.floorDiv(l, 2);
//        int temp;
//
//        for(int i=0; i<n; i++) {
//            //Swap a[i] and a[l-1-i]
//            //a b temp
//            temp = arr[i];
//            arr[i] = arr[l-i-1];
//            arr[l-i-1] = temp;
//
//        }
//        for(int element: arr) {
//            System.out.print(element + "  ");
//        }

        //Problem 6 - Find the maximum element in an array
//        int []arr = {1, 2, 3, 455, 5, 1006};
//        int max = Integer.MIN_VALUE;
//        for(int element: arr) {
//            if(element>max) {
//                max = element;
//
//            }
//        }
//        System.out.println("The max value in the array is: " +max);
//        System.out.println(Integer.MIN_VALUE);

        //Problem 7 - Find the minimum element in an array
//        int []arr = {29, 12, 3, 455, 51, 1006};
//        int min = arr[0];
//        for(int element: arr) {
//            if(element<min) {
//                min = element;
//
//            }
//        }
//        System.out.println("The min value in the array is: " +min);

        //Problem 8 - Determine if an array is sorted
        boolean isSorted = true;
        //int []arr = {29, 12, 3, 455, 51, 1006};
        int []arr = {2, 3, 4, 5, 6, 7};

        for(int i=0; i<arr.length-1; i++) {
            if(arr[i] > arr[i+1]) {
                isSorted = false;
                break;
            }
        }
        if(isSorted) {
            System.out.println("The Array is Sorted");
        } else {
            System.out.println("The array is not sorted");
        }
    }
}
