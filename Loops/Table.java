package Loops;

import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter which number's table you want to print: ");
        int n = sc.nextInt();
        System.out.println("Enter till how many numbers you want to print the table: ");
        int x = sc.nextInt();
        int sum =0;
        System.out.println("Table of "+n+" Till "+x+" is: ");
        for (int i=1;i<=x;i++) {
            sum = i * n;
            System.out.println(n+" * "+i+" = "+sum);
        }
    }
}
