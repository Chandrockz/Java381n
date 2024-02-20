package com.company;


interface myCamera{
    void takeSnap();
    void recordVideo();
    void viewPhotos();
    private void greet(){
        System.out.println("Good Morning");
    }
    default void recordSlowMo(){
        greet();
        System.out.println("Recording in slow motion...");
    }
}
interface myWifi{
    String[] getNetworks = new String[0];
    void connectToNetwork(String network);
    }
class myCellPhone{
    public void makeCall(long PhoneNo){
        System.out.println("Calling " + PhoneNo);
    }
    public void pickcall(){
        System.out.println("Connecting...");
    }

}

class mySmartPhone extends myCellPhone implements myCamera, myWifi{
    public void takeSnap(){
        System.out.println("Taking a selfie");
    }
    public void recordVideo(){
        System.out.println("Recording videos in 4K");
    }
//    public void recordSlowMo(){
//        System.out.println("Recording Ultra Slow");
//    }
    public void viewPhotos(){
        System.out.println("Opening gallery...");
    }
    public String[] getNetworks(){
        System.out.println("Searching for networks...");
        String[] networkList = {"iCorp, Chandrockz, OnePlus 9RT 5G, infy_Bengaluru, <Hidden Networks>"};
        return networkList;
    }
    public void connectToNetwork(String network){
        System.out.println("Connected to " + network);
    }
}
public class Vid57_Default_Methods {
    public static void main(String[] args) {
        myCellPhone nokia = new myCellPhone();
        nokia.pickcall();

        mySmartPhone samsung = new mySmartPhone();
        //samsung.getNetworks();
        String[] networkList =samsung.getNetworks();
        for(String element: networkList){
            System.out.println(element);
        }
        samsung.connectToNetwork("Chandrockz");
        samsung.recordVideo();
        samsung.viewPhotos();
        samsung.makeCall(7038434);
        samsung.recordSlowMo();
        samsung.makeCall(43787);
    }
}
