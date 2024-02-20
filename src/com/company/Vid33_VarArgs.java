package com.company;

public class Vid33_VarArgs {
//    public
//    static int sum(int a, int b) {
//        return a + b;
//    }
//    static int sum(int a, int b, int c) {
//        return a + b + c;
//    }
//    static int sum(int a, int b, int c, int d){
//        return a + b + c + d;
//    }
    static int sum(int ...arr){                  // Three dots '...args' ---> every elements packed into this
                                                // Available as int[] arr;
        int result = 0;                        // This works the same-
        for (int element:arr){                // as Method Overloading
            result +=element;                // This is a convenient & efficient way
        }
        return result;
    }

    public static void main(String[] args) {

        System.out.println("Welcome to varargs");
        System.out.println("The sum of 11 & 22 is: " + sum(11, 22));
        System.out.println("The sum of 22, 60 & 14 is: " + sum(22, 60, 14));
        System.out.println("The sum of 10, 20, 30 & 40 is: " + sum(10, 20, 30, 40));
        System.out.println("The sum of 10, 20, 30,40 & 50 is: " + sum(10, 20, 30, 40, 50));
    }
}
