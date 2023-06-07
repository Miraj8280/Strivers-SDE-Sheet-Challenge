import java.util.* ;
import java.io.*; 

public class Solution {
	
	public static long maxSubarraySum(int[] arr, int n) {
		// write your code here
		if(n == 0) {
            return 0;
        }

        long maxSum = arr[0];
        long currSum = 0;

        for(int i = 0; i <= n - 1; ++i) {
            currSum += arr[i];
			maxSum = Math.max(maxSum, currSum);
            if(currSum < 0) {
                currSum = 0;
            }
        }

        if(maxSum <=0 ){
            return 0;
        }

        return maxSum;
	}

}
