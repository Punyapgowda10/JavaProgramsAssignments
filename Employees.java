import java.util.Scanner;
public class Employees{
    Scanner sc=new Scanner(System.in);
    String name;
    int age;
    double Salary;

    public void getDetails(){
        System.out.println("Enter name,age,Salary");
        name=sc.next();
        age=sc.nextInt();
        Salary=sc.nextDouble();

    public void displayDetails(){
        System.out.println(name+ " " +age);
        }
    public void takeLevel(){
        System.out.println("You have a leave of 2 Days");
        }

    }
}
