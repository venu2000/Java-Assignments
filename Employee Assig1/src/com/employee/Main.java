package com.employee;

public class Main {

    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.name= "venu";
        e1.age= 21;
        e1.city="mumbai";
        Employee e2 = new Employee();
        e2.name = "balu";
        e2.age=25;
        e2.city="guntur";

        System.out.println("Employee name"+e1.name+"Employee age"+e1.age+"Employee city"+e1.city);
        System.out.println("Employee name"+e2.name+"Employee age"+e2.age+"Epmoyee city"+e2.city);
	// write your code here
    }
}
