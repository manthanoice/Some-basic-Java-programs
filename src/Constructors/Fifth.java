//Constructor Overloading! :D

package Constructors;

class overloading{
    String color;
    int wheel, headlights=2;
    public overloading(int wheel){
        this.wheel=wheel;
        System.out.println("It has: "+wheel+" wheels");
        System.out.println("It has: "+headlights+" headlights");
    }

    public overloading(int wheel, String color){
        this.wheel=wheel;
        this.color=color;
        System.out.println("It has: "+wheel+" wheels");
        System.out.println("It's color is: "+color+" color");
        System.out.println("It has: "+headlights+" headlights");
    }
}

public class Fifth {
    public static void main(String[] args) {
        overloading v1 = new overloading(3,"White");
        overloading v2 = new overloading(3);
    }
}
