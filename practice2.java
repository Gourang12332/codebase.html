// Quicksort

public class practice2 {
    public static int pivot(int arr[] , int low , int high){
       int pivot = arr[high];
       int i = low-1;
       int j = low;
       while(j<high){
       
       if(arr[j]<=pivot){
        i++;
        int temp  = arr[i];
        arr[i]  = arr[j];
        arr[j] = temp;
       }
      

       j++;
       }
       i++;
       int temp = arr[high];
       arr[high] = arr[i]; // why when we write pivot instead then it is not working
       arr[i] = temp;

       return i;
    }
    public static void Quicksort(int arr[] , int low ,int high){
        if(low>=high){
            return ;
        }
     int pividx = pivot(arr,low,high);
     Quicksort(arr , low , pividx-1);
     Quicksort(arr, pividx, high);
    }
public static void main(String[] args) {
    int arr[] = {4,6,7,10,3};
    Quicksort(arr,0,4);

    for(int i = 0 ; i<arr.length ; i++){
        System.out.print(arr[i] + " ");
    }
}
}
