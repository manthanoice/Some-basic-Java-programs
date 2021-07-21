/*
    OUTPUT:
    count is: 8
    YES
    At index n is: 
    9299
    Data is: 
    2222 234 9299 34 9939 99 293 99 
    From last data is: 
    293
    Middle is: 
    9939
    Count is: 2
*/

package LinkedList2;

public class Main {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.push(2);
        l.push(34);
        l.append(99);
        l.indexing(1,9939);
        l.deleting(2);
        l.push(9299);
        l.push(234);
        l.append(293);
        l.append(99);
        l.push(2222);
        l.counting();
        String s = (l.search(9939)?"YES":"NO");
        System.out.println(s);
        l.getData(2);
//        l.deleteList();
        l.printing();
        l.fromLast(1);
        l.middle();
        l.countElement(99);
    }
}
