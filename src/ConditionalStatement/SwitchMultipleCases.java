package ConditionalStatement;

import java.util.Scanner;

public class SwitchMultipleCases {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to give rating to our app from 1 to 5: ");
        int rating = sc.nextInt();
        switch (rating) {
            case 1, 2 -> System.out.println("App is bad. :(");
            case 3 -> System.out.println("App is average. :)");
            case 4, 5 -> System.out.println("App is amazing. :D");
            default -> System.out.println("You have entered wrong rating!! Please check again the number that you have entered!!!");
        }
    }
}
