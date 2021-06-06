/*
To understand this first we have to learn what is divisor, quotient, dividend and reminder (This is for some students who doesn't know much about English words)
------------------------------------------|
              5 ---------->Quotient       |
              ____                        |
Divisor<-----5|28 --------> Dividend      |
              |25                         |
              ____                        |
              03 ---------> Reminder      |
------------------------------------------|
*/

package com.company;

import java.util.Scanner;

public class Division {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter dividend: ");
        int dividend = sc.nextInt();
        System.out.println("Enter divisor: ");
        int divisor = sc.nextInt();
        int quotient = dividend/divisor;
        int reminder = dividend%divisor;
        System.out.println("The quotient is: "+quotient);
        System.out.println("The reminder is: "+reminder);
    }
}
