package com.company;
//import java.util.Scanner;       // method 1
//import java.util.*;             // method 2
//   without importing anything directly writing under main method- java.util.Scanner...

public class Vid65_Importing_Packages {
    public static void main(String[] args) {
        System.out.println("Enter any number");
        //Scanner sc = new Scanner(System.in);        // method 1 & 2
        java.util.Scanner sc = new java.util.Scanner(System.in);    // method 3
        int a = sc.nextInt();

        System.out.println("The entered number is " + a);
    }
}
