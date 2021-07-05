package Encapsulation;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Functions f1 = new Functions();
        char repeat;
        do {
            System.out.println("-----------BASIC CALCULATOR-----------");
            System.out.println("Enter the first number: ");
            int n = sc.nextInt();
            f1.setX(n);
            System.out.println("Enter the second number: ");
            int m = sc.nextInt();
            f1.setY(m);
            System.out.println("Enter which function you want to perform for the following number: ");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Remainder");
            int z = sc.nextInt();
            switch (z) {
                case 1 -> f1.setC('+');
                case 2 -> f1.setC('-');
                case 3 -> f1.setC('*');
                case 4 -> f1.setC('/');
                case 5 -> f1.setC('%');
            }
            System.out.println("----------- THANK YOU :D -----------");
            System.out.println("Enter do you want to repeat: Y or N: ");
            repeat = sc.next().charAt(0);
        }while (repeat=='y'|| repeat=='Y');
    }
}
