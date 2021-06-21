package Patterns;

import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n till when you want to print table: ");
        int n = sc.nextInt();
        int sum = 1;
        for (int i=1; i<=n; i++){
            for (int j=1; j<=10; j++){
                sum = i*j;
                System.out.println(i+" * "+ j+ " = "+ sum);
            }
            System.out.println();
        }
    }
}
