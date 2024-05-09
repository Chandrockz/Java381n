package com.company;
import java.lang.Math;
// ------------------------- Rectangle --------------------------
class Rect {
    int length;
    int breadth;

    public int getLength(){ return length; }

    public void setLength(int l){ this.length = l; }

    public int getBreadth(){ return breadth; }

    public void setBreadth(int b){ this.breadth = b; }

    public int area(){
        int a = length*breadth;
        return a;
    }

    public int perimeter(){
        int p = 2*(length+breadth);
        return p;
    }
}
// ------------------------- Square --------------------------
class Square{
    int side;

    public int getSide(){ return side; }
    public void setSide(int s){ this.side = s; }

    public int area1(){
        int a1 = side*side;
        return a1;
    }

    public int perimeter1(){
        int p1 = 4*side;
        return p1;
    }

}
// ------------------------- Circle --------------------------
class Circ {
    float radius;

    public float getRadius(){ return radius; }
    public void setRadius(float rc){ this.radius = rc; }

    public double areac(){
        double ac = (Math.PI)*radius*radius;
        return ac;
    }
    public double circumference(){
        double circum = 2*Math.PI*radius;
        return circum;
    }
}
// ------------------------- Cylinder ------------------------
class Cylinder{
    float height;
    float radiuscy;

    public float getHeightcy(){ return height; }
    public void setHeightcy(float h){ this.height = h; }

    public float getRadiuscy(){ return radiuscy; }
    public void setRadiuscy(float rcy){ this.radiuscy = rcy; }

    public double SA(){
        double sa = 2*Math.PI*radiuscy*(height+radiuscy);
        return sa;
    }
    public double volc(){
        double vol = Math.PI*radiuscy*radiuscy*height;
        return vol;
    }
}
// ------------------------- Sphere --------------------------
class Sphere{
    float radiussp;

    public float getRadiussp(){ return radiussp; }
    public void setRadiussp(float rs){ this.radiussp = rs; }

    public double spSA(){
        double sa = 4*Math.PI*radiussp*radiussp;
        return sa;
    }
    public double spVol(){
        double vol= 4*Math.PI*radiussp*radiussp*radiussp/3;
        return vol;
    }
}

public class Vid68_CustomPackages_Practice {
    public static void main(String[] args) {
        // Q1
        Rect rect = new Rect();
        rect.setLength(30);
        rect.setBreadth(10);
        System.out.println("The area of rectangle is: " + rect.area());
        System.out.println("The perimeter is: " + rect.perimeter() + "\n");

        // Q2
        Square sq = new Square();
        sq.setSide(10);
        System.out.println("The area of square is: " + sq.area1());
        System.out.println("The perimeter is: " + sq.perimeter1()+ "\n");

        // Q3
        Circ cir = new Circ();
        cir.setRadius(20);
        System.out.println("The area of a circle is: " + cir.areac());
        System.out.println("The circumference is: " + cir.circumference() + "\n");

        // Q4
        Cylinder cy = new Cylinder();
        cy.setRadiuscy(5);
        cy.setHeightcy(20);
        System.out.println("The surface area of a cylinder is: " + cy.SA());
        System.out.println("The volume is: " + cy.volc() + "\n");

        // Q5
        Sphere sp = new Sphere();
        sp.setRadiussp(30);
        System.out.println("The surface area of a sphere is: "+ sp.spSA());
        System.out.println("The volume is: "+ sp.spVol() + "\n");
    }
}

