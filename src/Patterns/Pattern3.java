package Patterns;

import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows you want to print: ");
        int n = sc.nextInt();
        int n1=0;
        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                System.out.print("  ");
            }
            for (int j=i; j<=n; j++){
                n1++;
                System.out.print(n1+" ");
            }
            System.out.println();
        }
    }
}
