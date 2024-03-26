
class striver{
    static int first = -1 ;
public static void main(String[] args) {
int arr[] = {0,0,1,1,1,1,1,0,1,1,1,0,1,0,1,};
int hash[] = new int[2];
int j =0 ;

int max = 0 ;
for(int i =0 ; i<arr.length ; i++){
    max = 0 ;
if(arr[i] != 0){
    max++;
    j = i ;
    while(arr[j] != 0 && j<arr.length-1){
        max++;
        if(first == -1){
            hash[1] = max ;
            first = 0;
        }
        j++;
    }
}
if(max > hash[1]){
    hash[1] = max;
}


}

System.out.println(hash[1]);

}
}
