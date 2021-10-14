package EmployeeManagementSystem;


import java.io.IOException;
import java.util.Scanner;

public class Main {



    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        EmployeeShow epv =new EmployeeShow();

        int i=0;

        while(i<6)
        {
            MainMenu mm = new MainMenu();
            mm.menu();

            System.out.print("\nPlease Enter choice :");
            i=Integer.parseInt(sc.nextLine());

            switch(i)
            {
                case 1:
                {
                    /** Creating class's object and calling Function using that object **/
                    EmployeeAdd ep =new EmployeeAdd();
                    ep.createFile();
                    break;
                }
                case 2:
                {
                    System.out.print("\nPlease Enter Employee's ID :");
                    String s=sc.nextLine();
                    try
                    {
                        epv.viewFile(s);}
                    catch(Exception e){System.out.println(e);}


                    System.out.print("\nPress Enter to Continue...");
                    sc.nextLine();

                    break;
                }

                case 3:
                {
                    System.out.print("\nPlease Enter Employee's ID :");
                    String s=sc.nextLine();
                    EmployeeRemove epr =new EmployeeRemove();
                    epr.removeFile(s);

                    System.out.print("\nPress Enter to Continue...");
                    sc.nextLine();

                    break;
                }
                case 4:
                {
                    System.out.print("\nPlease Enter Employee's ID :");
                    String I=sc.nextLine();
                    try
                    {
                        epv.viewFile(I);
                    }
                    catch(Exception e)
                    {
                        System.out.println(e);
                    }
                    EmployeeUpdate epu = new EmployeeUpdate();
                    System.out.print("Please Enter the detail you want to Update :");
                    System.out.print("\nFor Example :\n");
                    System.out.println("If you want to Change the Name, then Enter Current Name and Press Enter. Then write the new Name then Press Enter. It will Update the Name.\n");
                    String s=sc.nextLine();
                    System.out.print("Please Enter the Updated Info :");
                    String n=sc.nextLine();
                    try
                    {
                        epu.updateFile(I,s,n);

                        System.out.print("\nPress Enter to Continue...");
                        sc.nextLine();

                        break;
                    }
                    catch(IOException e)
                    {
                        System.out.println(e);
                    }
                }
                case 5:
                {
                    CodeExit obj = new CodeExit();
                    obj.out();
                }
                break;
                default:
                    throw new IllegalStateException("Unexpected value: " + i);
            }
        }
    }


    }


