package com.company;

// ------------------------- Problem-1 & 2 -----------------------------
// Surface area and volume of a cylinder

class Cylinder{
    private int radius;
    private int height;
    //private float area;
    private int volume;
    float pi = 3.1415f;
    public Cylinder(int myRadius, int myHeight){        // problem 3
        radius = myRadius;
        height = myHeight;
    }

    public void setRadius(int r){
        this.radius = r;
    }
    public void setHeight(int h){
        this.height = h;
    }
    public int getRadius(){
        return radius;
    }
    public int getHeight(){
        return height;
    }
    public  float getArea(){
        //float pi = 3.14f;
        float area = (2*pi*radius*height) + 2*pi*radius*radius ;
        return area;
    }
    public float getVolume() {
        float volume = pi * radius * radius * height;
        return volume;
    }
}
// ------------------------- Problem-4 -----------------------------
class Rectangle1{
    private int length;
    private  int breadth;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }
    public int getArea1(){
        int area1 = length*breadth;
        return area1;
    }
    public int getPerimeter1(){
        int perimeter1 = 2*(length + breadth);
        return perimeter1;
    }

    public Rectangle1(){
        length = 20;
        breadth = 8;
    }
    public Rectangle1(int l, int b){
        length = l;
        breadth = b;
    }
}
// ------------------------- Problem-5 -----------------------------
class Sphere{
    int radius1;
    float pi = 3.1415f;
    public Sphere(){
        radius1 = 20;
    }
    public Sphere(int radii){
        radius1 = radii;
    }

    public int getRadius1() {
        return radius1;
    }

    public void setRadius1(int radius1) {
        this.radius1 = radius1;
    }
    public float getSA(){
        float surfaceArea = 4*pi*radius1*radius1 ;
        return surfaceArea;
    }
    public float getSphVol(){
        float sphereVol = 4*pi*radius1*radius1*radius1/3 ;
        return sphereVol;
    }
}


public class Vid44_Ps_Chapter9 {

    public static void main(String[] args) {
    //Cylinder cylinder = new Cylinder();           // problem 1 & 2
    Cylinder cylinder = new Cylinder(8,20);     // problem 3
//    cylinder.setHeight(9);                        // problem 1 & 2
//    cylinder.setRadius(3);
//        System.out.println("The height is: " + cylinder.getHeight());
//        System.out.println("The radius is: " + cylinder.getRadius());
        System.out.println("Height = "+cylinder.getHeight());
        System.out.println("Radius = "+cylinder.getRadius());
        System.out.println("The surface area of cylinder is "+cylinder.getArea());
        System.out.println("The volume of cylinder is "+cylinder.getVolume());

        // ---------------- problem 4 -----------------
        //Rectangle1 rectangle1 = new Rectangle1();
        Rectangle1 rectangle1 = new Rectangle1(40,18);
        System.out.println("Length = "+ rectangle1.getLength());
        System.out.println("Breadth = "+ rectangle1.getBreadth());
        System.out.println("Area = "+ rectangle1.getArea1());
        System.out.println("Perimeter = "+ rectangle1.getPerimeter1());

        // ---------------- problem 5 -----------------
        //Sphere sphere = new Sphere();
        Sphere sphere = new Sphere(8);
        //sphere.setRadius1(10);
        System.out.println("Radius of a sphere = "+ sphere.getRadius1());
        System.out.println("Surface Area of a sphere = "+ sphere.getSA());
        System.out.println("Volume of a sphere = "+ sphere.getSphVol());
    }
}
