package com.Percentage;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=0,b=0,c=0,d=0,e=0,num=(a+b+c+d+e);
        float avg=(num/500*100);
        System.out.println("enter a,,b,c,d,e");

        avg = sc.nextFloat();
        if((avg>85)&&(avg<100)) {
            System.out.println("your grade is 'A' and Per is above " +avg);
        }
        else if((avg>65)&&(avg<35))
        {
            System.out.println("your grade is 'B' and Per is above " +avg);
        }
        else if((avg>35)&&(avg<65))
        {
            System.out.println("your grade is 'c' and Per is above " +avg);
        }
        else
        {
            System.out.println("you are failed try again in next exam,good luck");
        }


	// write your code here
    }
}
