package Patterns;

import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows you want to print: ");
        int n = sc.nextInt();
//        System.out.println("Enter which number you want to print in pattern: ");
//        int n1 = sc.nextInt();
        for (int i=1; i<=n; i++){
            for (int j=i; j<=n; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
