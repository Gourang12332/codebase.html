
class stac{
    static int count =  0;
    int arr[];
    stac(){
     arr = new int[5];
    }
    
    public void push(int data){
    if(count == 5){
        System.out.println("Stack is full");
    }
     arr[count] = data ;
     count++;
    }
    public int peek(){
        return arr[count];
       }
       public void pop(){
        arr[count] = 0 ;
        count--;
       }
       public boolean isEmpty(){
        if(count == -1){
            return true ;
        }
        return false ;
       }

}

public class stacks1 {
public static void main(String[] args) {
stac s1 = new stac();
s1.push(1);
s1.push(2) ;
s1.push(3);
System.out.println(s1.peek());
while (!s1.isEmpty()) {
 System.out.println(s1.peek());
 s1.pop();    
}

}

}
