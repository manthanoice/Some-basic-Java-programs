package Loops;

import java.util.Scanner;

public class For2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word you want to repeat: ");
        String s = sc.nextLine();
        System.out.println("Enter how many times you want to repeat the word: ");
        int n = sc.nextInt();
        System.out.println("Well the answer is: ");
        for (int i=1; i<=n; i++)
            System.out.println(s);
    }
}
