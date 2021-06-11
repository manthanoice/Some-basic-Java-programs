/*
    We can also use the getNumericValue() method of the Character class to convert the char type variable into int type.

*/

package com.company;

import java.util.Scanner;

public class CharToInt2 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character you want to convert to int: ");
        char c = sc.next().charAt(0);
        int a = Character.getNumericValue(c);
        System.out.println("Converted char is: "+a);
    }
}
