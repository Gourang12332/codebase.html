import java.util.*;
class iota{
public static int[] newarray(int arr[],int idx1){
int newarray[] = new int[idx1];
for(int i=0;i<idx1;i++){
newarray[i] = arr[i];
}
return newarray ;
}



public static int count(int arr[],int idx1,int idx2) {
int count  = 0;
for(int i =idx1+1 ; i < idx2; i++){
count += arr[idx1]- arr[i];
}
System.out.println("count:" + count);
return count;
}



public static int  saturate(int arr[]){
int idx1 =0 ;
ArrayList<Integer> wrr = new ArrayList<>();
for(int i =0 ; i<arr.length;i++){
wrr.add(arr[i]);
}
Collections.sort(wrr);
int n = wrr.get(wrr.size()-2);
for(int i =0 ; i<arr.length;i++){
if(arr[i] == n){
idx1 = i;
}
}
return idx1;
}
public static void main(String[] args) {
int arr[]= {0,1,0,2,1,0,1,3,2,1,2,1};
int b = 0 ;
int idx1 = saturate(arr);
int a = count(arr, idx1, arr.length-1);
if(idx1>0){
int arr2[] = newarray(arr, idx1);
int id = saturate(arr2);
 b =count(arr2, id, arr2.length-1);
}
System.out.println(a+b);
}

}
