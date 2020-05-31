package may_thirtyday_leetcode_2020.week3;

// equiv to Leetcode918
public class Day15 {

    public static void main(String[] args) {
        System.out.println(maxSubarraySumCircular(new int[] {5, -3, 5}));
        System.out.println(maxSubarraySumCircular(new int[] {1, -2, 3, -1}));
        System.out.println(maxSubarraySumCircular(new int[] {3,-1,2,-1}));
    }

    public static int maxSubarraySumCircular(int[] A) {
        int sum = 0;
        int max = -30000;
        int min = 30000;
        int curMin = 0;
        int curMax = 0;
        int result;

        for (int i : A) {
            curMax = Math.max(curMax + i, i);
            curMin = Math.min(curMin + i, i);
            max = Math.max(max, curMax);
            min = Math.min(min, curMin);
            sum += i;
        }
        if(max > 0) {
            result = Math.max(max, sum - min);
        } else {
            result = max;
        }
        return result;
    }
}
