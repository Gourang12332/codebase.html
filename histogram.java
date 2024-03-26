public class histogram {
    public static void main(String[] args) {
        int temp = 0 ;
        int count = 0;
        int max =  0;
        int first = -1;
       int arr[] = {3,1,8,9,10,11,1};
       for(int i =0 ; i<arr.length-1 ; i++){
        count=1;
        if(arr[i] < arr[i+1]){
         temp = arr[i];
         int j = i ;
         while(j!=arr.length){
            if(arr[j]>arr[i]){
                count++;
            }
            j++;
         }
         if(first == -1){
         max = arr[i]*count;
         first = 0;
         }
         else if((arr[i]*count) > max) {
          max = arr[i]*count ;
         }
        }
        else {

        }
       }
       System.out.println("the maximum area is " + max);
    }
    
}

