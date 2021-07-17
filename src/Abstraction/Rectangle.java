package Abstraction;

public class Rectangle extends Shape {
    public void area(double length, double width){
        double answer = length*width;
        System.out.println("Area of Rectangle is: "+answer);
    }
    public void color(String s){
        System.out.println("Color of rectangle is: "+s);
    }
    @Override
    public void area() {}
    @Override
    public void color() {}
}
