package Loops;

import java.util.Scanner;

public class Prime1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number you want to check whether it is prime or not: ");
        int n = sc.nextInt();
        boolean isPrime = true;
        for (int i=2; i<n; i++){
            if (n%i==0) {
                isPrime = false;
                break;
            }
        }
        if(isPrime)
            System.out.println(n+" Is prime.");
        else
            System.out.println(n+ " Is not Prime.");
    }
}
