//This will solve the previous issue! :D

package String;

import java.util.Scanner;

public class Anagram2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first String here: ");
        String s1 = sc.nextLine();
        System.out.println("Enter second String here: ");
        String s2 = sc.nextLine();
        int n1 = s1.length();
        int n2 = s2.length();
        boolean isAnagram = false;
        boolean[] visited = new boolean [n2];
        if (n1==n2){
            for (int i=0; i<n1; i++){
                char c = s1.charAt(i);
                for (int j=0; j<n2; j++){
                    if(s2.charAt(j)==c && !visited[j]){
                        visited[j]=true;
                        isAnagram=true;
                        break;
                    }
                }
                if(!isAnagram)
                    break;
            }
        }
        if(isAnagram)
            System.out.println("Both strings are Anagram! :D");
        else
            System.out.println("They are not anagrams oops! :(");
    }
}
