package com.company;

public class vid34_Recursion_Fibonacci {
    // Fibonacci series using recursion

    static int fibonacciRecursion(int n){
        if(n == 0){
            return 0;
        }
        else if(n == 1 || n == 2) {
            return 1;
        }
        else {
            return fibonacciRecursion(n-2) + fibonacciRecursion(n-1);
        }
    }

    public static void main(String[] args) {
        int a = 5;
        System.out.println("The fibonacci series of " + a + " numbers is: ");
        for (int i=0; i<=a; i++){
            System.out.print(fibonacciRecursion(i) + " ");
        }

    }
}
