/*
    Here I have converted using two methods,

    1. Using String.valueOf(Char array "c") function.
    2. Using String constructor which takes character array "c" as the parameter for conversion.
*/

package com.company;

public class CharToStr2 {
    public static void main (String[] args){
        char[] c = {'m','a','n','t','h','a','n'};
        String s1 = String.valueOf(c);
        String s2 = new String(c);
        System.out.println(s1);
        System.out.println(s2);
    }
}
