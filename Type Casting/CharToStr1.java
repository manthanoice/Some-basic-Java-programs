/*
    Here function .toString of character has been used to convert character to string
    So it will go like "Character.toString(varchar)"
*/

package com.company;

import java.util.Scanner;

public class CharToStr1 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the char you want to convert to string: ");
        char c = sc.next().charAt(0);
        String s = Character.toString(c);
        System.out.println("The new string is: "+s);
    }
}
