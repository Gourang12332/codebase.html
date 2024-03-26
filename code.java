import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

class Pair<A, B> {
    public A element1;
    public B element2;
}

public class code {
    public static Pair<Integer, Integer> formPair(int A, int B) {
        Pair<Integer, Integer> form = new Pair<>();
        form.element1 = A;
        form.element2 = B;
        return form;
    }

    public static ArrayList<Pair<Integer, Integer>> twoSum(ArrayList<Integer> arr, int target, int n) {
        ArrayList<Pair<Integer, Integer>> ans = new ArrayList<>();
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {  // Fix here, removed -1
                if ((arr.get(i) + arr.get(j)) == target) {
                    ans.add(formPair(arr.get(i), arr.get(j)));
                }
            }
        }
               
        // Use HashSet directly with the Pair type
        HashSet<Pair<Integer, Integer>> uniqueSet = new HashSet<>(ans);
       
        // Convert the HashSet to an ArrayList
        ArrayList<Pair<Integer, Integer>> finalAns = new ArrayList<>(uniqueSet);
       
        return finalAns;
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Pair<Integer,Integer>> ans= new ArrayList<>();
        arr.add(0);
        arr.add(0);
        arr.add(0);
        arr.add(0);
        arr.add(0);

        int target = 0 ;
        int n = 5;
        ans = twoSum(arr, target, n);

        // System.out.println(ans.size());
     for(int i = 0 ; i<ans.size() ; i++){
       
        System.out.print(ans.get(i).element1);
        System.out.print(ans.get(i).element2);

        System.out.println();
     }

    }
}
