package Constructors;

class person{
    int age;
    double weight, height;
    person(){
        System.out.println("It has no parameters");
        age=19;
        weight=50.4;
        height=6.2;
        System.out.println("Age is: "+age);
        System.out.println("Weight is: "+weight);
        System.out.println("Height is: "+height);
    }
    person(int age){
        System.out.println("\nThis is one parameter constructor");
        this.age=age;
        weight=23.44;
        height=2.5;
        System.out.println("Age is: "+age);
        System.out.println("Weight is: "+weight);
        System.out.println("Height is: "+height);
    }
    person(int age, double height){
        System.out.println("\nThis is two parameter constructor");
        this.age=age;
        this.height=height;
        weight=20;
        System.out.println("Age is: "+age);
        System.out.println("Weight is: "+weight);
        System.out.println("Height is: "+height);
    }
    person(int age, double weight, double height){
        System.out.println("\nThis is three parameter constructor");
        this.age=age;
        this.weight=weight;
        this.height=height;
        System.out.println("Age is: "+age);
        System.out.println("Weight is: "+weight);
        System.out.println("Height is: "+height);
    }

}

public class ConstructorOverloading {
    public static void main(String[] args) {
        person p1 = new person();
        System.out.println(p1);
        person p2 = new person(22);
        System.out.println(p2);
        person p3 = new person(22,35.5);
        System.out.println(p3);
        person p4 = new person(26,43,6.7);
        System.out.println(p4);
    }
}
