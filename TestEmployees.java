package Employee;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class TestEmployees {
    void addEmployees() {

        Scanner s=new Scanner(System.in);
        System.out.println("==============="+"===============");
        System.out.println(" Employee Personal Details");
        System.out.println("==============="+"===============");

        String name;
        int age;
        int year;
        String employeeNum;

        List<Employee> employeeList=new ArrayList<Employee>();

        for(int i=0;i<2;i++)
        {
            int employeeNumber=i+1;
            System.out.println("Please enter data for the Employee Number "+employeeNumber);

            System.out.println("Enter Employee Name");
            name=s.nextLine();

            System.out.println("Enter Employee Age");
            age=s.nextInt();

            System.out.println("Enter Employee Year");
            year=s.nextInt();

            s.nextLine();
            System.out.println("Enter Employee Enrollment Number");
            employeeNum=s.nextLine();

            Employee  employee=new Employee (name,age,year,employeeNum);

            employeeList.add(employee);



        }

        for(int j=0;j<employeeList.size();j++)
        {
            Employee em=employeeList.get(j);

            System.out.println("Employee Number"+(j+1));
            System.out.println("Name: "+ em.getName() +" Age: "+em.getAge()
                    +" Year:"+em.getYear()+" Enrollment Number: "+em.getemployeeNum());



        }
}
