package com.company;

import java.util.Scanner;

public class CharToInt1 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the char you want to convert to int: ");
        char c = sc.next().charAt(0);
        int a = c;
        System.out.println("Converted char is: "+a);
    }
}
