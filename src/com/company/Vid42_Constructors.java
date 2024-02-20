package com.company;
class MyNewEmployee{
    private int id;
    private String name;
    private int salary;
    public  MyNewEmployee(){
        id = 1232;
        name = "Mr. Chandrockz";
        salary = 90000;
    }
    public MyNewEmployee(String myName){
        name = myName;
    }
    public MyNewEmployee(String myName, int myId){
        name = myName;
        id = myId;
    }
    public MyNewEmployee(String myName, int myId, int mySalary){
        name = myName;
        id = myId;
        salary = mySalary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){this.name = n; }
    public void setId(int i){
        this.id = i;
    }
    public int getId(){
        return id;
    }
    public int getSalary(){
        return salary;
    }

}

public class Vid42_Constructors {
    /* Constructors --> A member function is used to initialize
                        an object while creating it.
                    --> In order to create our own constructor,
                        we define a method with same name as class name.
     */
    public static void main(String[] args) {

    MyNewEmployee chandrockz = new MyNewEmployee();
    //MyNewEmployee chandrockz = new MyNewEmployee("Mr.Chandrakiran");
    //MyNewEmployee chandrockz = new MyNewEmployee("Mr.Chandrakiran",12283);
    //MyNewEmployee chandrockz = new MyNewEmployee("Mr.Chandrakiran Chilmulwar",1228312, 90000);
    //chandrockz.setName("Chandrakiran");            // It is not feasible to set properties
    // chandrockz.setId(1228312);                     // for every attributes, therefore
        System.out.println(chandrockz.getName());  //  we can use constructors for
        System.out.println(chandrockz.getId());    //  setting all up in one place
        System.out.println(chandrockz.getSalary());

    }
}
