package com.company;
import java.util.Scanner;

public class Vid19_Conditionals_Practice {
    public static void main(String[] args) {
        //------------------------Questn-1----------------------------
        /*
        int a = 10;
        if (a == 11) {
            System.out.println("I am 11");
        } else {
            System.out.println("I am not 11");
        }

         */

        //------------------------Questn-2----------------------------
/*
        System.out.println("Enter your marks");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you marks in Physics");
        byte physics = sc.nextByte();                                //Each subject marks

        System.out.println("Enter you marks in Maths");
        byte maths = sc.nextByte();                                  //is considered

        System.out.println("Enter you marks in Chemistry");
        byte chemistry = sc.nextByte();                               //out of 100

        int obtainedMarks = physics + maths + chemistry;
        float percentage = (float) (obtainedMarks)/3;

        if (percentage >= 40 && physics >33 && maths >33 && chemistry >33){
            System.out.println("Your percentage is greater than 40%, i.e " + percentage);
            System.out.println("Congratulations! You are passed ");
        }
        else {
            System.out.println("Your overall percentage is :" + percentage);
            System.out.println("Sorry, You are failed");
        }
*/


        //------------------------Questn-3----------------------------
/*
        Scanner tax = new Scanner(System.in);
        long Income;
        System.out.println("Enter your Income");
        Income = tax.nextLong();

        if (Income < 250000){
            System.out.println("Cheers, You don't need to pay tax");
            System.out.println("Your Take-home will be :"+ Income);
        }
        else if (Income >=250000 && Income < 500000) {
            System.out.println("You have to pay 5% tax to the government");
            double takehome = Income * 0.95;
            System.out.println("Your Take-home will be :"+ (takehome));
            System.out.println("Tax paid by employee is: "+ (Income - takehome));
        }
        else if (Income >= 500000 && Income < 1000000) {
            System.out.println("You have to pay 20% tax to the government");
            double tax2 = (Income*0.95 - 250000);
            double tx2 = (Income * 0.2) + tax2;
            System.out.println("Your Take-home will be :"+ (tx2));
            System.out.println("Tax paid by employee is: "+ (Income - tx2));
        }
        else {
            System.out.println("You have to pay 30% tax to the government");
            double tax2 = (Income - 250000) * 0.05;
            double tx2 = (Income -500000) * 0.20;
            double tax3 = (Income * 0.70) + tax2 + tx2;
            System.out.println("Your Take-home will be :"+ (tax3));
            System.out.println("Tax paid by employee is: "+ (Income - tax3));
        }
        System.out.println("THERE ARE ERRORS IN FORMULAE IN 3RD PROBLEM\n PLEASE FIX THIS");

 */


        //------------------------Questn-4----------------------------

/*
        Scanner week = new Scanner(System.in);
        System.out.println("Enter number to find out the day of the week");
        byte num = week.nextByte();

        switch (num) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");            //Enhanced
            case 3 -> System.out.println("Wednesday");          //Switch-case
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Invalid Entry!");
        }
/* ----------------------Traditional Switch-case----------------
        switch (num){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;

            default:
                System.out.println("Invalid Entry!");
        }

 */


        //------------------------Questn-5----------------------------

        System.out.println("Enter a year");
        Scanner leap = new Scanner(System.in);
        int year = leap.nextInt();
        //float leapYear = year/4.0f;

        if (year % 4 == 0) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }

        //------------------------Questn-6----------------------------

        Scanner website = new Scanner(System.in);
        System.out.println("Enter the website type");
        String url = website.next();
/*
        switch (url) {
            case ".com":
                System.out.println("Commercial website");
                break;
            case ".org":
                System.out.println("Organisation website");
                break;
            case ".in":
                System.out.println("Indian website");
                break;
            default:
                System.out.println("Out of bound request.\n Please enter valid website type");
        }

 */
// --------------------------OR(Alternate method)--------------

        if (url.endsWith(".com")) {
            System.out.println("Commercial website");
        } else if (url.endsWith(".org")) {
            System.out.println("Organisational website");
        } else if (url.endsWith(".in")) {
            System.out.println("Indian website");
        } else {
            System.out.println("website type not found");
        }
    }
}