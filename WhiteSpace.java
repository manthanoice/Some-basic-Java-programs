/*
    Here I have used replaceAll function and it's syntax is like: replaceAll(String regex, String replacement)

    Where regex = thing you want to replace (Here \\s means whitespace to replace with..)

    The reason I have taken \\s not \s because I was writing it as string and while writing as string I have to use two backslashes.

    replacement = what you want to replace with  (..no space so "")
*/

package com.company;

import java.util.Scanner;

public class WhiteSpace {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter some string with so many whitespaces: ");
        String s = sc.nextLine();
        s = s.replaceAll("\\s","");
        System.out.println("The new string without whitespace is: "+s);
    }
}
