import java.util.* ;
import java.io.*; 
public class Solution {
	public static int uniquePaths(int m, int n) {
		// Write your code here.
		int N = n + m - 2;
        int r = m - 1; 
		double ans = 1;
		
		for(int i = 1; i <= r; ++i) {
			ans = ans * (N - r + i) / i;
		}
		return (int)ans;
	}
}