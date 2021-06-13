/*
    This is only useful if number doesn't have 0s before it.
    i.e: If entered number is 0034 then output will be 2 not for
*/

package com.company;

import java.util.Scanner;

public class DigitCount {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the you want to check how many digits it has: ");
        int n = sc.nextInt();
        int count = 0;
        while (n!=0){
            n/=10;
            count++;
        }
        if (count==1)
            System.out.println("Number of digit is: "+count);
        else
            System.out.println("Number of digits are: "+count);
    }
}
