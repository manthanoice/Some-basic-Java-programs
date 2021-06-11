/*
    I have used the forDigit() method converts the specified int value into char value.
    Here, a is radix value for decimal and hexadecimal number respectively.
    That is, if the int value is between 0 to 9, we use 10 as radix value, if the int value is between 0 to 15, we use 16, and so on.
 */

package com.company;

import java.util.Scanner;

public class IntToChar2 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the int you want to convert to char: ");
        int a = sc.nextInt();
        char c = Character.forDigit(a,10);
        System.out.println("The converted int is: "+c);
    }
}
