package Array;

import java.util.Scanner;

//this is to find sum of entered numbers
public class ArrayMarks2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many number's sum you want to find: ");
        int n = sc.nextInt();
        int num[] = new int[n];
        System.out.println("Enter your numbers here: ");
        for (int i=0; i<n; i++){
            num[i]=sc.nextInt();
        }
        int sum = 0;
        for (int i=0; i<n; i++){
            sum=sum+num[i];
        }
        System.out.println("Total of numbers you have entered is: "+sum);
    }
}
