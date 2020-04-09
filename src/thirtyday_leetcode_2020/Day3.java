package thirtyday_leetcode_2020;

// equivalent to LeetCode53
public class Day3 {

    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        int[] arr2 = {1, 2};
        int[] arr3 = {-1, -2};
        int[] arr4 = {-2, 1};
        System.out.println(maxSubArray(arr));
        System.out.println(maxSubArray(arr2));
        System.out.println(maxSubArray(arr3));
        System.out.println(maxSubArray(arr4));
    }

    public static int maxSubArray(int[] nums) {
        int result = nums[0];
        int sum = 0;
        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if(sum > result)
                result = sum;
            if(sum <= 0)
                sum = 0;
        }
        return result;
    }

    // O(n^2) solution
    public static int alt1(int[] nums) {
        // result can also be Math.MIN_INTEGER
        int result = nums[0];
        for(int i = 0; i < nums.length; i++) {
            int sum = 0;
            for(int j = i; j < nums.length; j++) {
                sum += nums[j];
                result = Math.max(sum, result);
            }
        }
        return result;
    }

    public static int alt2(int[] nums) {
        int max = Integer.MIN_VALUE;
        int temp = 0;
        for(int i = 0; i < nums.length; i++) {
            temp += nums[i];
            if(temp < nums[i]) {
                temp = nums[i];
            }
            max = Math.max(max, temp);
        }
        return max;
    }

    public static int alt3(int[] nums) {
        int localMax = nums[0];
        int globalMax = nums[0];
        for(int i = 1; i < nums.length; i++) {
            localMax = Math.max(localMax + nums[i], nums[i]);
            globalMax = Math.max(globalMax, localMax);
        }
        return globalMax;
    }

}
