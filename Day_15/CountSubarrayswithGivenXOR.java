import java.io.*;
import java.util.* ;

import java.util.ArrayList;

public class Solution {
	public static int subarraysXor(ArrayList<Integer> arr, int x) {
		// Write your code here.
		HashMap<Integer, Integer> visited = new HashMap<>();
        visited.put(0, 1); 
        int cpx = 0;
        int count = 0;

        for (int i = 0; i < arr.size(); ++i) {
            cpx ^= arr.get(i);

            int m = cpx ^ x;
            if (visited.containsKey(m)) {
                count += visited.get(m);
            }

            visited.put(cpx, visited.getOrDefault(cpx, 0) + 1);
        }

        return count;
	}
}