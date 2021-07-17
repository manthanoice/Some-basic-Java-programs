package Constructors;

class person1{
    static person1 name = null;
    public int age = 18;

    private person1(){

    }
    static public person1 getInstance(){
        if(name==null)
            name=new person1();
        return name;
    }
}

public class PrivateConstructor {
    public static void main(String[] args) {
        person1 p1 = person1.getInstance();
        person1 p2 = person1.getInstance();
        System.out.println("Value of p1.age = "+p1.age);
        System.out.println("Value of p2.age = "+p2.age);
    }
}
