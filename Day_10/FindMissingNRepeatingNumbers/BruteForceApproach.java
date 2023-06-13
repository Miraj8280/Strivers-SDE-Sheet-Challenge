import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {

    public static int[] missingAndRepeating(ArrayList<Integer> arr, int n) {
        // Write your code here
        int missing = -1;
        int repeating = -1;

        for(int i = 1; i <= n; ++i) {
            int count = 0;
        
            // travering the given array
            for(int j = 0; j < n; ++j) {
                if(arr.get(j) == i) {
                    count++;
                }
            }

            // finding the missing number
            if(count == 0) {
                missing = i;
            }

            // finding the repeating number
            else if(count == 2) {
                repeating = i;
            }

            if(missing != -1 && repeating != -1) {
                break;
            }
        }

        return new int[]{missing, repeating};
    }
}
