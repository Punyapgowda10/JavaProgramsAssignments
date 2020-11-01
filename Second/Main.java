package com.Second;
import java.util.Scanner;

public class Main {
    Scanner sc=new Scanner(System.in);

    public static void main(String[] args) {
//        Employee1 e=new Employee1();
        Employees e= new Employees();
        e.getDetails();
        e.displayDetails();
        e.work();
        e.takeLeave();
//        Employees e=new Employees();
//

    }
}
