/*
    Refer to notes I made for myself

    PS: This comment is just for reminder for myself just in case I get confused again! xD
 */

package com.company;

import java.util.Scanner;

public class Fibonacci {
    static int fb (int n){
        if (n<=1)
            return  n;
        else
            return fb(n-1)+fb(n-2);
    }
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter till which number you want to print fibonacci series: ");
        int n = sc.nextInt();
        System.out.print("Fibonacci series till "+n+" is: ");
        for (int i=0; i<=n; i++){
            System.out.print(fb(i)+" ");
        }
    }
}
