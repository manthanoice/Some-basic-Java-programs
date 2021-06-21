package Loops;

import java.util.Scanner;

public class SumOfN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter till how much you want to do sum: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i=1;i<=n;i++)
            sum=sum+i;
        System.out.println("Sum till "+n+" is: "+sum);
    }
}
