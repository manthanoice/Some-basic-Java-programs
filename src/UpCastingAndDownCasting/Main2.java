//This is downcasting, in downcasting you typecast parent object to child object!
//Here Dog is child and Animal is parent
//First we would create dog object and then create a parent object
//Cat is animal but animal is not cat
//Then we will assign dog new object to parent object, see the lines 18,19,20! You will understand it better!

package UpCastingAndDownCasting;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name: ");
        String s = sc.nextLine();
        System.out.println("Enter age: ");
        int n = sc.nextInt();
        Dog d = new Dog();
        Animal a = d;
        Dog d1 = (Dog) a;
        d1.name=s;
        d1.age=n;
        d1.age();
        d1.name();
        d1.which();
    }
}
