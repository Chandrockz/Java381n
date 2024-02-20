package com.company;

public class vid25_Fibonacci_While_loop {
    public static void main(String[] args) {
        int number = 8;
        int prevNum = 0;
        int nextNum = 1;
        System.out.print("Fibonacci Series of " + number + " numbers using while loop is: ");

        int i = 1;
        while (i <= number) {
            System.out.print(prevNum + " ");
            int sum = prevNum + nextNum;
            prevNum = nextNum;
            nextNum = sum;
            i++;
        }
    }
}
