package OOPS;

import java.util.Scanner;

class primes{
    int n;
    int flag = 0;
    public void isPrime(){
        if(n==0||n==1)
            System.out.println("NOT PRIME");
        else {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    System.out.println(n + " Is not prime!");
                    flag = 1;
                    break;
                }
                if (flag == 0) {
                    System.out.println(n + " is Prime number!");
                    break;
                }            }
        }
    }
}

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        primes p1 = new primes();
        System.out.println("Enter the number you want to check whether it is prime or not: ");
        p1.n = sc.nextInt();
        p1.isPrime();
    }
}
