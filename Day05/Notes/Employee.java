//package com.employee;
import java.util.Scanner;
public class Employee {

    Scanner sc=new Scanner(System.in);
    public String name;
    public int age;

        public void getDetails(){

            System.out.println("Enter the name");
            name=sc.nextLine();
            System.out.println("Enter the age");
            age=sc.nextInt();



        }
         public void displayDetails(){

             System.out.println("the name is "+name+" and the age is "+age);

         }




}
