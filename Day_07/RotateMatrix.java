import java.io.*;
import java.util.* ;

import java.util.ArrayList;

public class Solution {
    public static void rotateMatrix(ArrayList<ArrayList<Integer>> mat, int n, int m) {
        // Write your code here.
        int left = 0;
        int right = m - 1;
        int top = 0;
        int bottom = n - 1;

        while(left < right && top < bottom) {
            int prev = mat.get(top + 1).get(left);
        
            for(int i = left; i <= right; ++i) { 
                int curr = mat.get(top).get(i);
                mat.get(top).set(i, prev);
                prev = curr;
            }
            top++; 

            for(int i = top; i <= bottom; ++i) {
                int curr = mat.get(i).get(right);
                mat.get(i).set(right, prev); 
                prev = curr;
            }
            right--;

            for(int i = right; i >= left; --i) {
                int curr = mat.get(bottom).get(i);
                mat.get(bottom).set(i, prev);
                prev = curr; 
            }
            bottom--;

            for(int i = bottom; i >= top; --i) {
                int curr = mat.get(i).get(left);
                mat.get(i).set(left, prev);
                prev = curr;
            }
            left++;
        }
    }
}
