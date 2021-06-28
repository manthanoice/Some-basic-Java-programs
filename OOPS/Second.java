package OOPS;

import java.util.Scanner;

class dogs{
    int leg, eyes;
    String name, breed;
    char gender,fur;

    public void name(){
        System.out.println("Your dog name is: "+name+" WOOF WOOF");
    }
    public void breed(){
        System.out.println(name+"'s breed is: "+breed);
    }
    public void legs(){
        System.out.println(name+" has "+leg+" legs! WOOF WOOF");
    }
    public void eyes(){
        System.out.println(name+" has "+eyes+" eyes! WOOF WOOF");
    }
    public void gender(){
        if(gender=='m')
            System.out.println(name+"'s gender is  Male! WOOF WOOF");
        else
            System.out.println(name+"'s gender is Female! WOOF WOOF");
    }
    public void fur(){
        if(fur == 'y')
            System.out.println(name+" has fur! WOOF WOOF");
        else
            System.out.println(name+" doesn't have fur! SAD WOOF WOOF");
    }
}

public class Second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        dogs d1 = new dogs();
        System.out.println("Enter name of your dog: ");
        d1.name = sc.nextLine();
        System.out.println("Enter breed of your dog: ");
        d1.breed = sc.nextLine();
        System.out.println("Enter the number of legs: ");
        d1.leg = sc.nextInt();
        System.out.println("Enter the number of eyes: ");
        d1.eyes = sc.nextInt();
        System.out.println("Enter the gender of your dog m/f: ");
        d1.gender = sc.next().charAt(0);
        System.out.println("Enter if your dog has fur y/n: ");
        d1.fur = sc.next().charAt(0);
        System.out.println("-----------------------------------------------------------------");
        d1.name();
        d1.breed();
        d1.legs();
        d1.eyes();
        d1.gender();
        d1.fur();
        System.out.println("------------------------------------------------------------------");
        System.out.println();
    }
}
