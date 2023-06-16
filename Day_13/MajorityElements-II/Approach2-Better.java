import java.io.*;
import java.util.* ;

import java.util.ArrayList;

public class Solution 
{
    public static ArrayList<Integer> majorityElementII(ArrayList<Integer> arr) 
    {
        // Write your code here.
        int n = arr.size();
        ArrayList<Integer> ans = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < n; ++i) {
            int value = map.getOrDefault(arr.get(i), 0);
            map.put(arr.get(i), value + 1);
        }

        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();

            if(value > n / 3) {
                ans.add(key);
            }
        }

        return ans;
    }
} 