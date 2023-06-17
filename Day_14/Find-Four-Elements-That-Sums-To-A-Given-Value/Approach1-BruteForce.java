import java.io.*;
import java.util.* ;

public class Solution {
  public static String fourSum(int[] arr, int target, int n) {
      // Write your code here.
      Arrays.sort(arr);

      for(int i = 0; i < n; ++i) {
        for(int j = i + 1; j < n; ++j) {
          int p = j + 1;
          int q = arr.length - 1;
          int sum = target - (arr[i] + arr[j]);

          while(p < q) {
            if(sum == arr[p] + arr[q]) {
                return "Yes";
            }
            else if(sum < arr[p] + arr[q]) {
                q--;
            }
            else {
                p++;
            }
          }
        }
      }
      
      return "No";
  }
}

