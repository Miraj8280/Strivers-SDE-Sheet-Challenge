import java.io.*;
import java.util.* ;

public class Solution {
	public static int findMajority(int[] arr, int n) {
		// Write your code here.
		for(int i = 0; i < n; ++i) {
			int count = 0;
			for(int j = 0; j < n; ++j) {
				if(arr[i] == arr[j]) {
					count++;
				}
			}

			if(count > n / 2) {
				return arr[i];
			}
		}

		return -1;
	}
}
