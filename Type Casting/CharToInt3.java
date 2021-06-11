package com.company;

import java.util.Scanner;

public class CharToInt3 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character you want to convert to int: ");
        char c = sc.next().charAt(0);
        int a = Integer.parseInt(String.valueOf(c));
        System.out.println("The converted char is: "+a);
    }
}
