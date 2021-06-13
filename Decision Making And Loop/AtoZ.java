package com.company;

public class AtoZ {
    public static void main (String[] args){
        System.out.println("This program will print all the alphabets in lower case: ");
        char c;
        for (c='a'; c<='z';c++)
            System.out.print(c+" ");
        System.out.println("\nThis will print all alphabets in upper case: ");
        for (c='A'; c<='Z';c++)
            System.out.print(c+" ");
    }
}
