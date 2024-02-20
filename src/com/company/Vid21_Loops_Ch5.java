package com.company;

public class Vid21_Loops_Ch5 {
    public static void main(String[] args) {

        //--------------While Loops--------------[checks the condition & executes the code]
        /*
         int num = 100;
         while(num <= 200){
            System.out.println(num);
            num++ ;
        }

        */

        //-------------Do-While Loops------------[Executes the code & checks the condition]
        /*
        int b = 10;                       //In Do-While loop
        do{                               //it at-least execute once
            System.out.println(b);        //here, b is first executed
            b++;                          //then only it enters the loop
        }                                 //and checks the condition
        while(b<=15);                     //';' Semicolon is important here
        */

        /* write a program to print first n natural numbers using do-while loop */
      /*  System.out.println("Do-While Loop:");
        int naturalNo = 1;
        do{
            System.out.println(naturalNo);
            naturalNo++;
        }
        while (naturalNo<=10);

       */


        //-------------For Loops---[Usually used to execute a piece of code for specific no. of times]
     /*   int i;
        System.out.println("For Loop:\n");          //When we know,
        for (i = 20; i < 100; i+=10){               //how many times a code
            System.out.println(i);                  //should be executed, For loop is used
        }
      */

        /* To print first n odd numbers using a for loop
           2n = Even Numbers --> 0, 2, 4, 6,......
         2n+1 = Odd Numbers -->  1, 3, 5, 7,......                    */

//        int i = 100 ;
//        System.out.println("First odd no's:");
//        for (n = 0; n < i; n++){
//            System.out.println(2*n+1);
//        }


//        int j ;
//        int m = 100;
//        System.out.println("First even no's:");
//        for (j = 0; j < m; j++){
//            System.out.println(2*j);
//        }

        int k;
//        for (k=10; k!=5; k--){                                  //Decrementing for-loop
//            System.out.println(k);
//        }

        //Program to print first p natural numbers in reverse order
        int p = 100;
        for(k = p; k!=0; k--){
            System.out.println(k);
        }
    }
}
