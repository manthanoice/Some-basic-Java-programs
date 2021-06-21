package ConditionalStatement;

import java.util.Scanner;

public class ElseIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Enter any number to check whether it is bigger than another number you have entered or not: ");
        int a = sc.nextInt();
        System.out.println("2. Enter any number to check whether it is bigger than another number you have entered or not: ");
        int b = sc.nextInt();
        if (a>b)
            System.out.println(a+" is larger.");
        else if (a==b)
            System.out.println("A and B, Both are same.");
        else
            System.out.println(b+" is larger.");
    }
}
