//Ignore 16th line, I am just too lazy :D

package String;

import java.util.Scanner;

public class StringIntro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char xx;
        do{
            System.out.println("Enter the String: ");
            String s = sc.nextLine();
            System.out.println("\nThe string you have entered is: "+s);
            System.out.println("\nEnter which function you want to perform: ");
            System.out.println("\n1. To find char at some index.\n2. To find length of String.\n3. The substring.\n4. To check both strings are same or not.\n5. To check whether the String you have entered is empty or not.\n6. To replace a character in the string.\n7. To print something seperated by comma or something. REGEX\n8. To find an index of a character.\n9. To turn the string to lowercase.\n10. To turn the string to uppercase.\n11. To Trim the string.\n12. To Unicode of the character before the specified index");
            System.out.println();
            int n = sc.nextInt();
            String[] answer;
            System.out.println("-----------------------------------------------------------------------------------------------");
            switch (n) {
                case 1 -> {
                    System.out.println("Enter at which index you want to find");
                    int x = sc.nextInt();
                    System.out.println("The letter at " + x + " index is: " + s.charAt(x));
                }
                case 2 -> System.out.println("The length of the string is: " + s.length());
                case 3 -> {
                    System.out.println("Enter the beginning index: ");
                    int y = sc.nextInt();
                    System.out.println("Enter the ending index: ");
                    int z = sc.nextInt();
                    System.out.println("Your answer is: " + s.substring(y, z));
                }
                case 4 -> {
                    System.out.println("Enter another string: ");
                    String x1 = sc.nextLine();
                    System.out.println(s.equals(x1));
                }
                case 5 -> {
                    boolean xoxo = s.isEmpty();
                    if (xoxo) {
                        System.out.println("The string you have entered is empty!");
                    } else
                        System.out.println("The string you have entered is not empty!");
                }
                case 6 -> {
                    System.out.println("Enter the character you want to replace: ");
                    char c1 = sc.next().charAt(0);
                    System.out.println("Enter the character you want it to replace with: ");
                    char c2 = sc.next().charAt(0);
                    System.out.println("Your final string is: " + s.replace(c1, c2));
                }
                case 7 -> {
                    answer= s.split(",");
                    for (String xo: answer){
                        System.out.println(xo);
                    }
                }
                case 8 -> {
                    System.out.println("Enter the character whose index you want to find in string: ");
                    char xoxo = sc.next().charAt(0);
                    System.out.println("The index of "+xoxo+" is: "+s.indexOf(xoxo));
                }
                case 9 -> System.out.println("The string in lower case is: "+s.toLowerCase());
                case 10 -> System.out.println("The string in upper case is: "+s.toUpperCase());
                case 11 -> System.out.println("The trimmed String is: "+s.trim());
                case 12 -> {
                    System.out.println("Enter the specified index number: ");
                    int specifiedindexnum = sc.nextInt();
                    System.out.println("The Unicode of the character before the specified index is: "+s.codePointBefore(specifiedindexnum));
                }
                default -> System.out.println("Enter proper value!!");
            }
            System.out.println("-----------------------------------------------------------------------------------------------");
            System.out.println("Do you want to continue Y/N");
            xx = sc.next().charAt(0);
        }while (xx=='y');
        System.out.println("-----------------------------------------------------------------------------------------------");
    }
}
