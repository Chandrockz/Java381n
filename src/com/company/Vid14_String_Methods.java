package com.company;

public class Vid14_String_Methods {
    public static void main(String[] args) {

        String name = "Chandrockz";
        System.out.println(name);

        String a = "  SriMahaVishnu  ";
        System.out.println(a);

        /*
        String Lcase = name.toLowerCase();
        name.toLowerCase(Locale.ROOT);
        System.out.println(Lcase);

        String Ucase = name.toUpperCase();
        name.toUpperCase(Locale.ROOT);
        System.out.println(Ucase);

        int value = name.length();
        name.length();
        System.out.println(value);


        String Trim = a.trim();
        a.trim();
        System.out.println(Trim);

        String b = a.toLowerCase();
//        System.out.println(b);
//        System.out.println(Trim + b);

        String c = a.substring(5,9);
        a.substring(5,9);
        System.out.println(c);

        System.out.println(name.replace('C','B'));

        System.out.println(name.startsWith("Ch"));
        System.out.println(a.startsWith("Srm"));

        System.out.println(name.endsWith("kz"));
        System.out.println(a.endsWith("un"));

        System.out.println(name.charAt(5));
        System.out.println(a.charAt(5));

        System.out.println(name.indexOf("a "));
        System.out.println(name.indexOf("rockz",2));
        */

        System.out.println(name.equals("CHandrockz"));
        System.out.println(name.equalsIgnoreCase("CHanDrOckz"));

        //System.out.println("This is escape sequence "adding double quote""); // gives error
        System.out.println("This is escape sequence\' adding double quote");
        System.out.println("This is escape sequence\n adding double quote");
        System.out.println("This is escape sequence\t adding double quote"); //insert a tab space in place of "\'"


    }
}
