package com.company;

interface Bicycle{
    int a = 33;
    void applyBrake(int decrement);
    void speedUp(int increment);
}

class AtlasCycles implements Bicycle{
    void blowHorn(){
        System.out.println("``ppepeeepepe peopopoeoeppeooo``");
    }
    public void applyBrake(int decrement){
        System.out.println("Applying brake");
    }
    public void speedUp(int increment){
        System.out.println("Applying accelerator");
    }
}

public class Vid54_Interfaces_Ch11 {
    public static void main(String[] args) {
        AtlasCycles atlas = new AtlasCycles();
        // You can create properties in interfaces
        atlas.applyBrake(30);
        atlas.speedUp(20);
        System.out.println(Bicycle.a);
        // You cannot modify the properties in interfaces as they are final
       // Bicycle.a = 333;                //throws error
        //System.out.println(Bicycle.a);

    }
}
