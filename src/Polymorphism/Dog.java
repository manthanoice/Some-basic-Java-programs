package Polymorphism;

public class Dog extends Pet{
    String s;
    public void eat(){
        System.out.println("Dog is eating");
    }
    public void name(){
        System.out.println(s+" is the name of Dog");
    }
}
