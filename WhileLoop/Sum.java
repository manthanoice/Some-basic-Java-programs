package WhileLoop;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number which you want to do sum of: ");
        int n = sc.nextInt();
        int temp = n;
        int sum=0; //If we don't take temp variable then at the end if we will print n it's value will be 0 because at the end it will be 0. So it is necessary to take temp variable and store value of n inside it and run the program! Tehmks
        while (temp>0){
            int last = temp%10;
            temp = temp/10;
            sum = sum+last;
        }
        System.out.println("Sum of each number of "+n+" is: "+sum);
    }
}
