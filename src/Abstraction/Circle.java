package Abstraction;

public class Circle extends Shape {
    double radius;
    public void area(double radius){
        double answer = Math.PI*this.radius;
        System.out.println("Area of circle is "+answer);
    }
    public void color(String color){
        System.out.println("Color of circle is "+color);
    }

    @Override
    public void area() {
    }

    @Override
    public void color() {

    }
}
