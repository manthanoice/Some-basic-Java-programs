/*
    In this program, we have a string stored in the variable s. We use String's toCharArray() method to convert the string to an array of characters stored in c.
    We then, use Arrays's toString() method to print the elements of chars in an array-like form.
 */

package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class StrToChar {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string you want to convert to char: ");
        String s = sc.nextLine();
        char[] c = s.toCharArray();
        System.out.println("Converted character array is: "+ Arrays.toString(c));
    }
}
