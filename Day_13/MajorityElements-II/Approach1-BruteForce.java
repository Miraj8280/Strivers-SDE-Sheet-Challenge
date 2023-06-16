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
        
        for(int i = 0; i < n; ++i) {
            if(ans.size() == 0 || arr.get(i) != ans.get(0)) {
                int count = 0;
                for(int j = 0; j < n; ++j) {
                    if(arr.get(i) == arr.get(j)) {
                        count++;
                    }
                }

                if(count > n / 3) {
                    ans.add(arr.get(i));
                }
            }

            if(ans.size() == 2) {
                break;
            }
        }

        return ans;
    }
}