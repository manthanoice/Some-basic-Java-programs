package Loops;

import java.util.Scanner;

public class Prime3 {
    static boolean isPrime (int n){
        if(n<=1)
            return false;
        for (int i=2; i<n; i++)
            if(n%i==0)
                return false;
            return true;
    }
    static void printPrime (int n){
        for (int i=2; i<=n; i++){
            if(isPrime(i))
                System.out.print(i+" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num till you want to print prime numbers: ");
        int n = sc.nextInt();
        System.out.println("Prime numbers are: ");
        printPrime(n);
    }
}
