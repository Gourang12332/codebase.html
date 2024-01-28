import java.util.Stack;

public class stack2{
public static void PushAtBottom(int data, Stack<Integer> s){
Stack<Integer> s1 = new Stack<>();
while(!s.isEmpty()){
s1.push(s.pop());
}
s.push(data);

while(!s1.isEmpty()){
s.push(s1.pop());
}
}
public static void reverse(Stack<Integer> s){
if(s.isEmpty()){
return;
}
int top = s.pop();
reverse(s);
PushAtBottom(top, s);
}
public static void main(String[] args) {
Stack<Integer> s = new Stack<>();
s.push(1);    
s.push(2);
s.push(3);
s.push(4); 

reverse(s);
while (!s.isEmpty()) {
System.out.println(s.pop());    
}
}
}
