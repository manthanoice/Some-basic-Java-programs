package Methods;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();
        System.out.println("----------Before swapping-----------");
        System.out.println("Value of a: "+a);
        System.out.println("Value of b: "+b);
        if(a==b)
            System.out.println("\nBoth numbers are same so there's no point of swapping them! :P\n\nStill if you are eager then results will be:\n-----------After Swapping-----------\nValue of a: "+a+"\nValue of b: "+b);
        else
            swap(a,b);
        //swap(2,5);
    }
    static void swap (int a, int b){
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("-----------After Swapping-----------");
        System.out.println("Value of a: "+a);
        System.out.println("Value of b: "+b);
    }
}
