package com.company;

public class Vid34_Recursion {
    // factorial(0) = 1
    // factorial(n) = n * n-1 *....1
    // factorial(5) = 5 * 4 * 3 * 2 * 1 = 120
    // factorial(n) = n * factorial(n-1)
    static int factorial(int n){                    // --------------> Recursion method
        if(n==1 || n ==0){
            return 1;
        }
    else {
        return n * factorial(n-1);
        }
    }

    static int factorial_Iterative(int n) {         // ----------------> Iterative method
        if (n == 1 || n == 0) {
            return 1;
        } else {
            int product = 1;
            for (int i = 1; i <= n; i++) {
                product = product * i;
            }
            return product;
        }
    }

    public static void main(String[] args) {
        int x = 1;
        System.out.println("The value of factorial x is: " + factorial(x));
        System.out.println("The value of factorial_Iterative x is: " + factorial_Iterative(x));

    }
}