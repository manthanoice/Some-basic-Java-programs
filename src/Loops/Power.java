package Loops;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = sc.nextInt();
        System.out.println("Enter b: ");
        int b = sc.nextInt();
        int result = 1;
        for (int i=1; i<=b; i++)
            result = result*a;
        System.out.println("Answer is: "+result);
    }
}
