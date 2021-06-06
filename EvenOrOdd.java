/*
Here the logic to check even or odd is like using the reminder:
    If we divide 4 by 2 then the reminder will be 0, so it will be even number.
    If we divide 7 by 2 then reminder will be 1, so it will be odd number.
    So the logic I wrote in if is like: If reminder is 0 then even else (reminder >0 ) then oddd.
*/

package com.company;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to check whether it is odd or even: ");
        int n = sc.nextInt();
        if(n%2==0)
            System.out.println(n+ " is even.");
        else
            System.out.println(n+ " is odd.");
    }
}
