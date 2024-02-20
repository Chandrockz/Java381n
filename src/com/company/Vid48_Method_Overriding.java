package com.company;
class MethA{
    int a;
    public int met1(){
        System.out.println("This is method 1 from class A");
        return a;
    }
    public int met2(int b){
        System.out.println("This is method 2 from class A: " + b);
        return b;
    }
}
class MethB extends MethA{
    int c;
    @Override
    public int met2(int c){
        System.out.println("This is method 2 from class B: " + c);
        return c;
    }
}
public class Vid48_Method_Overriding {
    public static void main(String[] args) {
        MethA m1 = new MethA();
        m1.met1();

        MethB m2 = new MethB();
        m2.met2(44);

    }
}
