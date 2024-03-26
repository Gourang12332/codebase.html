// public class bst {
//     public static void rec(int arr[] , int li , int hi , int mid ,int item){
//         mid = (li+hi)/2 ;
//         if(arr[mid] == item){
//             System.out.println("Got it hero gourang at index " + mid);
//             return ;
//         }
//         if(arr[mid] > item){
//           rec(arr, li, mid-1, mid,item);  
//         } else{
//             rec(arr, mid+1, hi, mid,item);
//         }
        
//        }
//     public static void main(String[] args) {
  
//         int arr[] = {2,5,6,8,10,12};
//         rec(arr, 0, arr.length-1, 0, 8);
        
//     }
// }

/**
 * bst
 * log n
 */
public class bst {

    public static void main(String[] args) {
     int arr[]  = {2,6,7,8,10};
     int high = arr.length-1 ;
     int low = 0 ;
     int mid =  0 ;
     int target = 7 ;
     while(arr[mid] != target){
        mid = (high+low)/2 ;
        if(arr[mid] == target){
            System.out.println("INDEX IS "+ mid);
            break;
        } else if(arr[mid]>target){
            high = mid-1 ;
        } else {
            low = mid +1 ;
        }
     }
     System.out.println("Thanks for the answers");
    }
}
