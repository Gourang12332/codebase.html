import java.util.Stack;

public  class queue2stack {
public static class QUEUE{
 static Stack<Integer> s1 = new Stack<>();
 static Stack<Integer> s2 = new Stack<>();
// is empty
public  static boolean Empty(){
return s1.isEmpty();
}
// add o(n)
public static void add(int data){
if(Empty()){
s1.push(data);
}
while(!s1.isEmpty()){
s2.push(s1.pop());
}
s1.push(data);

while(!s2.isEmpty()){
s1.push(s2.pop());
}
}
// remove o(1)
public static int remove(){
if(Empty()){
System.out.println("queue is empty");
return -1;
}
int top = s1.pop();
return top;
}
// peek o(1)
public static int peek(){
if(Empty()){
System.out.println("queue is empty");
return -1 ;
}
int top = s1.peek();
return top;
}
}
public static void main(String[] args) {
QUEUE s = new QUEUE();
s.add(1);
s.add(2);
s.add(3);
s.add(4);
s.add(5);

while(!s.Empty()){
System.out.println(s.remove());
}
}

}
 // remove and peek will be of o(n) when we insert data normally with complexity of o(1) and when we remove then we make use of another stack to remove the first data that was entered