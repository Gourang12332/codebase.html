import java.util.ArrayList;
import java.util.List;

class bravo{
    public static void intersection(int a[] , int b[]){
     
     List<Integer> arr = new ArrayList<>();
     int vis[] = new int[b.length];
     for(int i = 0 ; i<a.length ; i++){
        for(int j =0 ;j<b.length ;j++){
        if(a[i] == b[j] && vis[j] == 0){
            arr.add(a[i]);
            vis[j] = 1 ;
            break;           
        } else if(b[j] > a[i]) {
          break;
        }
        }
     }
     for(int k =0 ; k<arr.size() ;k++){
        System.out.println(arr.get(k));
     }

    }
    public static void main(String[] args) {
    int a[] = {2,3,4,1,5};
    int b[] = {1,4,5,6,7,8,9,10};
    intersection(a, b);
    }
}