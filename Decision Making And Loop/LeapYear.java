package com.company;

import java.util.Scanner;

public class LeapYear {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year you want to check whether it is leap year or not: ");
        int n = sc.nextInt();
        if(n%4==0)
            System.out.println("It is a leap year");
        else if (n%100==0)
            System.out.println("It is a leap year");
        else if (n%400==0)
            System.out.println("It is a leap year");
        else
            System.out.println("It is not a leap year");
    }
}
