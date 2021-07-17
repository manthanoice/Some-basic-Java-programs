//In this code, we will do upcasting
//To understand upcast, just remember we will typecast child object to a parent object!
//Animal is parent and cat is child

package UpCastingAndDownCasting;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name: ");
        String s = sc.nextLine();
        System.out.println("Enter the age: ");
        int n = sc.nextInt();
        Cat c = new Cat();
        Animal a = c;
        a.name=s;
        a.age=n;
        a.name();
        a.age();
        System.out.println(c instanceof Cat);
        System.out.println(c instanceof Animal);
        System.out.println(a instanceof Cat);
    }
}
