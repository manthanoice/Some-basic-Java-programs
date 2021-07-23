package Searching;

import java.util.Scanner;

public class linearSearch {
    public static void main(String[] args) {
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many numbers you want to add in array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements now: ");
        for (i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        System.out.print("Enter which element you want to find: ");
        int x = sc.nextInt();
        for (i = 0; i < n; i++) {
            if(arr[i]==x) {
                System.out.println("Element found at " + i + " index");
                break;
            }
        }
        if(i==n)
            System.out.println("Entered element doesn't exist");
    }
}
