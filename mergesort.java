// Merge sort

import java.util.ArrayList;

public class practice {
 public static void conquer(int arr[], int low ,int mid,int high){
 int i = low;
 int j = mid+1;

 ArrayList<Integer> array = new ArrayList<>();
 while(i<=mid && j <= high){
    if(arr[i]<=arr[j]){
     array.add(arr[i]);
     i++;
    } else{
        array.add(arr[j]);
        j++;
    }
    
 }
 while(i<=mid){
    array.add(arr[i]);
    i++;
 }
 while(j<= high){
    array.add(arr[j]);
    j++;
 }
 for(int t =0 ; t<array.size() ;t++){
 arr[low+t] = array.get(t);
 }
 
 }
public static void  Mergesort(int arr[],int low ,int high){
if(low<high){
int mid = (high+low)/2 ;
Mergesort(arr, low, mid);
Mergesort(arr, mid+1, high);
conquer(arr,low,mid,high);

}
return;
}
public static void main(String[] args) {
    int arr[] = {3,6,7,1,12,11};
    
     Mergesort(arr,0,5);
    for(int i = 0 ;i<arr.length ; i++){
        System.out.print(arr[i] + " ");
    }
}
}
