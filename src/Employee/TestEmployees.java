package Employee;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


public class TestEmployees {
    void addEmployees() {

        Scanner s = new Scanner(System.in);
        System.out.println("===============" + "===============");
        System.out.println(" Employee Personal Details");
        System.out.println("===============" + "===============");
        int employee_id;
        int salary;
        int age;
        int phone_number;
        String name;
        String address;
        String email_id;


        List<EmployeeInformation> employeeList = new ArrayList<EmployeeInformation>();

        for (int i = 0; i < 2; i++) {
            int employeeNumber = i + 1;
            System.out.println("Please enter data for the Employee Number " + employeeNumber);

            System.out.print("Enter Employee Name ");
            name = s.nextLine();

            System.out.print("Enter Employee Age ");
            age = s.nextInt();

            System.out.print("Enter Employee salary ");
            salary = s.nextInt();

            s.nextLine();
            System.out.print("Enter Employee address ");
            address = s.nextLine();

            System.out.print("Enter Employee email_id ");
            email_id = s.nextLine();
            s.nextLine();

            System.out.print("Enter Employee_id  ");
            employee_id= s.nextInt();

            System.out.print("Enter Employee phone number  ");
            phone_number= s.nextInt();



            EmployeeInformation employee =new EmployeeInformation(name, age, salary, address,email_id,phone_number);

            employeeList.add(employee);


        }

        for (int j = 0; j < employeeList.size(); j++) {
            EmployeeInformation em = employeeList.get(j);

            System.out.println("Employee Number" + (j + 1));
            System.out.println("Name: " + em.getName() + " Age: " + em.getAge()
                    + " salary:" + em.getSalary() + " address: " + em.getAddress()+ "email_id" +em.getEmail_id()+ "phone_number" +em.phone_number());


        }

        int choice;
        System.out.println("Please enter 1 to check whther a employee is there in the database or not");
        System.out.println("Please enter 2 to change information of existing employee");

        choice = s.nextInt();

        switch (choice) {
            case 1:

                System.out.println("Check whether a Employee exists in the database or not");

                System.out.println("Please enter the name of employee you want to search");

                String n = s.nextLine();

                for (int k = 0; k < employeeList.size(); k++) {
                    EmployeeInformation em = employeeList.get(k);
                    if ((n.toLowerCase()).equals(em.getName().toLowerCase())) {
                        System.out.println("Employee is present in the database");
                        System.out.println("Details of the Employee");
                        System.out.println("Name: " + em.getName() + " Age: " + em.getAge()
                                + " salary:" + em.getSalary() + " address: " + em.getAddress()+ "email_id" +em.getEmail_id()+ "phone_number" +em.phone_number());




                        System.exit(0);
                    }


                }
                System.out.println("Record not found");
                break;

            case 2:
                System.out.println("Enter the serial number of employee ");
                int c = s.nextInt();

                EmployeeInformation em = employeeList.get(c);
                System.out.println("Please enter the new information");


                System.out.println("Enter Employee Name");
                s.nextLine();
                name = s.nextLine();
                em.setName(name);

                System.out.println("Enter Employee Age");
                age = s.nextInt();
                em.setAge(age);

                System.out.print("Enter Employee salary ");
                salary = s.nextInt();
                em.setSalary(salary);

                s.nextLine();
                System.out.print("Enter Employee address ");
                address = s.nextLine();
                em.setAddress(address);

                System.out.print("Enter Employee email_id ");
                email_id = s.nextLine();
                em.setEmail_id(email_id);
                s.nextLine();

                System.out.print("Enter Employee_id  ");
                employee_id= s.nextInt();
                em.setEmployee_id(employee_id);


                System.out.print("Enter Employee phone number  ");
                phone_number= s.nextInt();
                em.setPhone_number(phone_number);



                System.out.println("Updated Information");
                System.out.println("Details of the Student");
                System.out.println("Name: " + em.getName() + " Age: " + em.getAge()
                        + " salary:" + em.getSalary() + " address: " + em.getAddress()+ "email_id" +em.getEmail_id()+ "phone_number" +em.phone_number());



        }

    }

}
