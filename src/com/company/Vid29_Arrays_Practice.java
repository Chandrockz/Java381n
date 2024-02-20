package com.company;

public class Vid29_Arrays_Practice {
    public static void main(String[] args) {
        //------------------- Question-1 ---------------------------------
        /*
        float[] scores = {66.5f,77.34f,88.56f,98.02f,96.98f};
//        float total = scores[0] + scores[1] + scores[2] + scores[3] + scores[4];
//        System.out.println(total);
        float sum = 0;
        for (float element:scores){
            sum = sum + element;
        }
        System.out.println("The sum of these arrays are " + sum);
         */

        //------------------- Question-2 ---------------------------------
        /*
        int[] number;
        number = new int[5];
        number[0] = 55;
        number[1] = 64;
        number[2] = 73;
        number[3] = 82;
        number[4] = 69;
        int num = 60;
        boolean isAnArray = false;

        for (int element:number) {
            if (num == element) {
                isAnArray = true;
                break;
            }
        }
        if (isAnArray) {
            System.out.println("The number is present in an Array ");
        }

        else {
                System.out.println("The number is not present in an Array ");
        }
         */

        //------------------- Question-3 ---------------------------------
        //marks of 7 students
        /*
        float[] marks = {66, 92, 85.5f, 78, 72.5f, 89, 92.5f};
        float sum = 0;
        float avg = 0;
        for (float element : marks) {
            sum = sum + element;
            avg = sum / marks.length;
        }

        System.out.println("The sum of 7 students marks are " + sum);
        System.out.println("The average of 7 students marks are " + avg);

         */

        //------------------- Question-4 ---------------------------------
        /*
        int[][] mat1 = {{3,6,9},        //Array of arrays
                        {7,4,1}};       //but, we can visualise this
        int[][] mat2 = {{2,4,6},        //as 2X3 matrix
                        {6,4,2}};
        int[][] result = {{0,0,0},
                          {0,0,0}};

        for (int i=0; i< mat1.length; i++){             //row number of times
            for (int j=0; j<= mat2.length; j++){        //column number of times
                System.out.format("setting up values i=%d & j=%d ",i, j);
                System.out.println("");
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        System.out.println("The addition of 2X3 matrices is: ");

        for (int i=0; i< mat1.length; i++){                     //row number of times
            for (int j=0; j<= mat2.length; j++){                //column number of times
                result[i][j] = mat1[i][j] + mat2[i][j];
                System.out.print(result[i][j] + " ");
            }System.out.println(" ");
        }

         */

        //------------------- Question-5 ---------------------------------
        // Reversing the array
/*
        int[] a = {66,78,10,22,45};
//        for (int element:a){                         //printing an array using for-each loop
//            //sum = sum + element;
//            System.out.println(element);
//        }

        for (int i=a.length -1; i>=0; i--){             //printing reversed array using for-loop
            System.out.println(a[i]);
        }

 */

     /*   int [] arr = {22,32,54,76,89,76};                  //Actually reversing the arrays
        int l = arr.length;
        int n = Math.floorDiv(l,2);
        int temp ;

        for (int i=0; i<n; i++){
            temp = arr[i];
            arr[i] = arr[l-1-i];
            arr[l-1-i] = temp;
        }
        for (int element:arr){
            System.out.print(element + " ");
        }

      */

        //------------------- Question-6 ---------------------------------
        //To find the maximum element in an array
/*
        int[] num = {22,492,49,900,539,11,2000};
        int max = Integer.MIN_VALUE;
        int n = 0;
        for (int element:num){
            if (element > max){
                max = element;
            }
        }
        System.out.println("The max element in array is: "+ max);



        //------------------- Question-7 ---------------------------------
        //To find minimum element in an array
        int[] num1 = {90,-21,0,498,-3099,-869,1000};
        int min = Integer.MAX_VALUE;
        for (int element1:num1){
            if (element1<min){
                min = element1;
            }
        }
        System.out.println("The min element in array is: "+ min);

 */
        //------------------- Question-8 ---------------------------------
        //To find whether an array is sorted or not
        int[] arr = {22,303,44,50,66,77,88};
        boolean isSorted = true;
        for (int i=0; i<arr.length-1; i++){
            if (arr[i]>arr[i+1]){
                isSorted = false;
                break;
            }
        }
        if (isSorted ){
            System.out.println("The array is sorted ");

        }
        else {
            System.out.println("The array is not sorted ");
        }

// ----------------- NEED PROPER PRACTICE OF ARRAYS PROGRAMS --------------------
    }
}
