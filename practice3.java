


class Node{
int data;
Node next;
Node previous;
Node(int data){
this.data = data;
this.next = null;
this.previous  = null;
}
}


class dll { 
Node head;
Node temp;
public void add(int data){
    Node newnode  = new Node(data);
    if(head == null){
        head = newnode;
        temp = head;
        return;
    }
    temp.next = newnode;
    newnode.previous = temp;
    temp = newnode;
}
public void reverse(){
    Node previousnode = head;
    Node currnode = head.next;
    while(currnode!=null){
        Node nextnode = currnode.next;
        currnode.next = previousnode;
        currnode.previous = nextnode;
        previousnode = currnode;
        currnode = nextnode;
    }
    
    head.previous = head.next;
    head.next = null;
    head = previousnode;
}
public void remove(){
Node currnode = head;
while(currnode.next != null){
currnode = currnode.next;
}
Node prev = currnode.previous;
currnode.previous = null;
prev.next = null;

}
public void printlist(){
Node currnode = head;
while(currnode != null){
System.out.print(currnode.data + "--->");
currnode = currnode.next;
}
System.out.print("Null");
}
public void removennode(int idx){
    Node currnode = head;
    int i = 0;
while(i!=idx){
    currnode = currnode.next;
    i++;
}
Node prevnode = currnode.previous;
currnode.previous = null;
prevnode.next = currnode.next;
currnode.next = null;
}
}
class practice3{
 public static void main(String[] args) {
 dll dl = new dll();
 dl.add(1);
 dl.add(2);
 dl.add(3);
 dl.add(4);
 dl.printlist();
 System.out.println();
 dl.removennode(2);
 dl.printlist();
System.out.println();
 dl.reverse();
 dl.printlist();
}
}