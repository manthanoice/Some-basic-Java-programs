package Loops;

import java.util.Scanner;

public class For1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter till number you want to print: ");
        int n = sc.nextInt();
        for (int i=0; i<=n; i++)
            System.out.println("The answer is: "+i);
    }
}
