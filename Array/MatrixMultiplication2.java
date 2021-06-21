package Array;

import java.util.Scanner;

public class MatrixMultiplication2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns: ");
        int cols = sc.nextInt();
        int a[][]=new int[rows][cols];
        int b[][]=new int[rows][cols];
        if(rows==cols){
            System.out.println("Enter the first matrix: ");
            for (int i=0; i<rows; i++){
                for (int j=0; j<cols; j++){
                    a[i][j]=sc.nextInt();
                }
            }
            System.out.println("The first matrix is;");
            for (int i=0; i<rows; i++){
                for (int j=0; j<cols; j++){
                    System.out.print(a[i][j]+" ");
                }
                System.out.println();
            }
            System.out.println("Enter the second matrix: ");
            for (int i=0; i<rows; i++){
                for (int j=0; j<cols; j++){
                    b[i][j]=sc.nextInt();
                }
            }
            System.out.println("The second matrix is;");
            for (int i=0; i<rows; i++){
                for (int j=0; j<cols; j++){
                    System.out.print(b[i][j]+" ");
                }
                System.out.println();
            }
            int c[][]=new int[rows][cols];
            for (int i=0; i<rows; i++){
                for (int j=0; j<cols; j++){
                    for (int k=0; k<rows; k++){
                        c[i][j]+=a[i][k]*b[k][j];
                    }
                }
            }
            System.out.println("The answer is: ");
            for (int i=0; i<rows; i++){
                for (int j=0; j<cols; j++){
                    System.out.print(c[i][j]+" ");;
                }
            System.out.println();
            }
        }
        else {
            System.out.println("YOU MUST HAVE ENTERED VALUE OF ROWS AND COLUMNS DIFFERENT\nFOR MATRIX MULTIPLICATION ROWS AND COLUMNS SHOULD BE EQUAL!!!!!\n CHEKC AGAIN AND THEN ENTER AGAIN! HAPPY MATHS :D");
        }
    }
}
