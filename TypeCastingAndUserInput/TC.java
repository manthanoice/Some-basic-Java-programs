/*
    This program will do automatic type casting.
    Automatic type casting works like byte --> short --> char --> int --> long --> float --> double

    But if you want to go backwards like from double to int then you have to use Widening casting.
    Which is in TC2.java
 */

package TypeCastingAndUserInput;

import java.util.Scanner;

public class TC {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the int: ");
        int n = sc.nextInt();
        double d = n; //Automatic type casting
        System.out.println("The n in double is: "+d);
    }
}
