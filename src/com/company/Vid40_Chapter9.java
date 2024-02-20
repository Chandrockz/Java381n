package com.company;

class MyEmployee{

    // Getters --> returns the value (accessors)
    // Setters --> sets/updates the value (mutators)
    private int id;             // Private access modifier is used to
    private String name;        // prevent anyone from randomly modify our variables
    public String getName(){
        //System.out.println("The employee name is " + name);
        return name;
    }
    public void setName(String n){
        this.name = n;                  //this.name is discussed in next videos
    }
    public void setId(int i){
        this.id = i;
    }
    public int getId(){
        //System.out.println("The employee id is " + id);
        return id;
    }
}

public class Vid40_Chapter9 {
    public static void main(String[] args) {
        MyEmployee employee = new MyEmployee();
//        employee.name = "Chandrakiran";         // Now, due to 'private' access modifier
//        employee.id = 1228312;                  // it is throwing an error

        employee.setName("Chandrakiran Chilmulwar");
        employee.setId(1228312);
        //employee.getName();
        //employee.getId();
        System.out.println(employee.getName());
        System.out.println(employee.getId());
    }
}
