package com.company;
interface calling{
    void makeCalls();
    void pickCalls();
    void sendText();
}
interface myCamera2{
    void takeSnap();
    void recordVideo();
    void playVideos();
}
interface entertainment {
    void playMusic();

    void connectWifi(String network);
    void games();
}

class MyPhone {
    public void makeCalls(long PhoneNo){
        System.out.println("Calling... "+ PhoneNo);
    }
    public void pickCalls(long PhoneNo){
        System.out.println("Answering... "+ PhoneNo);
    }
    public void sendText(String a){
        System.out.println("Sending message to " + a);
    }
}
class MySmartPhone extends MyPhone implements  myCamera2, entertainment {
    public void takeSnap(){
        System.out.println("Photo capturing successful!");
    }
    public void recordVideo(){
        System.out.println("Video recorded successful!");
    }
    public void playVideos(){
        System.out.println("Playing videos...");
    }
    public void playMusic(){
        System.out.println("Playing your favorite music...");
    }

    public void connectWifi(String network){
        System.out.println("Connected to " + network);
    }
    public void games(){
        System.out.println("Playing COD mobile game");
    }

    @Override
    public void makeCalls(long Phone) {
        System.out.println("Calling... "+ Phone);
    }
    @Override
    public void pickCalls(long Contact){
        System.out.println("answering... "+ Contact);
    }
    @Override
    public void sendText(String m){
        System.out.println("Sending message... "+ m);
    }
}
public class Vid59_Polymorphism_in_Interfaces {
    public static void main(String[] args) {
        MyPhone mp = new MyPhone();
        mp.makeCalls(34767863);
        mp.pickCalls(63474676);
        mp.sendText("Chandrockz");

        MySmartPhone msp = new MySmartPhone();
        msp.connectWifi("SAMSUNG S22 ULTRA");
        msp.games();
        msp.playMusic();
        msp.sendText("Akshay");
        //msp.takeSnap();
        //msp.playVideos();
        //msp.recordVideo();
        msp.pickCalls(7038434);
    }
}
