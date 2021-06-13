/*
    Example of how recursion works:

          num = 82695
            reverse(82695)
               |
               |__print(5)
                  reverse(8269)
                        |
                        |__print(9)
                           reverse(826)
                                |
                                |__print(6)
                                   reverse(82)
                                       |
                                       |__print(2)
                                          reverse(8)
                                              |
                                              |__print(8)
                                                 return

Credits: https://www.geeksforgeeks.org/java-program-to-find-reverse-of-a-number-using-recursion/
 */
package com.company;

import java.util.Scanner;

public class ReverseNum {
    static int revnum (int n){
        if (n<10) {
            System.out.println(n);
        }
        else {
            System.out.print(n % 10);
            revnum(n / 10);
        }
        return 0;
    }
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to reverse: ");
        int num = sc.nextInt();
        System.out.print("The reversed number is: ");
        revnum(num);
    }
}
