package may_thirtyday_leetcode_2020.week4;

import java.util.Arrays;

// equiv to LeetCode525
public class Day26 {

    public static void main(String[] args) {
        int[] a = {0,1,0};
        int[] b = {1,0,1,0,1,0,1,1,1,0,1,0,1,0,1};

        System.out.println(findMaxLength(a));
        System.out.println(findMaxLength(b));
    }

    public static int findMaxLength(int[] nums) {
        int[] arr = new int[2 * nums.length + 1];
        Arrays.fill(arr, -2);
        arr[nums.length] = -1;

        int result = 0, count = 0;
        for(int i = 0; i < nums.length; i++) {
            count = count + (nums[i] == 0 ? -1 : 1);
            if(arr[count + nums.length] >= -1) {
                result = Math.max(result, i - arr[count + nums.length]);
            } else {
                arr[count + nums.length] = i;
            }

        }
        return result;
    }
}
