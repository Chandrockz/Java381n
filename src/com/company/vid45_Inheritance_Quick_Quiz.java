package com.company;
class Animal{
    String a;
    public String getA(){
        return a;
    }
    public void setA(String a){
        System.out.println("Setting name for a");
        this.a = a;
    }
}
class Dog extends Animal{
    String pub;

    public String getPub() {
        return pub;
    }

    public void setPub(String pub) {
        System.out.println("Setting up nick-name for pub");
        this.pub = pub;
    }
}
public class vid45_Inheritance_Quick_Quiz {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.setA("Tiger");
        System.out.println(animal.getA());

        Dog dog = new Dog();
        dog.setPub("Siberian Husk");
        System.out.println(dog.getPub());

        dog.setA("Lion");
        System.out.println(dog.getA());
    }
}
