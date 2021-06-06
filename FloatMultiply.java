package com.company;

import java.util.Scanner;

public class FloatMultiply {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two floating numbers you want to multiply: ");
        float x = sc.nextFloat();
        float y = sc.nextFloat();
        float sum = x*y;
        System.out.println("The sum of " + x + "*" + y + " = " + sum);
    }
}
