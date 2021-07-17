package SuperKeyWord;

public class Lion extends Animal {
    public Lion(String name) {
        super(name);
        System.out.println("This is lion constructor");
    }
    public void eat(){
        super.eat();
        System.out.println(name+" Lion is eating");
    }
    public void breed(){
        System.out.println(name+" is Lion and you wanna have lion as a pet?!?!?");
    }
}
