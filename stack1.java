// linked list implementaion of stack

import java.util.ArrayList;

public class stack1{
 static class Node{
int data;
Node next;
Node(int data){
this.data = data;
this.next = null;
}
}
static class Stack{
Stack(){

};
public static Node head;
//empty
public boolean isEmpty(){
return head == null;
}
// push
public void push(int data){
Node newnode = new Node(data);
if(isEmpty()){
head = newnode;
}
newnode.next = head;
head = newnode ;
}
// peek
public int peek(){
if(isEmpty()){
return -1 ;
}
return head.data;
}
// pop
public int pop(){
if(isEmpty()){
return -1;
}
Node top = head;
head = head.next;
return top.data;
}
}
public static void main(String[] args) {
Stack s = new Stack();
s.push(1);
s.push(2);
s.push(3);
s.push(4);
while (!s.isEmpty()) {
System.out.println(s.peek());    
s.pop();
}
}
}

