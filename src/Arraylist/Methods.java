//Here all methods of ArrayList I have wrote with example and for practice for myself

package Arraylist;

import java.util.*;

public class Methods {
    public static void main(String[] args) {

        //add() method to add elements in ArrayList

        List <String> Avengers = new LinkedList<>();
        Avengers.add("Thor");
        Avengers.add("Winter Soldier");
        Avengers.add("Black Widow");
        Avengers.add("Hulk");
        Avengers.add("Captain America");
        Avengers.add("Wonder Woman");

        List <String> dc = new LinkedList<>();
        dc.add("Wonder Woman");
        dc.add("Harley Queen");
        dc.add("Flash");
        dc.add("Superman");

        //addAll() function to add elements of one Arraylist in another

        Avengers.addAll(dc);
        System.out.println(Avengers);

        //OUTPUT = [Thor, Winter Soldier, Black Widow, Hulk, Captain America, Wonder Woman, Harley Queen, Flash, Superman]

        //get(indexNumber); function to get element on specified index number (It also has 0 based indexing)

        System.out.println(Avengers.get(8)); //(We here have added all elements of dc to avengers so 8th index will be 9th element and that is Superman and it's last one)

        //set(indexNumber, New element) to set or change element in list using index number

        Avengers.set(1,"Bucky"); //--> Here first element(0th, 1st) is Winter Soldier so by changing it to bucky new will be bucky

        System.out.println(Avengers);

        //OUTPUT: [Thor, Bucky, Black Widow, Hulk, Captain America, Wonder Woman, Harley Queen, Flash, Superman]

        //remove(indexNumber) --> To remove element on entered indexNumber

        Avengers.remove(2); //Black Widow will be removed

        System.out.println(Avengers);

        //OUTPUT: [Thor, Bucky, Hulk, Captain America, Wonder Woman, Harley Queen, Flash, Superman]

        //clear() --> It removes all elements from ArrayList

//        Avengers.clear();
//        System.out.println(Avengers);

        //OUTPUT: []

        //removeAll(Name of List) --> Name of List = new list we have created of the elements we want to remove --> Example below

        List<String> toRemove = new ArrayList<>();
        toRemove.add("Thor");
        toRemove.add("Bucky");

        Avengers.removeAll(toRemove);

        System.out.println(Avengers);

        //OUTPUT: [Hulk, Captain America, Wonder Woman, Harley Queen, Flash, Superman] --> 6 elements

        //size() --> It returns size

        System.out.println(Avengers.size());

        //Output --> 6

        //contains(String or int name) --> If exists it'll return true else false (boolean type)

        System.out.println(Avengers.contains("Wonder woman")); //--> False because w is in lowercase in this one lol xD
        System.out.println(Avengers.contains("Wonder Woman")); //--> True

        //isEmpty() --> If empty then returns true else false

        System.out.println(Avengers.isEmpty()); //--> false ofc


        ArrayList<String> adding = new ArrayList<>();
        adding.add("Google");
        adding.add("Microsoft");

        //addAll(ListName) --> Similar as removeAll, refer removeAll

        Avengers.addAll(adding);
        System.out.println(Avengers);

        //OUTPUT: [Hulk, Captain America, Wonder Woman, Harley Queen, Flash, Superman, Google, Microsoft]

        //To use clone method --> NOTE: We have to use ArrayList both sides, writing List won't work because clone is just for ArrayList

        ArrayList <String> cloning = new ArrayList<>();
        cloning = (ArrayList)adding.clone();
        System.out.println(cloning);

        //OUTPUT: [Google, Microsoft]

        //forEach public void forEach(Consumer<? super E> action)

        adding.forEach((n)-> System.out.println(n));

        //OUTPUT :Google
        //        Microsoft

        adding.ensureCapacity(5000);

        System.out.println("New minimum capacity of is now 5000");

        //lastIndexOf(ObjName)--> It returns when the last time object appeared in list

//        System.out.println(adding.lastIndexOf("Microsoft"));
//
//        //listIterator() --> It will print something like we'll see how
//        try {
//            ListIterator<String> Well = adding.listIterator();
//            while (Well.hasNext()) {
//                System.out.println("Value is: " + Well.hasNext());
//            }
//        }
//        catch (NullPointerException e){
//            System.out.println("Exception thrown: "+e);
//        }
        Avengers.retainAll(dc);
        System.out.println(Avengers);
        System.out.println(dc);


        /*
            retainAll(collection or list)

            Here as example let's say Avengers has --> Wonder woman, Iron man, Flash, Cap America
                                      dc has --> Wonder woman, Flash, AquaMan, Harlyes Queen

            If we will do Avengers.retainAll(dc)

            Then it'll print all the elements of Avengers which are in dc --> Here, Wonder Woman and Flash
                            And for DC it will print ALL of the elements of DC as it is.
         */
        ArrayList<String>list = new ArrayList<>();
        list.add("ManthanNoice");
        list.add("WTF");
        Spliterator<String > name = list.spliterator();
        System.out.println("Elements are: ");
        name.forEachRemaining((n)-> System.out.println(n));
    }
}
