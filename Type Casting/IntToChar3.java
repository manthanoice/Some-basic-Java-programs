/*
     This is only applicable for int value 0 to 9.
 */

package com.company;

import java.util.Scanner;

public class IntToChar3 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the int you want to convert to char: ");
        int a = sc.nextInt();
        char c = (char) (a+'0');
        System.out.println("Converted int is: "+c);
    }
}
