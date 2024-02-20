package com.mypack;
//abstract class Person1{
//    public final void display(){
//        System.out.println("Display method in Person");
//    }
//
//    public static void main(String[] args) {
//        Person1 p = new Student1();
//        p.display();
//    }
//}
//public class Student1 extends Person1{
//    public void display(){
//        System.out.println("Display method in Student");
//    }
//
//}
abstract class BaseAbsClass{
    public void method(){
        System.out.println("BaseAbsClass method");
    }
    public abstract void method2();
}
class Derived extends BaseAbsClass {
    public void method2() {
        System.out.println("Derived method");
    }
}
public class Testing {
    public static void main(String[] args) {
        BaseAbsClass o = new Derived();
        o.method2();
}
}

