package Loops;

import java.util.Scanner;

public class Fibbonacci {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int f = 0;
        int g = 1;
        System.out.println("Enter till how many num you want the series: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print(f + " ");
            f = f + g;
            g = f - g;
        }
    }
}
