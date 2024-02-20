package com.company;
import java.util.Scanner;

public class Vid18_SwitchCase {
    public static void main(String[] args) {

        System.out.println("----if-else-if-else ladder---------");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();

      /*  if(age >=0 && age < 6){
            System.out.println("You are areInfant");
        }
        else if (age > 6 && age <= 18) {
            System.out.println("You are teen");
        }
        else if(age > 19 && age <=45){
            System.out.println("You are adult");

        }
        else if(age <=100){
            System.out.println("You are getting old");
        }
        else {
            System.out.println("Age Invalid!");
        }

       */

        //----------------Switch Case Statements--------------------
        //- Switch case is used when we have to make a choice betwn no. of alternatives for a given variable

        System.out.println("-------Switch Case Statements----------");

        switch (age) {
            case 5:
                System.out.println("You are an Infant");
                break;
            case 18:
                System.out.println("You are now an Adult");
                break;
            case 35:
                System.out.println("You are financially Independent");
                break;
            case 60:
                System.out.println("You are now retired");
                break;
            default:
                System.out.println("Life is Short.\n\t\t Live it.");
        }

    }
}
