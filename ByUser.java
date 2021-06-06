package com.company;

import java.util.Scanner;

public class ByUser {
    public static void main (String args[]){
        
        Scanner sc = new Scanner(System.in); //To take input from keyboard by the user
        
        System.out.println("Enter the number you want to enter: ");
        int x = sc.nextInt(); //To read the input entered by user
        System.out.println("The number you have entered is: "+x);
    }
}
