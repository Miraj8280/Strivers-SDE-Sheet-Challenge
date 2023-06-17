import java.io.*;
import java.util.* ;

public class Solution{
    public static List<int[]> pairSum(int[] arr, int s) {
        // Write your code here.
        Arrays.sort(arr);
        HashMap<Integer,Set<Integer>> map = new HashMap<>();
        List<int[]> ans = new ArrayList<>();

        for(int i = 0; i < arr.length; ++i) {
            map.putIfAbsent(arr[i], new HashSet<>());
            map.get(arr[i]).add(i);
        }

        for(int i = 0; i < arr.length; ++i){
            if(map.containsKey(arr[i])) {
                map.get(arr[i]).remove(i);
            }

            if(map.containsKey(s - arr[i])) {
                Set<Integer> value = map.get(s - arr[i]);
                int[] temp = new int[2];
               
                temp[0] = arr[i];
                temp[1] = s - arr[i];

                for(int it : value) {
                    ans.add(temp);
                }
            }
        }

        return ans;
    }
}

