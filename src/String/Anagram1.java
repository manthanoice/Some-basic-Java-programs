//This cod will only work if both string has different characters! :D
//Will make few more to make myself! xoxo

package String;

import java.util.Scanner;

public class Anagram1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first String: ");
        String s1 = sc.nextLine();
        System.out.println("Enter second String: ");
        String s2 = sc.nextLine();
        int n1 = s1.length();
        int n2 = s2.length();
        boolean isAnagram=false;
        if(n1==n2) {
            for (int i = 0; i < n1; i++) {
                char c1 = s1.charAt(i);
                for (int j = 0; j < n2; j++) {
                    if (s2.charAt(j) == c1) {
                        isAnagram = true;
                        break;
                    }
                }
                if (!isAnagram)
                    break;
            }
        }
        if (isAnagram)
            System.out.println("Both strings are anagram!");
        else
            System.out.println("Strings are not anagrams! OOPS :D");
    }
}
