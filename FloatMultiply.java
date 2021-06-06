package com.company;

import java.util.Scanner;

public class FloatMultiply {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first floating number: ");
        float x = sc.nextFloat();
        System.out.println("Enter second floating number: ");
        float y = sc.nextFloat();
        float sum = x*y;
        System.out.println("The sum of " + x + " * " + y + " = " + sum);
    }
}
