package Loops;

import java.util.Scanner;

public class For4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter till when you want to print odd numbers: ");
        int n = sc.nextInt();
        System.out.println("Odd numbers till "+n+" are: ");
        for (int i=1;i<=n;i=i+2)
            System.out.println(i);
    }
}
