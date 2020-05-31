package leetcode;

public class LeetCode53 {

    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        int[] arr2 = {1, 2};
        int[] arr3 = {-3, -2, -1};
        int[] arr4 = {-2, 1};
        System.out.println(at2(arr));
        System.out.println(maxSubArray(arr2));
        System.out.println(maxSubArray(arr3));
        System.out.println(maxSubArray(arr4));
    }

    public static int maxSubArray(int[] nums) {
        int result = nums[0];
        int sum = 0;
        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];
            result = Math.max(sum, result);
            if(sum <= 0)
                sum = 0;
        }
        return result;
    }

    public static int at2(int[] nums) {
        int result = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if(sum < nums[i]) {
                sum = nums[i];
            }
            result = Math.max(result, sum);
        }
        return result;
    }

    public static int alt3(int[] nums) {
        int sum = nums[0];
        int result = nums[0];
        for(int i = 1; i < nums.length; i++) {
            sum = Math.max(sum + nums[i], nums[i]);
            result = Math.max(result, sum);
        }
        return result;
    }

}
