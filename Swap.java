/* This is logic of swap which is mostly used by programmers in various language.
Here you can see, first I declared new int temp and the logic explanation is like this:

    Suppose x = 12 and y = 21 then,
    temp = x = 12 --> Here value of x = 12 will be assigned to temp, so temp = 12
    x = y = 21 --> Here value of y = 21 will be assigned to x, so new x = 21
    y = temp = 12 --> Here value of temp = 12 will be assigned to y, so new y = 12

This was swapping logic
*/
package com.company;

import java.util.Scanner;

public class Swap {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int x = sc.nextInt();
        System.out.println("Enter the secnd number: ");
        int y = sc.nextInt();
        System.out.println("--------BEFORE SWAP OF NUMBERS--------");
        System.out.println("The first number is: "+x);
        System.out.println("The second number is: "+y+"\n");
        int temp;
        temp = x;
        x = y;
        y = temp;
        System.out.println("--------AFTER SWAP OF NUMBERS--------");
        System.out.println("The first number is: "+x);
        System.out.println("The second number is: "+y);
        //Another way
    }
}
