import java.util.Scanner;

class ninja{
public static int comp(int arr1[] , int arr2[]){
int count1 = 0;
int count2 =0 ;
int i =0;
int j = 1;
int k = 0;

while (k!=arr1.length-1) {
    

if(arr1[k] != arr2[k]){
    
while (j!=arr1.length) {
 if(arr1[j] == arr2[j]){
 
 } else{
 if(arr1[k] != arr1[j]){
    int temp = arr1[k];
    arr1[k] = arr1[j];
    arr1[j] = temp;
    count2++;
 } 
 }
 j++;    
}
}
k++;
}
while( i != arr1.length){
    if(arr1[i] == arr2[i]){
    
    } else{
    count1++;
    }
    }
    return count1 + count2 ;
}
public static int makearr(String str1, String str2, int n) {
    int arr1[] = new int[n];
    int arr2[] = new int[n];
    for (int i = 0; i < n; i++) {
        arr1[i] = str1.charAt(i) - '0';
    }
    for (int i = 0; i < n; i++) {
        arr2[i] = str2.charAt(i) - '0';
    }
    return comp(arr1, arr2);
}

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int T = sc.nextInt();
while (T!=0) {
int n = sc.nextInt();
int a = sc.nextInt();
int b = sc.nextInt();
String str1 = Integer.toString(a);
String str2 = Integer.toString(b);

System.out.println(str1);
System.out.println(str2);


int ans = makearr(str1 , str2,n);
System.out.println(ans);
T--;    
}
}
}