package CompileTimePolymorphism;

import java.util.Scanner;

public class mainClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dog d = new Dog();
        Pet p = d; //We have given pet the methods of DOG so it will print whatever is written in dog class
        d.name = sc.nextLine();
        p.name = sc.nextLine();
        d.eat();
        p.eat();
        hello("HUHHUH");
        hello();
    }
    //From below compile time poly starts
    //In short if I say to explain to myself then it is same is method overloading, you just have to have different parameters in order to do the compile time poly
    public static void hello(){
        System.out.println("Hello bitches!");
    }
    public static void hello(String s){
        System.out.println(s);
    }
}
