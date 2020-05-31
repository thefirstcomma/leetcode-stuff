package leetcode;

public class LeetCode485 {

    public static void main(String[] args) {
        System.out.println(findMaxConsecutiveOnes(new int[] {1,0,1,1,1,1,0,1,1,0,1}));
    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        int result = 0;
        int counter = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 1) {
                counter++;
            } else {
                counter = 0;
            }
            result = Math.max(counter, result);
        }
        return result;
    }
}
