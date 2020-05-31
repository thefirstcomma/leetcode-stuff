package leetcode;

public class LeetCode1295 {

    public static void main(String[] args) {
        int[] arr = {12,345,2,6,7896};
        System.out.println(findNumbers(arr));
    }

    public static int findNumbers(int[] nums) {
        int result = 0;
        for(int i = 0; i < nums.length; i++) {
            int counter = 0;
            while(nums[i] != 0) {
                nums[i] /= 10;
                counter++;
            }
            if(counter % 2 == 0) result++;
        }
        return result;
    }
}
