package Array;

import java.util.Scanner;

public class ArrayMarks3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many subjects marks you want to enter: ");
        int n = sc.nextInt();
        int [] marks = new int[n];
        System.out.println("Enter marks by pressing enter: ");
        for (int i=0; i<n; i++){
            marks[i]=sc.nextInt();
        }
        int total = 0;
        for (int i=0; i<n; i++){
            total=total+marks[i];
        }
        System.out.println("Total is: "+total);
        int avg = 0;
        for (int i=0; i<n; i++){
            avg=total/n;
        }
        System.out.println("Avg is: "+avg+"%");
    }
}
