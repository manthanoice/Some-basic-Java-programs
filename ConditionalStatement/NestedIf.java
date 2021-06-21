package ConditionalStatement;

import java.util.Scanner;

public class NestedIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = sc.nextInt();
        System.out.println("Enter b: ");
        int b = sc.nextInt();
        if (a>=1 && a<=100 && b>=1 && b<=100)
            System.out.println("A and B is between 1 and 100.");
        else
            System.out.println("A and b is not between 1 and 100.");
    }
}
