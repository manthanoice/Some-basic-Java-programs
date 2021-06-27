package String;

import java.util.Scanner;

public class Anagram3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first String: ");
        String s1 = sc.nextLine();
        System.out.println("Enter the second String: ");
        String s2 = sc.nextLine();
        int n1 = s1.length();
        int n2 = s2.length();
        int []a = new int[256];
        int []b = new int[256];
        boolean isAnagram = true;
        if(n1==n2){
            for(char c: s1.toCharArray()){
                a[c]++;
            }
            for(char c: s2.toCharArray()){
                b[c]++;
            }
            for (int i=0; i<256; i++){
                if(a[i]!=b[i]) {
                    isAnagram = false;
                    break;
                }
            }
        }
        if(isAnagram)
            System.out.println("Is anagram");
        else
            System.out.println("Is not anagram");
    }
}
