/*
    Widening Type casting will be done here.

    Automatic type casting works like byte --> short --> char --> int --> long --> float --> double

    But if you want to go backwards like from double to int then you have to use Widening casting. Which is here
 */

package TypeCastingAndUserInput;

import java.util.Scanner;

public class TC2 {
    public static void main(String[] args) {
        Scanner sc = new  Scanner (System.in);
        System.out.println("Enter double: ");
        double d = sc.nextDouble();
//      int n = d; // It will generate error because we can't directly convert double to int so we will use widening casting
        int n = (int) d;
        System.out.println("Double converted to int is "+n);
    }
}
