import java.util.ArrayList;

class stac1{
    
    ArrayList<Integer> arr ;
    stac1(){
     arr = new ArrayList<>();
    }
    
    public void push(int data){
    // if(count == 5){
    //     System.out.println("Stack is full");
    // }
     arr.add(data);
    
    }
    public int peek(){
        return arr.get(arr.size()-1);
       }
       public void pop(){
        arr.remove(arr.size()-1);
        
       }
       public boolean isEmpty(){
        if(arr.isEmpty()){
            return true ;
        }
        return false ;
       }

}

public class stacks2 {
public static void main(String[] args) {
stac1 s1 = new stac1();
s1.push(1);
s1.push(2) ;
s1.push(3);
s1.push(4);
s1.push(5);
s1.push(6);
s1.push(7);
System.out.println(s1.peek());
while (!s1.isEmpty()) {
 System.out.println(s1.peek());
 s1.pop();    
}

}

}
