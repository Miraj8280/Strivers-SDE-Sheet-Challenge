import java.io.*;
import java.util.* ;

import java.util.ArrayList;

public class Solution {
	public static ArrayList<ArrayList<Long>> printPascal(int n) {
                 // Write your code here.
		ArrayList<ArrayList<Long>> ans = new ArrayList<>();

		for(int i = 0; i < n; ++i) {
			ArrayList<Long> row = new ArrayList<>();
			for (int j = 0; j <= i; ++j) {
				if(j == 0 || j == i) {
					row.add(1L);
				}
				else {
					row.add(ans.get(i - 1).get(j - 1) + ans.get(i - 1).get(j));
				}
			}
			ans.add(row);
		}

		return ans;
	}
}

