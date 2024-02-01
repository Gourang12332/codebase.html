/**
 * recursion-1
 */
 class recursion {
    public static int sum(int n , int sum){
    if(n==1){
    return sum;
    }
    n--;
    sum += n;
    sum(n ,sum);
    return sum ;
    }
 public static void main(String[] args) {
    int n = 5 ;
    int ans = sum(n , 0); 
    System.out.println(ans);
 }
    
}