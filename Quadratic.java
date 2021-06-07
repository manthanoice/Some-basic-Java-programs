/*
    x = (-b ± √(b^2-4ac)) / (2a) is the equation we are going to use and there will be two roots because of +- sign

    b^2-4ac = det, I have taken here

    And there are 3 possibilities:
    1. If det > 0, roots are real and different
    2. If det == 0, roots are real and equal
    3. If det < 0, roots are complex and different.

    So we have to take else if loop here.

    We will take two roots,
    x1 and x2.
    x1 = x = (-b + √(b^2-4ac)) / (2a)
    x2 = x = (-b - √(b^2-4ac)) / (2a)

    And instead of using System.out.println(), I have used System.out.format because I have used double here and if I use sout then it will print whole number so by using format I can decide how many numbers to put after the .

    And you can also use System.out.println() but output will look bad and probably not that much accurate.
*/

package com.company;

import java.util.Scanner;

public class Quadratic {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a: ");
        double a = sc.nextDouble();
        System.out.println("Enter value of b: ");
        double b = sc.nextDouble();
        System.out.println("Enter value of c: ");
        double c = sc.nextDouble();
        double det = b*b-4*a*c;
        double x1,x2;
        if(det > 0) {
            x1 = (-b + Math.sqrt(det)) / (2 * a);
            x2 = (-b - Math.sqrt(det)) / (2 * a);
            System.out.format("\nFirst root x1 = %.2f and Second root x2 = %.2f", x1,x2);
        }
        else if (det == 0) {
            x1 = x2 = -b/(2*a);
            System.out.format("First and second root x1 = x2 = %.2f;", x1);
        }
        else {
            double real = -b/(2*a);
            double img = Math.sqrt(-det)/(2*a);
            System.out.format("\nFirst root x1=%.2f+%.2fi", real, img);
            System.out.format("\nSecond root x2=%.2f-%.2fi\n", real, img);
        }
    }
}
