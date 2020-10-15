//package com.employee;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);


//        array
//            collection of elemnts/data of same type

//            datatype[] arr=new datatype[size]
//        float[] numbers=new float[3];

//        numbers[0]=5;
//        numbers[1]=7;
    //        numbers[2]=89;

//
//        for(int i=0;i<3;i++)
//        {
//            System.out.println("enter a number");
//            numbers[i]=sc.nextFloat();
//        }
//
//        for(int i=0;i<3;i++)
//        {
//            System.out.println(numbers[i]);
//        }
//



        Employee[] employees=new Employee[3];

//        sgupta8mz


//        creatin object & get details
        for(int i=0;i<3;i++)
        {
            employees[i]=new Employee();
            employees[i].getDetails();
        }


        //        print details
        for(int i=0;i<3;i++)
        {
            employees[i].displayDetails();
        }










    }
}
