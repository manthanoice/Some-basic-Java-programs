package Polymorphism;

public class Pet extends Animal {
    String s;
    public void eat(){
        System.out.println("Pet is eating");
    }
    public void name(){
        System.out.println(s+" is the name of Pet");
    }
}
