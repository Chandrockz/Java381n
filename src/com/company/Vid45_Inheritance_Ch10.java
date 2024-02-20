package com.company;
/* Inheritance is borrowing properties & methods from an existing class.
e.g-
    Phone --> Smartphone            written as --> Smartphone extends Phone
    Animal --> Cat/Dog,etc                     --> Dog extends Animal
    Vehicle --> Car
    (Base --> Derived)
    (Parent class --> Child class)
    (Super class --> Sub class)                --> Sub class extends Super class
    " Inheritance in java is declared using extends keyword "
 */
class Base{
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("Setting up 'X' now");
        this.x = x;
    }
    public void print(){
        System.out.println("This is base(parent) class");
    }
}

class Derived extends Base{         // with extends keyword, the methods and elements
    int y;                          // of base class will be available for derived class

    public int getY() {
        return y;
    }

    public void setY(int y) {
        System.out.println("Setting up 'Y' now");
        this.y = y;
    }
    public void print1(){
        System.out.println("This is derived(child) class");
    }
}
public class Vid45_Inheritance_Ch10 {
    public static void main(String[] args) {

        // Creating an object of base class
        Base b = new Base();
        b.setX(20);
        System.out.println(b.getX());

        // Creating an object of base class
        Derived d = new Derived();
        d.setY(33);
        System.out.println(d.getY());

        d.setX(56);
        System.out.println(d.getX());

    }
}
