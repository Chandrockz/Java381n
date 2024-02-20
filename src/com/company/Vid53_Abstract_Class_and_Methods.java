package com.company;
abstract class Parent{
   public Parent(){
       System.out.println("I am a constructor of Parent class");
    }
    public void sayNamaste(){
        System.out.println("Namaskaram! ");
    }
    abstract void greet();
   abstract void greet2();
}
class Child1 extends Parent{
    @Override
    public void greet(){
        System.out.println("Good Morning");
    }
    @Override
    public void greet2(){
        System.out.println("Good Afternoon");
    }
}
abstract class Child2 extends Parent{

    public void sayHey(){
        System.out.println("Hey");
    }
}
public class Vid53_Abstract_Class_and_Methods {
    public static void main(String[] args) {
     //   Parent p = new Parent();    // throws error becoz its an abstract class
        Child1 c1 = new Child1();
        c1.greet();
        c1.greet2();

//       Child2 c2 = new Child2();       // throws error becoz its an abstract class
//        c2.greet();

//        {
//            @Override
//            void greet() {
//
//            }
//
//            @Override
//            void greet2() {
//
//            }
//        }

//        {
//            @Override
//            void greet() {
//            }
//
//            @Override
//            void greet2() {
//            }
//        };

    }
}
