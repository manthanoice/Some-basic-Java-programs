package Array;

import java.util.Scanner;

public class LargestArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many numbers you want to enter: ");
        int n = sc.nextInt();
        int num[] = new int[n];
        for (int i=0; i<n; i++){
            num[i]=sc.nextInt();
        }
        int max = num[0];
        for (int i=0; i<num.length; i++){
            if(num[i]>max){
                max=num[i];
            }
        }
        System.out.println("Largest number is: "+max);
    }
}
