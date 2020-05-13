package april_thirtyday_leetcode_2020.Week1;
import java.util.*;

// equivalent to Leetcode problem #136
public class Day1 {
    public static void main(String[] args) {
        int[] n1 = {4,1,2,1,2};
        int[] n2 = {2,2,1};
        int[] n3 = {2,3,2,3,1,1,3,3};
        int[] n4 = {1};
        int r1 = alt3(n1);
        int r2 = alt3(n2);
        int r3 = alt3(n3);
        int r4 = alt3(n4);
        System.out.printf("%d, %d, %d, %d,\n", r1, r2, r3, r4);
    }

    public static int singleNumber(int[] nums) {
        HashMap<Integer, Integer> hmap = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            int counter = 0;
            if(hmap.get(nums[i]) != null) {
                counter = hmap.get(nums[i]);
            }
            hmap.put(nums[i], ++counter);
        }

        for(int i = 0; i < nums.length; i++) {
            if(hmap.get(nums[i]) == 1 || hmap.get(nums[i]) >= 3) {
                return nums[i];
            }
        }
        return -1;
    }

    // only works if you assume 2 entrance maximum.
    public static int alt1(int[] nums) {
        int sumOfSet = 0, sumOfArr = 0;
        HashSet<Integer> hset = new HashSet<>();
        for(int i : nums) {
            if(!hset.contains(i)) {
                hset.add(i);
                sumOfSet += i;
            }
            sumOfArr += i;
        }
        return 2 * sumOfSet - sumOfArr;
    }

    public static int alt2(int[] nums, boolean poor) {
        Arrays.sort(nums);
        if(nums.length == 1 || nums[0] != nums[1]) {
            return nums[0];
        }
        for(int i = 1; i < nums.length-1; i++) {
            if(nums[i] != nums[i+1] && nums[i] != nums[i-1]) {
                return nums[i];
            }
        }
        return nums[nums.length-1];
    }

    public static int alt3(int[] nums) {
        int temp = 0;
        for(int i = 0; i < nums.length; i++) {
            temp = temp ^ nums[i];
        }
        return temp;
    }

    public static void printMap(HashMap<Integer, Integer> hmap) {
        hmap.forEach((k, v) -> {
            System.out.printf("Key: %d, Value: %d", k, v);
        });
    }
}
