package com.company;
import java.util.Scanner;
public class Vid25_Loops_Practice {
    public static void main(String[] args) {

        //------------------------ Question-1 -----------------------------

//        System.out.println("* * * *");            //HardCoding
//        System.out.println("* * * ");
//        System.out.println("* * ");
//        System.out.println("* ");

       /* for (int i=5; i>0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");

            }
            System.out.print("\n");
        }

        */

     /*   for (int i=0; i<10; i++) {
            for (int j = 10; j > i; j--) {

                    System.out.print("$");
            }
            System.out.print("\n");
        }


      */
        int n = 4;

        for (int k=n; k>0; k--) {
            for (int l = n-1; l > 0; l--) {
                System.out.print("$ ");
            }
            System.out.println();
        }




        //------------------------ Question-2 -----------------------------
       // Scanner sc = new Scanner(System.in);
       // System.out.println("Enter n even numbers");
     /*   int sum = 0;
        int n = 3;                      //0 2 4 6 8 10 first 5 even nos
        for (int j=0; j<=n; j++){
            sum = (2*j);

      }
        System.out.println("The sum of first n even nos are: "+ sum);

      */


        //------------------------ Question-3 -----------------------------
//                  [Multiplication table of given no. n]
       /* int n = 16;
        int i;
        for (i=n; i<=10*n; i+=n){
            System.out.println(i);
        }

        */

        //------------------------ Question-4 -----------------------------
//                   [Multiplication table of given no n in reverse order]
      /*  int n = 9;
        for (int i=n; i!=0; i--){
            System.out.printf("%d X %d = %d\n",n,i,n*i);
        }
       */


        //------------------------ Question-5 -----------------------------
        //                [factorial using for-loop]
//        int n = 5;
//
//        for (int i=1; i<=n; i++){
//            int factorial = 1;
//            factorial*=i;
//
//
//        }
//        System.out.println();




        //------------------------ Question-6 -----------------------------
        //                [Questn5 using while loop]
//        int n = 5;
//        int i=1;
//        int factorial = i*n;
//        while (i<=){
//
//            i++;
//        }
//        System.out.println(factorial);



        //------------------------ Question-7 -----------------------------
        //------------------------ Question-8 -----------------------------
        //------------------------ Question-9 -----------------------------
        //------------------------ Question-10 -----------------------------
        //------------------------ Question-11 -----------------------------
    }
}
