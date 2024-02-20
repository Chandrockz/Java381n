package com.company;
// ------------------------ Q1 ------------------------------
abstract class Pen{
    abstract void write();
    abstract void refill();
}
// ------------------------ Q2 ------------------------------
class FountainPen extends Pen{
    public void write(){
        System.out.println("Write an essay");
    }
    public void refill(){
        System.out.println("Pen ink has been depleted, need to refill");
    }
    void changeNib(){
        System.out.println("Changing the pen nib");
    }
}
// ------------------------ Q3 ------------------------------
class Monkey{
    void jump(){
        System.out.println("Jumping...");
    }
    void bite(){
        System.out.println("Biting...");
    }
}
interface BasicAnimal{
    void eat();
    void sleep();
}
class Human extends Monkey implements BasicAnimal{
    void speak(){
        System.out.println("Hello, I am Chandrakiran. Nice to meet you! ");
    }
    @Override
    public void eat() {
        System.out.println("Eating");
    }

    @Override
    public void sleep() {
        System.out.println("Sleeping");
    }
}
// ------------------------ Q4 ------------------------------
abstract class Telephone{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}
class SmartTelephone extends Telephone{
    void playMusic(){
        System.out.println("Playing songs from YouTube...");
    }
    public void ring(){
        System.out.println("Ringing...");
    }
    @Override
    public void lift(){
        System.out.println("Answering the call");
    }
    public void disconnect(){
        System.out.println("Disconnected");
    }
}

// ------------------------ Q5 ------------------------------
// .. see in main method
// ------------------------ Q6 ------------------------------
interface tvRemote{
    void changeChannel();
    void increaseVol();
    void decreaseVol();
}
interface SmartTvRemote extends tvRemote{
    void voiceRecognition();
    void screenCast();
    void ott();
}
class SonyBravia implements SmartTvRemote{
    @Override
    public void changeChannel() {
        System.out.println("Changing channel");
    }

    @Override
    public void increaseVol() {
        System.out.println("Increasing volume");
    }

    @Override
    public void decreaseVol() {
        System.out.println("Decreasing volume");
    }

    @Override
    public void screenCast() {
        System.out.println("Sharing smartphone screen in tv");
    }

    @Override
    public void voiceRecognition() {
        System.out.println("OK Google... Open Netflix");
    }

    @Override
    public void ott() {
        System.out.println("Opening Amazon prime video");
    }
}
// ------------------------ Q7 ------------------------------
class TV implements tvRemote{
    @Override
    public void changeChannel() {
        System.out.println("Changing channel in TV");
    }

    @Override
    public void increaseVol() {
        System.out.println("Increasing volume in TV");
    }

    @Override
    public void decreaseVol() {
        System.out.println("Decreasing volume in TV");
    }
}
public class Vid60_abstract_Interfaces_Practice {
    public static void main(String[] args) {
        // Q1 & Q2
        FountainPen fp = new FountainPen();
        fp.changeNib();
        fp.refill();

        // Q3
        Human human = new Human();
        human.eat();
        human.sleep();
        human.speak();

        // Q4
        SmartTelephone s = new SmartTelephone();
        s.playMusic();
        s.ring();
        s.lift();
        s.disconnect();

        // Q5
        Monkey monkey = new Human();
        monkey.bite();
        monkey.jump();
        //monkey.speak();       --> Cannot use this, because reference is monkey

        // Q6
        SonyBravia bravia = new SonyBravia();
        bravia.changeChannel();
        bravia.increaseVol();
        bravia.voiceRecognition();
        bravia.ott();

        // Q7
        TV tv = new TV();
        tv.changeChannel();
        tv.decreaseVol();
        tv.increaseVol();
    }
}
