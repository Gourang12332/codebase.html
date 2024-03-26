// ****************************************************************

//  Following is the class structure of the Node class:

import java.util.LinkedList;

class Node {
     public int data;
     public Node next;
    
     Node()
     {
         this.data = 0;
         this.next = null;
     }
    
     Node(int data)
     {
         this.data = data;
         this.next = null;
     }
    
     Node(int data, Node next)
     {
         this.data = data;
         this.next = next;
     }
 }

//  *****************************************************************

 public class ninja {
    public static Node reverseLL(Node head){
       if(head.next == null){
           return head;
       }
       Node newhead = reverseLL(head.next);
        head.next.next = head;
       head.next = null;
       return newhead;
    }
    public static boolean isPalindrome(Node head) {
        Node reversehead = reverseLL(head);
        Node temp = reversehead;
        int a = 0;
        Node currnode = head;
        while(currnode.next != null){
            if(currnode != temp){
                a = 1 ;
                break;
            }
            currnode = currnode.next;
            temp = temp.next;
        }
        if(a==1){
            return false;
        } else {
            return true;
        }
    }
    public static void main(String[] args) {
    LinkedList<Integer> LL = new LinkedList<>();
    LL.add(1);
    LL.add(2);
    LL.add(3);
    LL.add(4);
    LL.add(5);
    LL.add(6);
    System.out.println(isPalindrome());
    }
}