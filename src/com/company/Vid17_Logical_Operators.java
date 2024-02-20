package com.company;

public class Vid17_Logical_Operators {
    public static void main(String[] args) {
        // && --> AND (*)      (All 3 are logical operators)
        // || --> OR  (+)
        // !  --> Not (invert)

        boolean a = false;
        boolean b = true;
        boolean c = true;

        System.out.println("--------------For Logical AND-------------");

        if (a && b) {
            System.out.println("A & B are true");
        } else if (b && c) {
            System.out.println("B & C are true");
        } else{
            System.out.println("All are false");
        }


        boolean a1 = false;
        boolean b1 = false;
        boolean c1 = false;

        System.out.println("------------For Logical OR--------------");

        if (a1 || b1) {
            System.out.println("A & B are true");
        } else if (b1 || c1) {
            System.out.println("B & C are true");
        } else{
            System.out.println("All are false");
        }

        System.out.println("----------For Logical NOT-------------");
        System.out.println("Not(a) or !a is :"+ !a);
        System.out.println("Not(b) or !b is :"+ !b);
        System.out.println("Not(c) or !c is :"+ !c);

    }
    }
