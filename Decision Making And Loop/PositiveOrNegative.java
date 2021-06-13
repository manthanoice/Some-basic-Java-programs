package com.company;

import java.util.Scanner;

public class PositiveOrNegative {
    public static void main (String[] args){
        System.out.println("Enter the number you want to check whether it is positive or negative: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n>0)
            System.out.println(n+" is positive");
        else if (n==0)
            System.out.println(n+" is neither positive nor negative");
        else
            System.out.println(n+" is negative");
    }
}
