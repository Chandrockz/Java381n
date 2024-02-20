package com.company;

public class Vid15_String_Methods_Practice {
    public static void main(String[] args) {

                               //Video_no_15
        //-------------------------Questn 1------------------------------

        String name = "My Name is CHANDRAKIRAN";
        name = name.toLowerCase();
        System.out.println(name);

        //-------------------------Questn 2------------------------------

        System.out.println(name.replace(" ","_"));


        //-------------------------Questn 3------------------------------

        String letter = "Dear <|name|>, Thanks a lot";
        letter = letter.replace("<|name|>","Chandrakiran");
        System.out.println(letter);


        //-------------------------Questn 4------------------------------

        String detect = "This string contains  double and   triple spaces";
        System.out.println(detect.indexOf("  "));
        System.out.println(detect.indexOf("   "));

        //-------------------------Questn 5------------------------------

        String letter1 = "Dear Harry,\n\t This Java Course is Nice.\n\t Thanks!";
        System.out.println(letter1);
    }
}
