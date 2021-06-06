/*
Here I have put all the vowels, both upper case and lower case in the if condition so that it will be easier
*/

package com.company;

import java.util.Scanner;

public class Alphabet {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character you want to check whether it is vowel or consonant: ");
        char x = sc.next().charAt(0);
        if(x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u' || x == 'A' || x == 'E' || x == 'I' || x == 'O' || x == 'U')
            System.out.println(x+" is vowel.");
        else
            System.out.println(x+" is consonant.");
    }
}
