package com.company;

public class vid25_Fibonacci_forLoop {
    public static void main(String[] args) {
        int number = 9;
        int prevNum = 0;
        int nextNum = 1;

        System.out.print("The fibonacci series for " + number + " numbers using for loop is: ");


        for(int i=0; i<=number; i++){

            System.out.print( prevNum + " ");
            int sum = prevNum + nextNum;
            prevNum = nextNum;
            nextNum = sum;
        }
    }
}
