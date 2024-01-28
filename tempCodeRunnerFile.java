import java.util.Scanner;

public class pract {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
 int T = sc.nextInt();
 while (T!=0) {
 int n = sc.nextInt();
 int k = sc.nextInt();
 String str = "";
 if(k>n){
    while (k!=0) {
        str += (char)(96+k) ;
        k--;
     }  
 } else {
 while (k!=0) {
    str += (char)(96+k) ;
    k--;
 }
 int l = str.length()-1;
 while(l!=-1){
    str += str.charAt(l);
    l--;
 }
}
 System.out.println(str);
    T--;
 }
}
}