package Constructors;

import java.util.Scanner;

class dogggg{
    Scanner sc = new Scanner(System.in);
    int leg, eye;
    String name;
    public dogggg() {
        System.out.println("Enter name of your dog: ");
        name = sc.nextLine();
        System.out.println("Your dog name is: "+name);
        System.out.println("Enter how many logs do your dog has: ");
        leg = sc.nextInt();
        System.out.println(name+" has "+leg+" legs");
        System.out.println("Enter how many eyes do your dog has: ");
        eye = sc.nextInt();
        System.out.println(name+" has "+eye+" eyes");
    }

}

public class Second {
    public static void main(String[] args) {
        dogggg d1 = new dogggg();
        dogggg d2 = new dogggg();
    }
}
