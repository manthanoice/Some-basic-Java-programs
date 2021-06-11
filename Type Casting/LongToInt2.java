package com.company;

import java.util.Scanner;

public class LongToInt2 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the long number you want to convert to int: ");
        long a = sc.nextLong();
        int n = Math.toIntExact(a);
        System.out.println("Answer is: "+n);
    }
}
