import java.util.* ;
import java.io.*; 
public class Solution 
{
    public static void sort012(int[] arr)
    {
        //Write your code here
        int left = 0;
        int mid = 0;
        int right = arr.length - 1;
        int temp = 0;
        
        while(mid <= right) {
            switch(arr[mid]) {
                case 0 : 
                    temp = arr[left];
                    arr[left] = arr[mid];
                    arr[mid] = temp;
                    left++;
                    mid++;
                    break;
                
                case 1 :
                    mid++;
                    break;
                    
                case 2 : 
                    temp = arr[right];
                    arr[right] = arr[mid];
                    arr[mid] = temp;
                    right--;
                    break;
            }
        }
    }
}