package thirtyday_leetcode_2020.Week3;

// equivalent to LeetCode238
public class Day15 {

    public static void main(String[] args) {
        int[] arr = {2,3,4,1,1};
        int[] res1 = productExceptSelf(arr);
        printarr(res1);
    }

    public static int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int temp = 1;
        for(int i = 0; i < nums.length; i++) {
            result[i] = temp;
            temp *= nums[i];
        }
        printarr(result);
        temp = 1;
        for(int i = nums.length-1; i >= 0; i--) {
            result[i] *= temp;
            temp *= nums[i];
        }
        return result;
    }

    public static void printarr(int[] arr) {
        for (int value : arr) {
            System.out.print(value + ", ");
        }
        System.out.println();
    }
}
