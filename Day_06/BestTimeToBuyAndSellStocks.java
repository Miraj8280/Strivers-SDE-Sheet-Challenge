import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution{
    public static int maximumProfit(ArrayList<Integer> prices){
        // Write your code here.
        int profitMax = 0;
        int minProfit = Integer.MAX_VALUE;

        for(int i = 0; i < prices.size(); ++i) {
            minProfit = Math.min(minProfit, prices.get(i));
            profitMax = Math.max(profitMax, prices.get(i) - minProfit);
        }

        return profitMax;
    }
}