
class Node {
    String data;
    Node next;
  Node(String data){
    this.data = data ;
    this.next = null;
  }
}
 class stas {
    stas(){

    }
  public Node head;

    public boolean isEmpty(){
        if(head == null){
            return true;
        }
        return false;
    }
    
    public void push(String data){
    Node newnode = new Node(data);
    if(isEmpty()){
    head = newnode;
    return;
    }
    newnode.next = head;
    head = newnode;
 }
 public String peek(){
    return head.data;
 }
 public void pop(){
    head = head.next;
 }
}
public class stacks3 {
public static void main(String[] args) {
    stas stic = new stas();
    stic.push("Hi");
    stic.push("I");
    stic.push("am");
    stic.push("Gourang");
while(!stic.isEmpty()){
 System.out.println(stic.peek() + "----->");
 stic.pop();
}
}
}
