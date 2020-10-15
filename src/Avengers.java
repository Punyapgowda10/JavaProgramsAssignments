package com.Avengers;
import java.util.Scanner;

public class Avengers {
Scanner sc=new Scanner(System.in);
//    public String name,power,weapon,planet;//    public int age;
//        public void getDetails(){
//            System.out.println("enter the name");
//            name=sc.nextLine();
//            System.out.println("enter the age");
//            age=sc.nextInt();
//            System.out.println("enter the power");
//            power=sc.nextLine();
//            System.out.println("enter the weapon");
//            weapon=sc.nextLine();
//            System.out.println("enter the planet");
//            planet=sc.nextLine();
//        }
//        public void displayDetails(){
//            System.out.println("The name is" +name+ "the age is" +age+ "power"+power+ "weapon is" +weapon+ "planet is" +planet);
//        }
//}
//    3rd answer:-

    public int A=1, B=2, C=3, D=4, E=5;
    public int sum=A+B+C+D+E;

    public void getDetails(){
        System.out.println("enter the 5 values");
        sum = sc.nextInt();
    }

    public void displayDetails(){
        System.out.println("the sum of values are" + sum);
    }
}



