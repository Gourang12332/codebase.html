class LL{
    Node head ;
    class Node {
        String data ;
        Node next ;
        Node(String data){
            this.data = data ;
            this.next = null ;
        }

    }
    public void addfirst(String data){
        Node newnode = new Node(data);
        if(head == null) {
            head = newnode ;
            return ;
        }
        newnode.next = head ;
        head = newnode; 
    }
    Node reverselist(Node head){
        if(head == null || head.next == null){
        return head;
        }
        Node prev = null;
        Node curr = head;
        while(curr != null){
        Node next = curr.next;
        curr.next = prev;
        prev = curr ;
        curr = next ;
        }
        head = prev ;
        return prev;
        }

    public void addlast(String data) {
    Node newnode  = new Node(data);
    Node currnode  = head ;
    while(currnode.next != null){
        currnode = currnode.next ;
    }
    currnode.next = newnode ;

    }
    public void printlist(){
        if(head == null ){
            System.out.println("the list is empty");
            return;
        }
        Node currnode = head ;
        while(currnode != null){
            System.out.print(currnode.data + "--->");
            currnode = currnode.next;
            
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        LL list = new LL() ;
        list.addfirst("list") ;
        list.addfirst("a") ;
        list.addfirst("is") ;
        list.addfirst("this") ;
        list.printlist();
        list.head = list.reverselist(list.head);
        System.out.println();
        list.printlist();
    }
}