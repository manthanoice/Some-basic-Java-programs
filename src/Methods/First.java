package Methods;

import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = sc.nextInt();
        System.out.println("Enter first number: ");
        int b = sc.nextInt();
        System.out.println("Bigger number is: "+max(a,b));
        System.out.println(max(8,9));
    }
    static int max(int a, int b){
        return Math.max(a, b);
    }
}
