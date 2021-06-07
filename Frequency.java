package com.company;

import java.util.Scanner;

public class Frequency {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s = sc.nextLine();
        System.out.println("\nEnter which character you want to find: ");
        char c = sc.next().charAt(0);
        int freq=0;
        for (int i=0; i<s.length(); i++){
            if(c == s.charAt(i))
                ++freq;
        }
        System.out.println("\nFrequency of "+c+" is "+freq+".");
    }
}
