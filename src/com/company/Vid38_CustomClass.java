package com.company;

//public class CustomClass{             //This gives error
//                                      //because, in one java file,
//}                                     //there can be only one public class.
class Employee {                      // This won't give error becoz we
         int age;                                    // haven't specified any access modifier(Public, etc)
         int id;                                    // haven't specified any access modifier(Public, etc)
         int salary;
         String name;

    public void printDetails() {
        System.out.println("My name is " + name);
        System.out.println("My Employee id is " + id);
        System.out.println("My age is " + age);
    }
    public int getSalary(){
        System.out.println("My salary is " + salary + "k per month");
        return salary;
    }
}

    public class Vid38_CustomClass {
        public static void main(String[] args) {
            Employee chandrockz = new Employee();       // Instantiating the new employee object
            Employee john = new Employee();

            // Setting up Properties/Attributes
            chandrockz.age = 24;
            chandrockz.id = 1228312;
            chandrockz.name = "Chandrakiran";
            chandrockz.salary = 120;
            john.age = 26;
            john.id = 1283429;
            john.name = "John Mathews";
            john.salary = 80;

//          System.out.println(chandrockz.age);
//          System.out.println(chandrockz.id);
//          System.out.println(chandrockz.name);

            chandrockz.printDetails();              // using objects in class
            chandrockz.getSalary();
            System.out.println(" ");                // Just to separate space between two objects
            john.printDetails();
            john.getSalary();

            // Any real world object = Properties + Behaviour( Verb )
            // Objects in OOPs = Attributes + Methods
        }
    }
