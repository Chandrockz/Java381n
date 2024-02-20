package com.company;

public class Vid26_Arrays_Ch6 {
    public static void main(String[] args) {
        /*
        -Array is a collection of similar types of data.
        -Use case: Storing marks of 500 students
          -for doing this,
           we have two options
            1.Create 500 variables
            2.Use Arrays (recommended)
        - int[] marks = new int [500]          -------> datatype ArrName[];
         */
        //There are three main ways to create an array in java

     // int [] marks = new int[5];        //-->1st method [Declaration and memory allocation]

        int[] marks;
        marks = new int[5];                //-->2nd method [Declaration first then memory allocation]

    //-->Initialization
        marks[0] = 87;          //Index starts from 0 and goes till (n-1); n = size of an array
        marks[1] = 89;          //For marks[5] below,
        marks[2] = 77;          //throws error because we allocated upto [5]
        marks[3] = 69;          //spaces which means 0 to 4 arrays it locates
        marks[4] = 94;
        //marks[5] = 64;



//     int[] marks = {87, 89, 77, 69, 94};         //-->3rd method [Declaration, memory allocation and initialization together]

        int total = marks[0] + marks[1] + marks[2] + marks[3] + marks[4] ;
        float avg = total/5.0f;
        System.out.println(avg);
    }
}
