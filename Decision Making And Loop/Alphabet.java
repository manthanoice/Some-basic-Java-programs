package com.company;

import java.util.Scanner;

public class Alphabet {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter character that want to get checked: ");
        char c = sc.next().charAt(0);
        if(c>='a'&&c<='z'||c>='A'&&c<='Z')
            System.out.println(c+" is a alphabet.");
        else
            System.out.println(c+" is not an alphabet.");
    }
}
