package com.mypack.demoTwo;
import java.io.*;
 class Car {
     public void printTopSpeed() {
         System.out.println(" The Top speed of vehicle is 100 kmph");
     }

     public void printTopSpeed(int topSpeed) {
         System.out.println(" The Top speed of vehicle is " + topSpeed + " kmph");
     }

     public void printTopSpeed(String vehicleName, int topSpeed) {
         System.out.println(" The Top speed of vehicle " + vehicleName + " is" + topSpeed + "kmph");
     }
 }
public class Solution {
    public static void main(String[] args) {
        Car car = new Car();
        car.printTopSpeed();
        car.printTopSpeed(150);
        car.printTopSpeed("Cyber Truck", 200);
    }

}
