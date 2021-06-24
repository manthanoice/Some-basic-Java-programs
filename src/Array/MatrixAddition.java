package Array;

import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many rows will there be in matrix: ");
        int rows = sc.nextInt();
        System.out.println("Enter how many columns will there be in matrix: ");
        int cols = sc.nextInt();
        int a [][] = new int[rows][cols];
        int b [][] = new int[rows][cols];
        System.out.println("Enter first matrix: ");
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
        System.out.println("Enter second matrix: ");
        for (int i=0; i<rows; i++){
            for (int j=0; j<cols; j++){
                b[i][j]=sc.nextInt();
            }
        }
        System.out.println("Second matrix B is: ");
        for (int i=0; i<rows; i++){
            for (int j=0; j<cols; j++){
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Final answer aka Martix c is: ");
        int c [][] = new int[rows][cols];
        for (int i=0; i<rows; i++){
            for (int j=0; j<cols; j++){
                c[i][j]=a[i][j]+b[i][j];
                    System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
}
