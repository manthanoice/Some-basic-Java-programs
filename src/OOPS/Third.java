//Ignore this program, it doesn't work the way I wanted it to :D, Yeah kinda dumb but I will improve! :D

package OOPS;

import java.util.Scanner;

class doggo{
    int legs, eyes;
    String name, breed;
    char gender, furry;

    public void name(){
        System.out.println("Name of dog is: "+name);
    }

    public void breed(){
        System.out.println(name+"'s breed is: "+breed);
    }

    public void legs(){
        System.out.println(name+" has "+legs+" legs");
    }

    public void eyes(){
        System.out.println(name+" has "+eyes+" eyes");
    }

    public void gender(){
        if(gender=='m'||gender=='M')
            System.out.println(name+"'s gender is Male");
        else
            System.out.println(name+"'s gender is Female");
    }

    public void furry(){
        if(furry=='y'||furry=='Y')
            System.out.println(name+" is furry");
        else
            System.out.println(name+" is not furry :(");
    }
}

public class Third {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many dog's data you want to enter: ");
        int n = sc.nextInt();
        doggo[] arr;
        arr = new doggo[n];
        for(int i=0; i<n; i++){
            arr[i]=new doggo();
            System.out.println("Enter the name of dog: ");
            arr[i].name = sc.nextLine();
            System.out.println("Enter the breed of dog: ");
            arr[i].breed = sc.nextLine();
            System.out.println("Enter the number of legs: ");
            arr[i].legs = sc.nextInt();
            arr[i].name();
            break;
        }
    }
}
