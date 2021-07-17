//This program tells us about run time polymorphism and it's also known and overriding

package Polymorphism;

import java.util.Scanner;

public class mainClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dog d1 = new Dog();
//        Pet p1 = new Pet();
//        System.out.println("Enter name of pet");
//        p1.s = sc.nextLine();
//        System.out.println("Enter name of Dog");
//        d1.s = sc.nextLine();
//        p1.eat();
//        d1.eat();
//        p1.name();
//        d1.name();
        Pet p1 = d1;
        Animal a1 = d1;
        d1.eat();
        p1.eat();
    }
}
