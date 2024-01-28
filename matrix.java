import java.util.* ;
import java.io.*; 
import java.util.Scanner;
class CountPrime {
public int totalPrime(int s, int e){
int count =0 ;
if(s==2 ){
count++;
}
else if(s==3 ){
count++;
}
for(int i =s ;i<=e;i++){
for(int j=(int)Math.sqrt(i) ; j>=2;j--){
if(i%j==0){
break;
} 
count++;
}

}
return count;
} 	

}

class matrix {
	public static void main(String args[]) {
		
		CountPrime obj = new CountPrime();
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int e = sc.nextInt();
		System.out.println(obj.totalPrime(s, e));
	}
}
		
			