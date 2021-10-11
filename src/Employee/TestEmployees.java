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

        String name;
        int age;
        int year;
        String employeeNum;

        List<Employee> employeeList = new ArrayList<Employee>();

        for (int i = 0; i < 2; i++) {
            int employeeNumber = i + 1;
            System.out.println("Please enter data for the Employee Number " + employeeNumber);

            System.out.print("Enter Employee Name ");
            name = s.nextLine();

            System.out.print("Enter Employee Age ");
            age = s.nextInt();

            System.out.print("Enter Employee Year");
            year = s.nextInt();

            s.nextLine();
            System.out.print("Enter Employee Enrollment Number");
            employeeNum = s.nextLine();

            Employee employee = new Employee(name, age, year, employeeNum);

            employeeList.add(employee);


        }

        for (int j = 0; j < employeeList.size(); j++) {
            Employee em = employeeList.get(j);

            System.out.println("Employee Number" + (j + 1));
            System.out.println("Name: " + em.getName() + " Age: " + em.getAge()
                    + " Year:" + em.getYear() + " Enrollment Number: " + em.getemployeeNum());


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
                    Employee em = employeeList.get(k);
                    if ((n.toLowerCase()).equals(em.getName().toLowerCase())) {
                        System.out.println("Employee is present in the database");
                        System.out.println("Details of the Employee");
                        System.out.println("Name: " + em.getName() + " Age: " + em.getAge()
                                + " Year: " + em.getYear() + " Enrollment Number: "
                                + em.getemployeeNum());


                        System.exit(0);
                    }


                }
                System.out.println("Record not found");
                break;

            case 2:
                System.out.println("Enter the serial number of employee ");
                int c = s.nextInt();

                Employee em = employeeList.get(c);
                System.out.println("Please enter the new information");


                System.out.println("Enter Employee Name");
                s.nextLine();
                name = s.nextLine();
                em.setName(name);

                System.out.println("Enter Employee Age");
                age = s.nextInt();
                em.setAge(age);

                System.out.println("Enter Employee Year");
                year = s.nextInt();
                em.setYear(year);

                s.nextLine();
                System.out.println("Enter Employee Enrollment Number");
                employeeNum = s.nextLine();


                System.out.println("Updated Information");
                System.out.println("Details of the Student");
                System.out.println("Name: " + em.getName() + " Age: " + em.getAge()
                        + " Year: " + em.getYear() + " Enrollment Number: "
                        + em.getemployeeNum());


        }

    }

}
