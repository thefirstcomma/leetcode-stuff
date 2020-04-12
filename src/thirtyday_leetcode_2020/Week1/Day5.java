package thirtyday_leetcode_2020.Week1;

// equivalent to LeetCode122
public class Day5 {

    public static void main(String[] args) {
        int[] arr1 = {7,1,5,3,6,4};
        int[] arr2 = {1,2,3,4,5};
        int[] arr3 = {7,6,4,3,1};
        int[] arr4 = {7,2,1,5};
        int[] arr5 = {7,1,2,5};
        int[] arr6 = {7,2,1,0,7};
        System.out.println(maxProfit(arr1));
        System.out.println(maxProfit(arr2));
        System.out.println(maxProfit(arr3));
        System.out.println(maxProfit(arr4));
        System.out.println(maxProfit(arr5));
        System.out.println(maxProfit(arr6));
    }

    public static int maxProfit(int[] prices) {
        int profit = 0;
        for(int i = 0; i < prices.length-1; i++) {
            if(prices[i+1] > prices[i]) {
                profit += prices[i+1] - prices[i];
            }
        }
        return profit;
    }

}
