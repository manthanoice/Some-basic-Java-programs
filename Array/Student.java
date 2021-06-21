package Array;

import java.io.*;

import java.util.*;

class Student

{

    Scanner sc=new Scanner(System.in);

    int RegNo,Total=0,subjects,Avg=0;

    String name;

    int[] marks;

    Student()

    {

        System.out.print("Enter Registration No.: ");

        RegNo=sc.nextInt();

        System.out.print("Enter Student Name: ");

        name=sc.next();;

        getDisMarks();

    }

    public void getDisMarks()

    {

        marks=new int[3];

        System.out.print("Enter marks of Physics: ");

        marks[0]=sc.nextInt();

        System.out.print("Enter marks of Chemistry: ");

        marks[1]=sc.nextInt();

        System.out.print("Enter marks of Maths: ");

        marks[2]=sc.nextInt();

        for(int i=0;i<3;i++)

        {

            Total+=marks[i];
            Avg=Total/3;

        }

        System.out.println("Total Marks of student "+name+": " +Total);
        System.out.println("Average Marks of student "+name+": " +Avg+"%");

    }

}

class StudentDemo

{

    public static void main(String[] args)

    {

        Student[] s =new Student[5];

        for(int i=0;i<5;i++)

            s[i]=new Student();

    }

}