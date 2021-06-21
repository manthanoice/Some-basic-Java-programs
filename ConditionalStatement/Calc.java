package ConditionalStatement;

import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = sc.nextInt();
        System.out.println("Enter second number: ");
        int b = sc.nextInt();
        System.out.println("Enter the operator you want to perform from +,-,*,/ or %: ");
        char operation = sc.next().charAt(0);
        int result = 0;
        switch (operation){
            case '*' -> result = a*b;
            case '+' -> result = a+b;
            case '-' -> result = a-b;
            case '/' -> result = a/b;
            case '%' -> result = a%b;
            default -> System.out.println("Invalid number or operator: ");
        }
        System.out.println("The answer is: "+result);
    }
}
