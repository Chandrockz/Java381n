package com.practice;
class Rectangle1{
    int l;
    int b;

    public int getL() {
        return l;
    }

    public void setL(int l) {
        this.l = l;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
    public int area(){
        int a = l*b;
        return a;

    }
    public int perimeter(){
        int p = 2*(l+b);
        return p;
    }

}
public class Shape {
    public static void main(String[] args) {
        Rectangle1 rect1 = new Rectangle1();
//        rect1.l = 20;
//        rect1.b = 10;

        rect1.setB(10);
        rect1.setL(40);
//        rect1.getL();
//        rect1.getB();


        System.out.println("Area: "+ rect1.area());
        System.out.println("Perimeter: "+ rect1.perimeter());

    }

}
