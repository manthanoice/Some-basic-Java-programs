//Here is a small example on parameterized constructor! :D

package Constructors;

import java.util.Scanner;

class vehicles{
    int wheels, headlights=2;
    public vehicles(int wheels){
        this.wheels=wheels;
        System.out.println("It has: "+wheels+" wheels");
        System.out.println("It has: "+headlights+" headlights");
    }
}

public class Fourth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many wheels there will be in your vehicle: ");
        int n = sc.nextInt();
        vehicles v1 = new vehicles(n);
    }
}
