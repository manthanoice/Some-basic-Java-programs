package Array;

import java.util.Scanner;

public class MultiArray1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n1 and n2: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int marks [][]=new int[n1][n2];
        for (int i=0; i<n1; i++){
            for (int j=0; j<n2; j++) {
                marks[i][j] = sc.nextInt();
            }
        }
        System.out.println(marks[0][1]);
    }
}
