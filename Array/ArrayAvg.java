package Array;

import java.util.Scanner;

public class ArrayAvg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many number avg you want to find: ");
        int n = sc.nextInt();
        int num [] = new int[n];
        System.out.println("Enter your numbers here by pressing enter: ");
        for (int i=0; i<n; i++){
            num[i]=sc.nextInt();
        }
        double avg = 0;
        double sum = 0;
        for (int i=0; i<n; i++){
            sum = sum+num[i];
            avg = sum/n;
        }
        System.out.println("Avg of numbers you have entered is: "+avg);
    }
}
