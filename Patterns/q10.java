package Patterns;

import java.util.Scanner;

public class q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = sc.nextInt();
        for (int i=1; i<=n; i++){
            for (int j=i; j<=n; j++){
                System.out.print("  ");
            }
            for (int j=1; j<=i; j++){
                if (j==1||i==j||i==n)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
