package com.company;

public class Vid27_Arrays {
    public static void main(String[] args) {
        int[] marks = {67, 88, 97, 77, 76, 90};
        System.out.println(marks[2]);
        System.out.println(marks.length);                   //marks.length gives total no. of elements in an array

       /* float[] avgs = {66f, 98f, 87f, 67f, 60f, 90f};
        System.out.println(avgs[3]);
        System.out.println(avgs.length);

        String[] students = {"Chandrakiran", "Suryakiran", "Shruti","Mom", "Dad"};
        System.out.println(students[3]);
        System.out.println(students.length);
        */

        //  Displaying the Array (NAIVE Way)
        System.out.println("Displaying Arrays in Naive way(traditional way)");
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);
        System.out.println(marks[5]);
        System.out.print("\n");

        //  Displaying the Arrays in Efficient way(For-loop)

        System.out.println("Displaying Arrays using for-loop");
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);           //This is called "Array Traversal"
        }
        System.out.print("\n");

        //  Displaying the Arrays in Efficient way(For-loop) in reverse order
        System.out.println("In reverse order");
        for (int j = marks.length - 1; j >= 0; j--) {
            System.out.println(marks[j]);
        }
        System.out.print("\n");

        //  Displaying the Arrays in Efficient way(For-loop)
        System.out.println("Displaying Arrays using for-each loop");
        for (int element: marks){
            System.out.println(element);        //Prints all the elements
        }
        System.out.print("\n");


    }

}
