package leetcode;
import java.util.*;

public class LeetCode1 {

    public static void main(String[] args) {
        int[] a1 = {2, 7, 11, 15};
        int[] result = twoSum(a1, 9);
        printarr(result);
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        HashMap<Integer, Integer> hmap = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            if(hmap.containsKey(nums[i])) {
                result[0] = hmap.get(nums[i]);
                result[1] = i;
                break;
            }
            hmap.put(target - nums[i], i);
        }
        return result;
    }

    public static void printarr(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println();
    }

}
