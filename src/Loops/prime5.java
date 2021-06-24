//A flag is a variable used to have some value until some condition becomes true,then we change it to false and print the output (Initially flag considered as true)

package Loops;

import java.util.Scanner;

public class prime5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int flag = 1;
        System.out.println("Enter the upper value: ");
        int n1=sc.nextInt();
        System.out.println("Enter the lower value: ");
        int n2=sc.nextInt();
        for (int i=n1; i<=n2; i++){
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = 0;
                    break;
                } else {
                    flag = 1;
                }
            }
            if(flag==1)
                System.out.print(i+" ");
        }
    }
}
