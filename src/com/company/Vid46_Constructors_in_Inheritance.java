package com.company;

class Base1{
    Base1(){
        System.out.println("I am a base1 class constructor");
    }
    Base1(int x){
        System.out.println("I am an overloaded base1 class constructor with value x: " + x);
    }
}
class Derived1 extends Base1{
    Derived1(){
        super(44);
        System.out.println("I am a derived1 class constructor");
    }
    Derived1(int x, int y){
        super(x);
        System.out.println("I am an overloaded derived1 class constructor with value y: "+ y);
    }
}

class ChildOfDerived1 extends Derived1{
    ChildOfDerived1(){
        super(31,32);
        System.out.println("I am childofderived1 constructor");
    }
    ChildOfDerived1(int x,int y, int z){
        super(x,y);
        System.out.println("I am overloaded childofderived1 constructor with value z: " + z);
    }
}
public class Vid46_Constructors_in_Inheritance {
    public static void main(String[] args) {
        //Base1 b1 = new Base1(44);
        //Base1 b1 = new Base1();
        //System.out.println(b1);

        //Derived1 d1 = new Derived1(55,66);
        Derived1 d1 = new Derived1();
        System.out.println(d1);

        //ChildOfDerived1 cd1 = new ChildOfDerived1(78,75,72);
        //ChildOfDerived1 cd1 = new ChildOfDerived1();
        //System.out.println(cd1);
    }

}
