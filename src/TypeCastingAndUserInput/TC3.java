package TypeCastingAndUserInput;

import java.util.Scanner;

public class TC3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num: ");
        long n = sc.nextLong();
        int x = (int) n;
        System.out.println("Converted int is: "+x);
    }
}
