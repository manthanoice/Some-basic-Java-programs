package SuperKeyWord;

public class Animal {
    protected String name;

    public Animal(String name){
        this.name=name;
        System.out.println("This is parent class constructor!");
    }
    public void eat(){
        System.out.println(name+" is Eating");
    }
    public void kill(){
        System.out.println(name+" is Killing other animals! Isn't this animal cruelty, little dark eh?");
    }
}
