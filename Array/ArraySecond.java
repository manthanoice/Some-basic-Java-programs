package Array;

import java.util.Scanner;

public class ArraySecond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many students marks you want to add: ");
        int n = sc.nextInt();
        int n1[] = new int[n];
        for (int i=0; i<n; i++){
            n1[i] = sc.nextInt();
        }
        int avg = 0;
        for (int i=0; i<n; i++){
            avg=avg+n1[i];
        }
        avg=avg/n;
        System.out.println("Avg is: "+avg);
    }
}
