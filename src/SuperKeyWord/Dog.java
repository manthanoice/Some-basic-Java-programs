package SuperKeyWord;

public class Dog extends Animal {
    public Dog(String name){
        super(name);
        System.out.println("This is dog constructor");
    }
    public void breed(){
        System.out.println(name+" is Dog and he/she is Pet!");
    }
}
