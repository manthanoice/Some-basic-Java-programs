package com.company;

import java.util.Scanner;

public class Table {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to get table of: ");
        int n = sc.nextInt();
        System.out.println("Table of "+n+" is: ");
        for (int i=1; i<=10; i++)
            System.out.println(n+" * "+i+" = "+n*i);
    }
}
