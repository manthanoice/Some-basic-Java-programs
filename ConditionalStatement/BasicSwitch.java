package ConditionalStatement;

import java.util.Scanner;

public class BasicSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any vale: ");
        int n = sc.nextInt();
        switch (n) {
            case 1 -> System.out.println("Value is 1.");
            case 2 -> System.out.println("Value is 2.");
            case 3 -> System.out.println("Value is 3.");
            case 4 -> System.out.println("Value is 4.");
            default -> System.out.println("Helluu idk shit.");
        }
    }
}
