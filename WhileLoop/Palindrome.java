package WhileLoop;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to check whether it is palindrome or not: ");
        int n = sc.nextInt();
        int temp =n;
        int rev=0;
        while (temp>0){
            int last = temp%10;
            temp = temp/10;
            rev = rev*10+last;
        }
        if (rev==n) {
            System.out.println(n + " is Palindrome.");
        }
        else {
            System.out.println(n + " is not Palindrome.");
        }
    }
}
