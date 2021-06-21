package Patterns;

import java.util.Scanner;

public class q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for (int j=i; j<=n; j++){
                System.out.print("  ");
            }
            for (int j=1; j<=2*i-1; j++) {
                if(j==1||j==2*i-1)
                    System.out.print(i+" ");
                else
                    System.out.print("0 ");
            }
            System.out.println();
        }
    }
}
