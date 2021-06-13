package com.company;

import java.util.Scanner;

public class Factorial {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to find factorial of: ");
        int n = sc.nextInt(); //You can take biginteger as datatype to get larger value ;)
        int sum = 1;
        for (int i=1; i<=n; i++){
            sum = sum*i;
        }
        System.out.println("Factorial is: "+sum);
    }
}
