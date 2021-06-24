package String;

import java.util.Scanner;

public class StringIntro2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char xx;
        do {
            System.out.println("Enter the first String: ");
            String s1 = sc.nextLine();
            System.out.println("Enter the Second String: ");
            String s2 = sc.nextLine();
            System.out.println("\nEnter which function you want to perform: ");
            System.out.println("\n1. To check both strings are same or not.\n2. To Concat both strings.");
            System.out.println("-----------------------------------------------------------------------------------------------");
            int n = sc.nextInt();
            System.out.println();
            switch (n) {
                case 1 -> {
                    boolean check = s1.equals(s2);
                    if (check)
                        System.out.println("Both strings are same!!");
                    else
                        System.out.println("Oops! Strings are not same!!");
                }
                case 2 -> System.out.println("The combined string is: " + s1.concat(s2));
            }
            System.out.println();
            System.out.println("-----------------------------------------------------------------------------------------------");
            System.out.println("Do you want to continue Y/N?");
            xx=sc.next().charAt(0);
        }while (xx=='y');
    }
}
