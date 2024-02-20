package com.mypack;

public class SpringTest {
    public static void main(String[] args) {
        String s1 = "A", s2 = "a", s3 = "b";
        s1.toLowerCase();
        s3.replace('b','a');
        System.out.print((s1.equals(s2)) + ", " + (s2.equals(s3)));

    }
}
