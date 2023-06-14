public class Solution {
    public static long getInversions(long arr[], int n) {
        // Write your code here.
        int start = 0;
        int end = n - 1;
        return mergeSort(arr, start, end);
    }

    static long merge(long arr[], int start, int mid, int end) {
        long count = 0;
        int left = start;
        int right = mid + 1;
        int countInversions = 0;
        long temp[] = new long[end - start + 1];

        while(left <= mid && right <= end) {
            if(arr[left] <= arr[right]) {
                temp[countInversions++] = arr[left++];
            } 
            else {
                temp[countInversions++] = arr[right++];
                count += (mid - left + 1); 
            }
        }

        while(left <= mid) {
            temp[countInversions++] = arr[left++];
        }

        while(right <= end) {
            temp[countInversions++] = arr[right++];
        }

        for(int i = 0; i < temp.length; ++i) {
            arr[start + i] = temp[i];
        }
        return count;
    }
    
    static long mergeSort(long arr[], int start, int end) {
        long count = 0;
        if(start < end) {
            int mid = start + (end - start) / 2;
            count += mergeSort(arr, start, mid);
            count += mergeSort(arr, mid + 1, end);
            count += merge(arr, start, mid, end);
        }
        return count;
    }

}
