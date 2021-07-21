package LinkedList2;

public class LinkedList {
    Node head;
    public void push(int data){         //23=data, next = null
        Node node = new Node(data);
        node.next = head;
        head = node;
    }
    public void append(int data){
        Node node = new Node(data); //32 --> Head --> First node right?
        if(head==null)
            head = node;
        Node temp = head;
        while (temp.next!=null)
            temp = temp.next; //null--> Last element mil gaya theek hai?
        temp.next = node; //We will change next of temp (temp=last node)
    }
    public void indexing(int index, int data){
        Node node = new Node(data);
        if(index==0)
            push(data);
        Node temp = head;
        for(int i=0; i<index-1; i++)   //--> index-1 because that's how we will find location of index before
            temp = temp.next;
        node.next = temp.next;
        temp.next = node;
    }
    public void counting(){
        int count = 0;
        Node temp = head;
        while (temp!=null){
            temp = temp.next;
            count++;
        }
        System.out.println("count is: "+count);
    }
    public void printing(){
        Node temp = head;
        System.out.println("Data is: ");
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    public void deleting(int index){
        Node temp = head;
        if(head==null)
            return;
        if(index==0)
            head = temp.next;
        for(int i=0; i<index-1; i++)
            temp = temp.next;
        temp.next = temp.next.next;
    }
    public void deleteList(){
        head = null;
    }
    public boolean search(int x){
        Node temp = head;
        while (temp!=null){
            if(temp.data==x)
                return true;
            temp=temp.next;
        }
        return false;
    }
    public void getData(int index){
        System.out.println("At index n is: ");
        Node temp = head;
        for(int i=0; i<index; i++){
            temp = temp.next;
        }
        System.out.println(temp.data);
    }
}
