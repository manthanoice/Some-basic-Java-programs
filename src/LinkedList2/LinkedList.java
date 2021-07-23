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
    public void fromLast(int where){
        System.out.println("\nFrom last data is: ");
        Node temp = head;
        int length = 0;
        while (temp!=null){
            length++;
            temp = temp.next;
        }
        if(length==0)
            return;
        temp = head;
        for(int i=0; i<length-where-1; i++)
            temp = temp.next;
        System.out.println(temp.data);
    }
    public void middle(){
        System.out.println("Middle is: ");
        Node temp = head;
        int count = 0;
        while (temp!=null){
            count++;
            temp = temp.next;
        }
        temp = head; //We have to initialize temp as head to traverse once again using for loop, right
        for(int i=0; i<count/2; i++){
            temp = temp.next;
        }
        System.out.println(temp.data);
    }
    //To count how many times element comes in linked list
    public void countElement(int element){
        Node temp = head;
        int count = 0;
        while (temp!=null){
            if(temp.data==element)
                count++;
            temp = temp.next;
        }
        System.out.println("Count is: "+count);
    }
    Node reverseList(Node head){
        Node prev = null;
        while (head!=null){
            Node next_node = head.next;
            head.next = prev;
            prev = head;
            head = next_node;
        }
        return prev;
    }
    boolean isPalindrome(Node head)
    {
        Node fast = head;
        Node slow = head;
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        slow = reverseList(slow);
        fast = head;
        while(slow!=null){
            if(slow.data!=fast.data)
                return false;
            slow = slow.next;
            fast = fast.next;
        }
        return true;
    }
}
