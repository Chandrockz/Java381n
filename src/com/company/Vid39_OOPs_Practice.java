package com.company;
class Employee1{        // Question-1
        int salary;
        String name;
    public int getSalary(){
        System.out.println("My salary is " + salary + "k per month");
        return salary;
    }
    public String getName(){
        System.out.println("My name is " + name);
        return name;
    }
    public void setName(String n){
        name = n;
    }


}
class Cellphone{       // Question-2
    public void ring(){
        System.out.println("Ringing...");
    }
    public void vibrate(){
        System.out.println("Vibrating...");
    }
    public void callFriend(){
        System.out.println("Calling a friend...");
    }
}
class Square{              // Question-3
    int side;
    public int area() {
        int a = side * side;
        System.out.println("The area of a square is " + a + " sq.mt.");
        return a;
    }
    public int perimeter(){
            int p = 4*side;
        System.out.println("The perimeter of a square is " + p + " mt.");
        return p;
        }

    }
class Rectangle{            // Question-4
    int length;
    int breadth;

    public int area1(){
        int a1 = length*breadth;
        System.out.println("The area of a rectangle is " + a1 + " sq.mt.");
        return a1;
    }
    public int perimeter1(){
        int p1 = 2*(length+breadth);
        System.out.println("The perimeter is " + p1 + " mt");
        return p1;
    }
}

class TommyVecetti{            // Question-5
    public void hit(){
        System.out.println("Hitting the enemy");
    }public void run(){
        System.out.println("Running from the enemy");
    }public void fire(){
        System.out.println("Firing on the enemy");
    }
}

class Circle{       // Question-6
    float radius;
    float pi = 3.14f;
  public float area2(){
      float a2 = pi*radius*radius;
      System.out.println("The area of a circle is " + a2 + " sq.mt");
      return a2;
  }
  public float circumference(){
      float c = 2*pi*radius;
      System.out.println("and the circumference is " + c + " mt");
      return c;
  }
}

public class Vid39_OOPs_Practice {

    public static void main(String[] args) {
// ----------------------- Problem-1 ---------------------------
//        Employee1 chandrockz = new Employee1();
//        chandrockz.salary = 150;
//        chandrockz.setName("Chandrakiran Chilmulwar");
//        chandrockz.getName();
//        //System.out.println(chandrockz.getSalary());
//        chandrockz.getSalary();

// ----------------------- Problem-2 ---------------------------
      /*  Cellphone oneplus = new Cellphone();
        oneplus.ring();
        oneplus.vibrate();
        oneplus.callFriend();

// ----------------------- Problem-3 ---------------------------
        Square square = new Square();
        square.side = 5;
        square.area();
        square.perimeter();
// ----------------------- Problem-4 ---------------------------
        Rectangle rectangle = new Rectangle();
        rectangle.length = 6;
        rectangle.breadth = 4;
        rectangle.area1();
        rectangle.perimeter1();
// ----------------------- Problem-5 ---------------------------
        TommyVecetti tom = new TommyVecetti();
        tom.hit();
        tom.run();
        tom.fire();

       */
// ----------------------- Problem-6 ---------------------------
        Circ circle = new Circ();
        circle.radius = 5.5f;
        circle.area2();
        circle.circumference();

    }
}
