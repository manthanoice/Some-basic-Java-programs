package Loops;

import java.util.Scanner;

public class For3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter till when you want to print even numbers: ");
        int n = sc.nextInt();
        System.out.println("Even numbers till "+n+" are: ");
        for (int i=0;i<=n;i=i+2)
            System.out.println(i);
    }
}
