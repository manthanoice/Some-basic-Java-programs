package com.company;

import java.util.Scanner;

public class Sum {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number till you wanna do sum of: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i=0; i<=n; i++)
            sum=sum+i;
        System.out.println("Sum is: "+sum);
    }
}
