package Encapsulation;

public class Person {
    private int age;
    private String name;
    private double height, weight;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Age is: "+age);
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("Name is: "+name);
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        System.out.println("Height is: "+height);
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
        System.out.println("Weight is: "+weight);
    }
}
