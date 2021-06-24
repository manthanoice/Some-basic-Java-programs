package ConditionalStatement;

import java.util.Scanner;

public class IfUsingTernaryOperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = sc.nextInt();
        System.out.println("Enter b: ");
        int b = sc.nextInt();
        int max = a>b ? a : b; //variable = condition ? exprIfTrue : exprIfFalse
        System.out.println("Max num is: "+max);
    }
}
