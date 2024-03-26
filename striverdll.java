
class Node {
    int data;
    Node previous;
    Node next;

    Node(int value, Node previous, Node next) {
        
        this.next = next;
        this.data = value;
        this.previous = previous;
    }
}


class LL {
public int count = 0 ;
public Node head;

   public Node first;
    public boolean isEmpty(){
        return head == null;
    }
    public void add(int data) {
        count++;
        Node newnode = new Node(data, null, null);
        
        if (head == null) {
            head = newnode;
            first = head;
        } else {
        
        newnode.previous = first;
        first.next = newnode;
        first = newnode;
        }
    }

    public void printlist() {
        Node currnode = head;
        while (currnode != null) {
            System.out.print(currnode.data + "--><--");
            currnode = currnode.next;
        }
        System.out.print("Null");
    }

    public void deletelast() {
        count--;
        if(isEmpty()){
            System.out.println("The list is empty");
        }
        Node currnode = head;
        Node nextnode = head.next;
        while (nextnode.next != null) {
            currnode = nextnode;
            nextnode = nextnode.next;
        }
        currnode.next = null;
        nextnode.previous = null;
    }

    public void getnnode(int n) {
        if(isEmpty()){
            System.out.println("The list is empty");
        }
        int i = 0;
        Node currnode = head;
        while (i != n ) {
            currnode = currnode.next;
            i++;
        }
        System.out.println(currnode.data);
    }

    public void deletennode(int n) {
        count--;
        if(isEmpty()){
            System.out.println("The list is empty");
        }
        int i = 0;
        Node currnode = head;
        while (i != n-1) {
            currnode = currnode.next;
            i++;
        }
        Node nextnode = currnode.next;
        currnode.next = currnode.next.next;
        nextnode.next.previous = currnode;
        nextnode.previous = null;
        nextnode.next = null;
        
       
    }
    public void addnnode(int n , int data){
        count++;
        Node newnode = new Node(data,null,null);
        int a = -1 ;
        if(n == 0){
            newnode.next = head;
            head.previous = newnode;
            head = newnode;       
        }
        
        else {
            
            int i= 0;
        Node currnode = head;
        while(i!=n-1){
        currnode = currnode.next;
        i++;
        }
        
        Node nextnode = currnode.next;
        currnode.next = newnode;
        newnode.previous = currnode;
        newnode.next = nextnode;
        nextnode.previous = newnode;
        
        }
    }
    public void getprevious(int n){
        if(isEmpty()){
            System.out.println("The list is empty");
        }
        int i = 0;
        Node currnode = head;
        while (i != n ) {
            currnode = currnode.next;
            i++;
        }
        System.out.println(currnode.previous.data);

        
    }
    public int size(){
        return count;
    }
}

public class striverdll {
    public static void main(String[] args) {
        LL list = new LL();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.printlist();
        
        list.add(8);
        System.out.println();
        list.printlist();
        
        // list.deletelast();
        // list.getnnode(2);
        // list.getprevious(2);
    }
}
