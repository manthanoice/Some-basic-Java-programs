package Array;

import java.util.Scanner;

public class ArrayMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many marks you want to enter: ");
        int n = sc.nextInt();
        System.out.println("Enter the marks: ");
        int marks[]=new int[n];
        for (int i=0; i<n; i++){
            marks[i] = sc.nextInt();
        }
        int avg =0;
        for (int i=0; i<n; i++){
            avg=avg+marks[i];
        }
        avg=avg/n;
        System.out.println("Average is: "+avg);
    }
}
