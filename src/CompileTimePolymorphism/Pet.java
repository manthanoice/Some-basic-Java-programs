package CompileTimePolymorphism;

public class Pet extends Animal{
    String name;
    public void eat(){
        System.out.println(name+" is pet and it's eating");
    }
}
