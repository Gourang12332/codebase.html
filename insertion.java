class insertion {
    public static void main(String[] args) {
    int arr[] = {4 ,3,5,2,6,1};
    int current = 0;
    int j = 0;
    for(int i =1 ;i<arr.length ;i++){
        current = arr[i];
        j = i-1 ;
        while (j>=0 && arr[j]> current) {
          
            arr[j+1] = arr[j];
           
          j--;
        }
        arr[j+1] = current ;
    }
    for(int i = 0 ;i<arr.length ;i++){
        System.out.println(arr[i]);
    }
    }
}