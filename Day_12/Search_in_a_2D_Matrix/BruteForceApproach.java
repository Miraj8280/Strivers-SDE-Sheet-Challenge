import java.util.ArrayList;
public class Solution {
    static boolean searchMatrix(ArrayList<ArrayList<Integer>> mat, int target) {
        // Write your code here.
        ArrayList<Integer> temp = new ArrayList<>();

        for(ArrayList<Integer> row : mat) {
            for(Integer element : row) {
                temp.add(element);
            }
        }

        int left = 0;
        int right = temp.size() - 1;

        while(left <= right) {
            int mid = left + (right - left) / 2;
            if(temp.get(mid) == target) {
                return true;
            }
            else if(temp.get(mid) < target) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }

        return false;
    }
}

