package CompileTimePolymorphism;

public class Dog extends Pet{
    String name;
    public void eat(){
        System.out.println(name+" Is dog and it's eating");
    }
}
