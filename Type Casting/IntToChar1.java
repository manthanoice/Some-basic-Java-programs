package com.company;

import java.util.Scanner;

public class IntToChar1 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the integer you want to convert to char: ");
        int a = sc.nextInt();
        char c = (char)a; //Type conversion
        System.out.println("The converted int is: "+c);
    }
}
