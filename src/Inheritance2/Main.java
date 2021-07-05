package Inheritance2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name:");
        String s = sc.nextLine();
        Dancer d = new Dancer();
        Parent p = d;
        Dancer d1 = (Dancer)p;
        d1.Dance();
        d.drink();
        p.eat();
    }
}
