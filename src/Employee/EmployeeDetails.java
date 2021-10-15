package EmployeeManagementSystem;
import java.util.Scanner;

public class EmployeeDetails {
    String name;
    String father_name;
    String email;
    String position;
    String employ_id;
    String employ_salary;
    String employ_contact;
    public void getInfo()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Employee's name --------: ");
        name=sc.nextLine();
        System.out.print("Enter Employee's Father name -: ");
        father_name=sc.nextLine();
        System.out.print("Enter Employee's ID ----------: ");
        employ_id=sc.nextLine();
        System.out.print("Enter Employee's Email ID ----: ");
        email=sc.nextLine();
        System.out.print("Enter Employee's Position ----: ");
        position=sc.nextLine();
        System.out.print("Enter Employee contact Info --: ");
        employ_contact=sc.nextLine();
        System.out.print("Enter Employee's Salary ------: ");
        employ_salary=sc.nextLine();
    }


}