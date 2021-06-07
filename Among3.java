package com.company;

import java.util.Scanner;

public class Among3 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int x = sc.nextInt();
        System.out.println("Enter second number: ");
        int y = sc.nextInt();
        System.out.println("Enter third number: ");
        int z = sc.nextInt();
        if (x>y && x>z)
            System.out.println(x+" is the largest number.");
        else if (y>x && y>z)
            System.out.println(y+" is the largest number.");
        else if (z>x && z>y)
            System.out.println(z+" is the largest number.");
        else if (x==y && y==z && z==x )
            System.out.println("All numbers are same");
    }
}
