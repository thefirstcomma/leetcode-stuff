package may_thirtyday_leetcode_2020.week1;
import java.util.HashMap;

// equivalent to Leetcode169
public class Day6 {

    public static void main(String[] args) {
        System.out.println(alt1(new int[]{6, 5, 5}));
        System.out.println(alt1(new int[]{1, 3, 3, 4, 3, 5, 3, 3}));
    }

    // O(n) time, O(n) space, using Hashmap.
    public static int majorityElement(int[] nums) {
        HashMap<Integer, Integer> hmap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hmap.containsKey(nums[i])) {
                hmap.put(nums[i], hmap.get(nums[i]) + 1);
            }
            hmap.putIfAbsent(nums[i], 1);

            if (hmap.get(nums[i]) > nums.length / 2)
                return nums[i];
        }
        return -1;
    }

    // O(n) time, O(1) space -- Moore's Majority Algorithm
    public static int alt1(int[] nums) {
        int currentwinner = 0, count = 0;
        for (int num : nums) {
            if (count == 0) {
                currentwinner = num;
                count++;
            } else {
                if (num != currentwinner)
                    count--;
                else
                    count++;
            }
        }
        return currentwinner;
    }
}
