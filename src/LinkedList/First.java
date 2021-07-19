package LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class First {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        linkedList.add(6);
        System.out.println(linkedList);
        System.out.println(linkedList.get(2));
        System.out.println(linkedList.size());
        System.out.println(linkedList.isEmpty());
        linkedList.addLast(5);
        linkedList.pop();
        linkedList.push(7);
        System.out.println(linkedList);
        List<Integer> arrayList = new ArrayList<>();


        timeDifference(linkedList);
        timeDifference(arrayList);
    }
    static void timeDifference(List<Integer> theList){
        long begin = System.currentTimeMillis();
        for(int i=0; i<=100000; i++){
            theList.add(0,i);
        }
        long end = System.currentTimeMillis();
        System.out.println(theList.getClass().getName()+" --> "+(end-begin));
    }
}
