package com.company;
interface sampleInterface{
    void meth1();
    void meth2();
}
interface childSampleInterface extends sampleInterface{
    void meth3();
    void meth4();
}

class SampleClass implements  childSampleInterface{
    public void meth1(){
        System.out.println("Method-1");
    }
    public void meth2(){
        System.out.println("Method-2");
    }
    public void meth3(){
        System.out.println("Method-3");
    }
    public void meth4(){System.out.println("Method-4");   }
}
public class Vid58_Inheritance_in_Interfaces {
    public static void main(String[] args) {
        SampleClass sclass = new SampleClass();
        sclass.meth1();
        sclass.meth2();
        sclass.meth3();
        sclass.meth4();
    }
}
