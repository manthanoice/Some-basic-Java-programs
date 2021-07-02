package OOPS;

import java.util.Scanner;

class dog{
    int leg;
    String breed;
    boolean canWalk;

    public void walk(){
        System.out.println("Dog is able to walk");
    }
    public void eat(){
        System.out.println("Dog is eating right now! Woof woof");
    }
    public void description(){
        System.out.println("Dog has "+leg+" legs");
    }
}

class vehicle {
    int num;
    String name;
    boolean canRun;

    public void run(){
        System.out.println("The vehicle is able to run");
    }
    public void wtf(){
        System.out.println("WHAT THE FREAK?");
    }
}

public class First {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of legs: ");
        dog d1 = new dog();
        vehicle v1 = new vehicle();
        d1.leg= sc.nextInt();
        d1.eat();
        d1.walk();
        d1.description();
        v1.run();
        v1.wtf();
    }
}
