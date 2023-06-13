import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {

    public static int[] missingAndRepeating(ArrayList<Integer> arr, int n) {
        // Write your code here
        
        // 1 + 2 + 3 + ...+ n
        long sumOneToN = n * (n + 1) / 2;
        
        // 1^2 + 2^2 + 3^2 + ...+ n^2
        long sumSqrOneToN = n * (n + 1) * (2 * n + 1) / 6;
        
        // sum of the given array elements
        long sumOfArr = 0;
        
        // sum of square of the given array elements
        long sumSqrOfArr = 0;

        for(int it : arr) {
            sumOfArr += it;
            sumSqrOfArr += (long)it * (long)it;
        }

        /*
        Lets missing number is 'm' and repeating number is 'r' and
        => m - r = sumOneToN - sumOfArr
        => m^2 - r^2 = sumSqrOneToN - sumSqrOfArr
        => Now, m^2 - r^2 = (m + r)(m - r)
        => So, m + r = (m^2 - r^2) / (m - r)
        Lets,   x = m - r
                y = m^2 - r^2
                z = m + r
        => So,  m = (x + z) / 2
                r = z - m
            
        */
        
        // m - r
        long x = sumOneToN - sumOfArr;

        // m^2 - r^2
        long y = sumSqrOneToN - sumSqrOfArr;

        // m + r
        long z = y / x;
        
        // missing number
        long m = (x + z) / 2;

        // repeating number
        long r = (z - m);

        return new int[]{(int)m, (int)r};
    }
}
