package com.company;
class Phone {
    public void On() {
        System.out.println("Turning on the Phone...");
    }

    public void call() {
        System.out.println("Making a call from nokia...");
    }
}

class SmartPhone extends Phone{
        public void call(){
            System.out.println("Making a call from iphone...");
        }
        public void music(){
            System.out.println("Playing music...");
        }
}

public class Vid49_Dynamic_Methods_Dispatch {
    public static void main(String[] args) {
//        Phone nokia = new Phone();
//        nokia.call();
//        nokia.On();
//
//        SmartPhone iphone = new SmartPhone();
//        iphone.call();
//        iphone.On();

        Phone iphone = new SmartPhone();    //Allowed
        iphone.call();                      // calls method from subclass(smartphone class)
        iphone.On();                        // calls On method from superclass(as it only class)
        //iphone.music();                     // Not allowed

    }
}
