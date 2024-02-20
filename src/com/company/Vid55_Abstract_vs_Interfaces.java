package com.company;
interface Bicycle1 {
    int a = 33;

    void applyBrake(int decrement);

    void speedUp(int increment);
}
interface stuntBicycle{
    int x = 259;
    void wheelie();
    void stoppie();
}
class AvonCycles implements Bicycle1, stuntBicycle{
    void blowHorn(){
        System.out.println("``ppepeeepepe peopopoeoeppeooo``");
    }
    public void applyBrake(int decrement){
        System.out.println("Applying brake");
    }
    public void speedUp(int increment){
        System.out.println("Applying accelerator");
    }
    public void wheelie(){
        System.out.println("Running on rear wheel");
    }
    public void stoppie(){
        System.out.println("Stopping on front wheel");
    }
}

public class Vid55_Abstract_vs_Interfaces {
    public static void main(String[] args) {
        AvonCycles avon = new AvonCycles();
        avon.wheelie();
        avon.stoppie();
        avon.applyBrake(44);
        avon.speedUp(22);
    }

}
