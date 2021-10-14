package EmployeeManagementSystem;

import java.io.File;
import java.util.Scanner;


public class EmployeeShow {

        public void viewFile(String s) throws Exception
        {

            File file = new File("file"+s+".txt");
            Scanner sc = new Scanner(file);

            while (sc.hasNextLine())
            {
                System.out.println(sc.nextLine());
            }
        }


}
