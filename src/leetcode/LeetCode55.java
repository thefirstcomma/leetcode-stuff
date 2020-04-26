package leetcode;

public class LeetCode55 {

    public static void main(String[] args) {
        int[] arr = {2,3,1,1,4};
        int[] arr2 = {3,2,1,0,4};
        System.out.println(canJump(arr));
        System.out.println(canJump(arr2));
    }

    public static boolean canJump(int[] nums) {
        int i = 0;
        for (int j = 0; i < nums.length && i <= j; ++i)
            j = Math.max(i + nums[i], j);
        return i == nums.length;
    }
}
