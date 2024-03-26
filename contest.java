import java.util.Scanner;

class contest{
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t!=0){
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i = 0 ; i<n ;i++){
                arr[i] = sc.nextInt();
            }
            int sum = 0 ;
            for(int i = 0 ; i<n ;i++){
                sum += arr[i];
            }
            int ans = 0;
            int d = -1;
            int inc = 0;
            if(sum%3 == 0){
                ans = 0;
                d = 0;
            } else{
             inc = 3 - (sum % 3); // how many moves required through pure increment
            int remove = (sum%3);
            while(remove <= sum){
                for(int i = 0 ; i<arr.length ; i++){
                if(arr[i] == remove){
                ans = 1;
                d = 0;
                }
                }
                remove += 3;
            }
              

            }
            if(d == -1){
                System.out.println(inc);
              } else {
                System.out.println(ans);
              }


            t--;
        }
    }
}