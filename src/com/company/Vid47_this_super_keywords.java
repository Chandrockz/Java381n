package com.company;

class ClassOne{
    int a;
    public int getA(){
        return a;
    }
    ClassOne(){
        System.out.println("This is a classone constructor");
        this.a=a;
    }
    ClassOne(int a){
        System.out.println("This is a overloaded classone constructor");
        this.a=a;
    }
}
class ClassTwo extends ClassOne{
    int b;

    public int getB() {
        return b;
    }

    ClassTwo(int b) {
        //super(b);
        this.b = b;
        System.out.println("I am an overloaded classtwo constructor");
    }
    ClassTwo(){
        System.out.println("I am a classtwo constructor");
    }
}
public class Vid47_this_super_keywords {
    public static void main(String[] args) {
//        ClassOne c1 = new ClassOne(555);
//        System.out.println(c1);

//        ClassTwo c2 = new ClassTwo(111);
//        System.out.println(c2);
        ClassTwo c2 = new ClassTwo(4444);
        System.out.println(c2);
    }
}
