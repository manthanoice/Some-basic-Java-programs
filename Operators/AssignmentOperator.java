/*
    3 - Assignment operators
    a - = , this simply asigns something to something
    Example int a = 1;

    b - += or -= or /= or *= or %= or <<= or >>=

    int a = 1
    a += 2 is just like a = 2 + 1
    a -= 2 is just like  a = 2 - 1
    a /= 2 is just like  a = 2/1
    a *= 2 is just like  a = 2 * 1
    a %= 2 is just like  a = 2 % 1
    a >>= 2 is just like  a = 2 >> 1
    a <<= 2 is just like a = 2 << 1
*/

package Operators;

import java.util.Scanner;

public class AssignmentOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number a: ");
        int a = sc.nextInt();
        System.out.println("Enter the number b: ");
        int b = sc.nextInt();
//        Here +=.-= etc are assignment operators.
//        a +=2;  --> Same as a=a+2
//        a -=2;  --> Same as a=a-2
//        a *=2;  --> Same as a=a*2
//        a /=2;  --> Same as a=a/2
//        a %=2;  --> Same as a=a%2
        a *=2;
        System.out.println(a);
    }
}
