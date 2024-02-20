package com.practice;


class Base{
    int number = 1234;
    float f2 = 1234;
    double d2 = 1234.0;
    long num = 1234;
    public static void method(int a){
        System.out.println("Base Method");
    }
}
class Derived extends Base{
    public static void method(int a){
        System.out.println("Derived Method");
    }
}
public class Java_programming_funda_assessment {
    public static void main(String[] args) {
        Base obj = new Derived();
        obj.method(5);
    }
}
