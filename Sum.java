package com.company;

import java.util.Scanner;

public class Sum {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two numbers you want to do sum of: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int sum = x+y;
        System.out.println("The sum of " + x + "+" + y + " = "+sum);
    }
}
