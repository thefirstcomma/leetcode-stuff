package leetcode;

import java.util.Arrays;

public class LeetCode27 {

    public static void main(String[] args) {
        System.out.println(removeElement(new int[] {3,2,2,3}, 3));
        System.out.println(removeElement(new int[] {2,3,3,2}, 3));
        System.out.println(removeElement(new int[] {0,1,2,2,3,0,4,2}, 2));
    }

    public static int removeElement(int[] nums, int val) {

        int n = nums.length-1;
        int i = 0;

        while(i <= n) {
            if(nums[i] == val) {
                nums[i] = nums[n];
                n--;
            } else {

                i++;
            }
        }
        System.out.println(Arrays.toString(nums));
        return i;
    }
}
