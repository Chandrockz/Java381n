package com.company;

public class Vid16_If_else {
    public static void main(String[] args) {
        int physics = 88;
        int chemistry = 78;
        int maths = 71;
        int obtainedmarks = physics + chemistry + maths;
        double percentage = (double) (obtainedmarks * 100)/300;

        System.out.println("Your Obtained Percentage is : " + percentage + "%");

        if (percentage > 75){
            System.out.println("You are eligible for placements ");
        }
        else {
            System.out.println("Sorry, you are not eligible!");
        }

    }
}
