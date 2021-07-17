//This is parent class
//And both Dog and Cat are children of Animal Class

package UpCastingAndDownCasting;

public class Animal {
    protected String name;
    protected int age;

    public void age(){
        System.out.println("Age is: "+age);
    }

    public void name(){
        System.out.println("Name is: "+name);
    }
}
