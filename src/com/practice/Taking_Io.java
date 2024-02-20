package com.practice;
import java.util.Scanner;

public class Taking_Io {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Subject-1 marks: ");
        int a1 = sc.nextInt();
//        float a = sc.nextFloat();

        System.out.println("Enter Subject-2 marks: ");
        int a2 = sc.nextInt();
        //float b = sc.nextFloat();

        System.out.println("Enter Subject-3 marks: ");
        int a3 = sc.nextInt();
        //float c = sc.nextFloat();

        System.out.println("Enter Subject-4 marks: ");
        int a4 = sc.nextInt();
        //float d = sc.nextFloat();

        System.out.println("Enter Subject-5 marks: ");
        int a5 = sc.nextInt();
        //float e = sc.nextFloat();

        float sum = a1+a2+a3+a4+a5;
        float percentage = sum/5;
        System.out.println("The Percentage Obtained is: "+ percentage);

        if (sum>=300 && sum<=500){
            System.out.println("Congratulations!! You have successfully cleared the test");
        }
        else if (sum>0 && sum<300){
            System.out.println("Sorry! You have not cleared the assessment. Better luck next time!");
        }
        else {
            System.out.println("Invalid inputs!");
        }
    }
}
