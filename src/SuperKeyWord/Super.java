package SuperKeyWord;

import java.util.Scanner;

public class Super {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name: ");
        String s = sc.nextLine();
//        //Downcasting :D
//        Lion l = new Lion(s);
//        Animal a = l;
//        Lion l1 = (Lion)a;
//        l1.breed();
//        l1.kill();
//        l1.eat();

        //Upcasting :P it is used to use child class abilities in parent class
        Lion l = new Lion(s);
        Animal a = l;
        a.kill();
        a.eat();
    }
}
