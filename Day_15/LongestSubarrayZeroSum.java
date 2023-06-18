import java.io.*;
import java.util.* ;

import java.util.ArrayList;

public class Solution {

	public static int LongestSubsetWithZeroSum(ArrayList<Integer> arr) {

		// Write your code here.
		int length = 0;
		int sum = 0;
		HashMap<Integer, Integer> map = new HashMap<>();

		for(int i = 0; i < arr.size(); ++i) {
			sum += arr.get(i);
			if(map.containsKey(sum)) {
				length = Math.max(length, (i - map.get(sum)));
			}
			else if(sum == 0) {
				length = i + 1;
			}
			else {
				map.put(sum, i);
			}
		}

		return length;
	}
}