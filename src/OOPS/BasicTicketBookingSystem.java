package OOPS;

import java.util.Scanner;
import java.util.Date;

class welcome{
    static void welcomeToOurJava(){
        System.out.println("--------------------------------- WELCOME TO OUR TICKET BOOKING WEBSITE ---------------------------------");
    }
}

class fromTo{
    static void fromWhere(){
        String from;
        System.out.println("Enter from where: ");
        String to;
        System.out.println("Enter your destination: ");
    }
}

class date{
    static void dAndT(){
        System.out.println("Enter the date below: ");
        String date;
    }
}

class help{
    char c;
    static void howHelp(){
        System.out.println("Thank you for your query we will try to help you as soon as possible!");
        System.out.println("Kindly enter how may we help you?");
        System.out.println("1. Regarding time query\n2. Regarding Ticket booking\n3. Regarding rating us");
    }
}

public class BasicTicketBookingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        welcome w1 = new welcome();
        help h1 = new help();
        h1.c=sc.next().charAt(0);
    }
}
