/*
    ++ or -- this sign adds or subtracts 1 to the value in a particular order when the code runs according to the order its placed to the variable
      Example 1 - int a = 1;
                          int b = a++;
                          System.out.println(a +' '+b);
      Output - 2 1

      Example 2 - int a = 1;
                          int b = a--;
                          System.out.println(a +' '+b);
      Output - 0 1

      Example 3 - int a = 1;
                          int b = ++a;
                          System.out.println(a +' '+b);
      Output - 2 2

      Example 4 - int a = 1;
                          int b = --a;
                          System.out.println(a +' '+b);
      Output - 0 0
 */

package Operators;

import java.util.Scanner;

public class ArithmeticOperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number a: ");
        int a = sc.nextInt();
        System.out.println("Enter the number a: ");
        int b = sc.nextInt();
        int sum = a-b;
        int sum2 = a+b;
        System.out.println("Addition of a and b is: "+ sum2);
        System.out.println("Subtraction of a and b is: "+ sum);
        System.out.println("Multiplication of a and b is: "+ a*b);
        System.out.println("Division of a and b is: "+ (double) a/(double) b); //Using simple typecasting we can assign double to a and b and print the double value even though we have put them as int above
        System.out.println("Remainder of a and b is: "+ a%b);
        System.out.println("Value of a++ is: "+a++);
        System.out.println("Value of ++a is: "+ ++a);
        System.out.println("Value of a-- is: "+ a--);
        System.out.println("Value of --a is: "+ --a);
    }
}
