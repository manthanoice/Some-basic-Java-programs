package LinkedList;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List <Integer> linked = new LinkedList<>();
        System.out.println("Enter how many elements you want to add in the list: ");
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            linked.add(i);
            linked.add(n);
        }
        System.out.println(linked);
    }

}
