package com.Avengers;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);


        int[]numbers = new int[5];
        numbers[0]=5;
        numbers[1]=7;
        numbers[2]=89;
        numbers[3]=89;
        numbers[4]=89;
//        numbers[5]=89;
//
//        for(int i=0;i<10;i++)
//        {
//            System.out.println("enter a numbers");
//            numbers[i] = sc.nextInt();
//        }
//        for(int i=0;i<10;i++)
//        {
//            System.out.println(numbers[i]);
//        }
//
        Avengers[] avenger =new Avengers[3];

        for(int i=0;i<5;i++)
        {
            avenger[i] = new Avengers();
            avenger[i].getDetails();
        }

        for(int i=0;i<5;i++)
        {
            avenger[i].displayDetails();
        }



//        2nd answer:-

//        for(int i=0;i<5;i++)
//        {
//            if(i%2!=0){
//                System.out.println(i+"are odd values");
//            }
//        }

//     3rd answer:-

//        values[]value = new values[5];
//
//
//        for(int i=0;i<5;i++)
//           {
//               value[i] = new values();
//               value[i].getdetails();
//           }
//
//        for(int i=0;i<5;i++)
//        {
//            value[i].displaydetails();
//        }
//



	// write your code here
    }
}
