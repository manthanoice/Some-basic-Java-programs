package Abstraction;

public class Main {
    public static void main(String[] args) {
        Circle c = new Circle();
        Rectangle r = new Rectangle();
        c.area(2);
        r.color("Red");
        c.color("Pink");
        r.area(2.4,5);
    }
}
