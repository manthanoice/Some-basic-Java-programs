package Loops;

import java.util.Scanner;

public class FactorialofN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number which you want to get factorial of: ");
        int n = sc.nextInt();
        int sum = 1;
        for (int i=1; i<=n; i++)
            sum = sum*i;
        System.out.println("Factorial of "+n+" is: "+sum);
    }
}
