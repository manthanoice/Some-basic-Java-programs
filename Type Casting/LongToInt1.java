package com.company;

import java.util.Scanner;

public class LongToInt1 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the long number: ");
        long a = sc.nextLong();
        int b = (int)a;
        System.out.println("Converted long to int is: "+b);
    }
}
