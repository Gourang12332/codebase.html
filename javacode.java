import java .util.Scanner;

class Solution {
    public static void main(String[] args) {
        setones();
    }
public static void setones(){
Scanner sc = new Scanner(System.in);
int t = sc.nextInt();
for(int o = 0 ; o < t ; o++) {
int n = sc.nextInt();
int m = sc.nextInt();
int arr[][] = new int[n][m];
// input
for(int i = 0 ; i< n ; i++) {
for(int j = 0 ; j< m ; j++) {
arr[i][j] = sc.nextInt();    
    }
}
// set ones
for(int i = 0 ; i< n ; i++) {
for(int j = 0 ; j< m ; j++){
    if(arr[i][j]==1){
        for(int k = 0 ; k<n ; k++) {
             arr[k][j] = (char)('a' +0)  ;
        }
        for(int v = 0 ; v<n ; v++) {
            arr[i][v] = (char)('a' +0)  ;
        }
    } else if(arr[i][j] != 1 ){
        arr[i][j] = arr[i][j];
    }
}
} 
for(int i = 0 ; i< n ; i++) {
for(int j = 0 ; j< m ; j++){
    if(arr[i][j] == 'a'){
        arr[i][j] = 1 ;
    }
}
}

// print array
for(int i = 0 ; i< n ; i++) {
for(int j = 0 ; j< m ; j++) {
System.out.print(arr[i][j]);
}
System.out.println();
}
}
}    
}