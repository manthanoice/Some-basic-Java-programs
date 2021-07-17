package Arraylist;

import java.util.ArrayList;
import java.util.List;

public class Intro {
    public static void main(String[] args) {
//        ArrayList<String> marvel = new ArrayList<String>(); --> We don't use this because it only defines array list but instead...
        List<String> marvel = new ArrayList<>(); //--> ... We use List because in List Arraylist, Stack, queue all are there so we want to do some function on it, it is useful to have List and in right side we can write ArrayList to know what are we using
        marvel.add("Ironman");
        marvel.add("Loki");
        marvel.add(1,"oops");
        marvel.add(0,"ops");
        System.out.println(marvel);
    }
}
