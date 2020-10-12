package com.EmployeeData;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        float tax=0;
        String name;
        int age,as;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter Name,age and AnnualSalary Of Employee");
//        name=sc.nextLine();
        age=sc.nextInt();
        as=sc.nextInt();
        name=sc.nextLine();
        if(as>=500000)
        {
            System.out.println("your Tax is 20%");
        }
        else if(as>=400000)
        {
            System.out.println("your Tax is 15%");
        }
        else if(as>=300000)
        {
            System.out.println("your Tax is 10%");
        }
        else if(as>=200000) {
            System.out.println("your Tax is 5%");
        }
        else
        {
            System.out.println("for you NO Tax is there");
        }
//        EmployeeData e1 = new EmployeeData();
//        e1.name = "vishnu";
//        e1.age = 20;
//        e1.as = 200000;
//        e1.display();


	// write your code here
    }
}
