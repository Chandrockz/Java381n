package com.mypack.demoTwo;
import com.mypack.demoOne.*;
public class Trainee {
    public static void main(String[] args) {
        Employee emp = new Employee();
        System.out.print(" "+ emp.id);
        System.out.print(" "+emp.name);
        System.out.print(" "+emp.role);
    }
}
