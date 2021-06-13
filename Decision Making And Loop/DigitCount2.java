package com.company;

import java.util.Scanner;

public class DigitCount2 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to check how many digits it has: ");
        int count = 0;
        for (int n = sc.nextInt(); n!=0; n/=10, count++){
        }
        System.out.println("Number of digits are/is: "+count);
    }
}
