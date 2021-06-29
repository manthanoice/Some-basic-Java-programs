package Methods;

import java.util.Scanner;

public class ReverseAString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string you want to reverse: ");
        String s = sc.nextLine();
        revString(s);
        //revString("huh");
    }
    static void revString(String s){
        char[] arr = s.toCharArray();
        int n = arr.length;
        for (int i=0; i<n; i++){
            System.out.print(arr[n-1-i]);
        }
    }
}
