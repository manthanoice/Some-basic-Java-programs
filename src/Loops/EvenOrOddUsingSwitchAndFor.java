package Loops;

import java.util.Scanner;

public class EvenOrOddUsingSwitchAndFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you want to print odd or even number: ");
        String s = sc.nextLine();
        System.out.println("Enter till when you want to print numbers: ");
        int n = sc.nextInt();
        System.out.println("The "+s+" Numbers till "+n+" are: ");
        switch (s){
            case "Even":
            case "even":
                for (int i=0;i<=n;i+=2)
                    System.out.print(i+" ");
                break;
            case "Odd":
            case "odd":
                for (int i=1;i<=n;i+=2)
                    System.out.print(i+" ");
                break;
            default:
                System.out.println("You might have wrote spelling of odd or even wrong. Please check again");
        }
    }
}
