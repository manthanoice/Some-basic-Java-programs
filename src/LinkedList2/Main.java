package LinkedList2;

public class Main {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.push(2);
        l.push(34);
        l.append(99);
        l.indexing(1,9939);
        l.deleting(2);
        l.counting();
        String s = (l.search(9939)?"YES":"NO");
        System.out.println(s);
        l.getData(2);
//        l.deleteList();
        l.printing();
    }
}
