package LinkedList2;

public class LinkedList {
    Node head;
    static class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }
    public void push(int new_data){
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }
    public void append(int new_data){
        Node new_node = new Node(new_data);
        if(head==null)
            head = new Node(new_data);
        new_node.next = null;
        Node n = head;//To travel the whole node and when it'll find the last node and ofc it's address will be null so it'll put new node n at the end
        while (n.next!=null)
            n=n.next;
        n.next = new_node;
    }
    public void insertAt(int index, int new_data){
        if(index==0)
            push(new_data);
        Node new_node = new Node(new_data);
        new_node.next = null;
        Node n = head;
        for(int i=0; i<index-1; i++){
            n = n.next;
        }
        new_node.next = n.next;
        n.next = new_node;
    }
    public void printTheList() {
        Node n = head;
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
    }
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.head = new Node(4);
        l.head.next = new Node(5);
        l.head.next.next = new Node(7);
        l.push(4);
        l.append(99);
        l.insertAt(2,69);
        l.printTheList();
    }
}