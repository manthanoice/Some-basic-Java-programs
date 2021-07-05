//This is just totally basic introduction about Inheritance :O
//Yeah I might seem little dumb now but in next few months :D
//IK that sounded like little bit of exaggeration but but I'm trying so bad! :P

package Inheritance;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Teacher t1 = new Teacher();
        Person p1 = new Person();
        Footballer f1 = new Footballer();
        System.out.println("Enter the name: ");
        String s = sc.nextLine();
        t1.name=s;
        t1.eat();
        t1.walk();
        t1.teach();
        t1.talk();
        p1.name=s;
        p1.eat();
        p1.walk();
        p1.talk();
        f1.name=s;
        f1.football();
        f1.walk();
        f1.eat();
        f1.talk();
    }
}
