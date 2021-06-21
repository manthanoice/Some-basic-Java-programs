package Array;

import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many rows there will be: ");
        int rows = sc.nextInt();
        System.out.println("Enter how many cols there will be: ");
        int cols = sc.nextInt();
        int a[][]=new int[rows][cols];
        int b[][]=new int[rows][cols];
        if(rows==cols){
            System.out.println("Enter matrix A: ");
            for (int i=0; i<rows; i++){
                for (int j=0; j<cols; j++){
                    a[i][j]=sc.nextInt();
                }
            }
            System.out.println("First matrix A is: ");
            for (int i=0; i<rows; i++){
                for (int j=0; j<cols; j++){
                    System.out.print(a[i][j]+" ");
                }
                System.out.println();
            }
            System.out.println("Enter Matrix B: ");
            for (int i=0; i<rows; i++){
                for (int j=0; j<cols; j++){
                    b[i][j]=sc.nextInt();
                }
            }
            System.out.println("First matrix B is: ");
            for (int i=0; i<rows; i++){
                for (int j=0; j<cols; j++){
                    System.out.print(b[i][j]+" ");
                }
                System.out.println();
            }
            int c[][]=new int[rows][cols];
            for (int i=0; i<rows; i++){
                for (int j=0; j<cols; j++){
                    for (int k=0;k<rows; k++){
                        c[i][j]+=a[i][k]*b[k][j];
                    }
                }
            }
            System.out.println("Answer is: ");
            for (int i=0; i<rows; i++){
                for (int j=0; j<cols; j++){
                    System.out.print(c[i][j]+" ");
                }
                System.out.println();
            }
        }
        else
            System.out.println("For multiplication of matrix both rows and columns number should be same.\nCheck the number of rows and columns you have entered and try again. \nHappy Coding!! :D");
    }
}
