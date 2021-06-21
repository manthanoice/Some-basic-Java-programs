package Array;

import java.util.Scanner;

public class ArrayMarks1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many marks you want to enter: ");
        int n = sc.nextInt();
        int[] student = new int[n];
        System.out.println("Enter the marks of each subject by pressing enter: ");
        for (int i=0; i<n; i++){
            student[i]=sc.nextInt();
        }
        int total=0;
        for (int i=0;i<n;i++){
            total=total+student[i];
        }
        System.out.println("Total marks are: "+total);
        float perc;
        perc = (total/(float)n);
        System.out.println("Percentage is: "+perc+"%");
    }
}
