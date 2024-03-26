public class insertion {
public static void main(String[] args) {
int arr[] = {4,8,90,100,120,13};
for(int i = 0 ;i<arr.length ; i++){
    int j = i;
    int temp = arr[j];
// shifting
    while(j>0 && temp<arr[j-1]  ){
    arr[j] =  arr[j-1];
    j--;
    }
   
    arr[j] = temp;
}
for(int i = 0 ; i<arr.length ; i++){
    System.out.print(arr[i]+ " ");
}
}
}


// public class insertion {
//     public static void main(String[] args) {
//     int arr[] = {4,100,10,90,13};
//     for(int i = 0 ;i<arr.length ; i++){
//         int j = i;
//         int temp = arr[j];
//     // shifting
//         while(j>0 && arr[j]<arr[j-1]  ){
//         arr[j] = arr[j-1];
//         j--;
//         }
//        arr[j] = temp;
        
//     }
//     for(int i = 0 ; i<arr.length ; i++){
//         System.out.print(arr[i]+ " ");
//     }
//     }
//     }
    
