package com.company;

public class Vid35_Methods_Practice {

    // ----------------------------- Problem-1 ---------------------------------
    static void multiplication(int x) {
        for (int i = 1; i <= 10; i++) {
            System.out.format("%d X %d = %d\n", x, i, i * x);
        }
    }


    // ----------------------------- Problem-2 ---------------------------------
    static void pattern1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // ----------------------------- Problem-3 ---------------------------------
    static int recursiveFunction(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + recursiveFunction(n - 1);
        }
    }
    // sum(n) = 1 + 2 + 3... + n
    // sum(n) = 1 + 2 + 3... + n-1 + n
    // sum(n) = sum(n-1) + n
    // sum(3) = 3 + sum(2)
    // sum(3) = 3 + 2 + sum(1)
    // sum(3) = 3 + 2 + 1

    // ----------------------------- Problem-4 ---------------------------------
    static void pattern2(int n) {
        for (int i = n; i > 0; i--) {
            for (int j = i - 1; j > 0; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // ----------------------------- Problem-5 ---------------------------------
//        static int fibonacci(int n){          // This is for printing fibonacci series
//            if (n == 0){                      // for 'n' numbers
//                return 0;
//            }
//            else if (n == 1 || n == 2){
//                return 1;
//            }
//            else{
//                return fibonacci(n-1) + fibonacci(n-2);
//            }
//        }

    static int nth_fibo(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
            /* Or... if-else-if can also be written as-
            if(n==0 || n==1){
                return n-1;
             */

        } else {
            return nth_fibo(n - 1) + nth_fibo(n - 2);
        }
    }

    // ----------------------------- Problem-6 ---------------------------------

    static float avgnumbers(int... arr) {
        float n = 0;
        for (int element : arr) {
            n = element + n;

        }
        return n;
    }
    // ----------------------------- Problem-7 ---------------------------------
    // Problem 4 using recursion

    static void pattern2_recurion(int n) {
        if (n > 0) {

            for (int i = n; i > 0; i--) {
                System.out.print("* ");
            }
            System.out.println();
            pattern2_recurion(n - 1);
        }                                       //yessss  :|)

    }

    // ----------------------------- Problem-8 ---------------------------------
    // problem 2 using recursion
    static void pattern1_recursion(int m) {
        if (m > 0) {
            pattern1_recursion(m - 1);
            for (int i = 0; i < m; i++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // ----------------------------- Problem-9 ---------------------------------
    // Degree to Fahrenheit conversion
    static float temperature(float t) {
        if (t == 0) {
            return 32;
        } else {
            return (t * 9 / 5) + 32;
        }
    }

    // ----------------------------- Problem-10 ---------------------------------
    // problem 3 using iterative approach
   // static int sumofnos(int... n) {
//            if (n==0){
//                return 0;
//            }
//            else if (n==1){
//                return 1;
//            }
//            else {
//                int sum = 0;
//                for (int i=0; i<n; i++){
//                    sum = n + i;      //INCOMPLETE
//
//                }
//                return sum;
//            }

//    }
//        for (int element : n) {
//            for (int i = 0; i < 10; i++) {
//
//                return element +=i;
//            }
//
//        }
//        return element;
//    }
        public static void main (String[] args){
            System.out.println("Problem 1: ");
            //multiplication(21);                     //problem 1

            System.out.println("Problem 2:");
            //pattern1(10);                          //problem 2

            System.out.println("Problem 3:");       //problem 3
            //int c = recursiveFunction(5);
            //System.out.println("The sum of n numbers are " + c);

            System.out.println("Problem 4:");       //problem 4
            //pattern2(11);

            System.out.println("Problem 5:");
//        int a = 10;                                   // For normal fibonacci series
//        for(int i=0; i<a; i++){
//            System.out.print(fibonacci(i) + " ");
//        }
//        System.out.println("\n");
//        int sum = nth_fibo(8);
//        System.out.println(sum);
            //fibonacci series = 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144,....


            System.out.println("Problem 6:");
//        float avg = avgnumbers(10,10,10);
//        System.out.println("The sum of numbers are: " + avg);
//        System.out.println("The average will thus become: " + avg/3);       //Hard-coded :(

            System.out.println("Problem 7:");
            //pattern2_recurion(20);

            System.out.println("Problem 8:");
            //pattern1_recursion(20);

            System.out.println("Problem 9:");
            //System.out.println("The temperature after conversion is: " + temperature(200) + " F");

            System.out.println("Problem 10:");
//            int sum = sumofnos(6);
//            System.out.println(sum);        //INCOMPLETE


        }
    }

