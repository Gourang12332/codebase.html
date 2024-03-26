import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void merge(int arr[]){
    
    }
	public static void main (String[] args) throws java.lang.Exception
	{
	 Scanner sc = new Scanner(System.in);
	 long T = sc.nextLong();
	 while(T!=0){
	     long n = sc.nextLong();
	     ArrayList<Long> arr = new ArrayList<>();
	     for(long i = 0L ; i<n ;i++){
	        long a = sc.nextLong();
	        arr.add(a);
	     }
	     Collections.sort(arr);
	     
	     long j = 0L;
	     long count = 0L;
	     for(long i = 0L ; i<((int) arr.size())-1 ; i++){
	     j = i+1;
	     count += arr.get((int) i) + arr.get((int) j);
	     }
	     
	     System.out.println(count);
	     T--;
	 }

	}
}
    