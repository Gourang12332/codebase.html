public class queue   {
    static class Queue{
    static int arr[];
    static int n;
    
    static int rear  = -1 ;
    
    
    Queue(int size){
    arr = new int[size];
    this.n = size ; 
    }
    //empty
    public boolean isEmpty(){
    return rear==-1;
    }
    public boolean isFull(){
    return rear == arr.length-1 ;
    }
    // enque
    public void add(int data){
    rear++;
    arr[rear] = data;
    }
    // peek
    public int  peek(){
    return arr[0];
    }
    // dequeue
    public int remove(){
    int front  = arr[0];
    for(int i = 0 ; i<rear;i++){
    arr[i] = arr[i+1];
    }
    rear--;
    
    return front;
    }
    } 
    public static void main(String[] args) {
    Queue q = new Queue(5);
    q.add(1);
    q.add(2);
    q.add(3);
    q.add(4);
    q.add(5);

    while(!q.isEmpty()){
    System.out.println(q.remove());
    }
    }   
    }
    