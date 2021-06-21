package WhileLoop;

import java.util.Scanner;

public class NumOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number whose digit you want to count: ");
        int n = sc.nextInt();
        int numOfdigit = (int) Math.log10(n)+1;
        System.out.println("Digits in "+n+" are: "+numOfdigit);
    }
}
