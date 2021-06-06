package com.company;

import java.util.Scanner;

public class ASCII {
    
    public static void main (String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the charter whose ASCII value you want to find: ");
        
        char x = sc.next().charAt(0); //There is no way to take value of char from user like nextInt() so I have used .next() and then using index I have taken input from user.
        int y = x; //I used JAVA widening type casting here, so here I assigned char x -> int y so it will give ASCII value
        
        System.out.println("The ASCII value of "+ x +" is: "+y);
        
    }
}
