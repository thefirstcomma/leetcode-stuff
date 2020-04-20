package thirtyday_leetcode_2020.Week3;

// equivalent to LeetCode33
public class Day19 {

    public static void main(String[] args) {
        int[] a1 = {4,5,6,7,8,0,1,2};
        System.out.println(search(a1, 0));
    }

    public static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;

        while(start <= end) {
            int middle = (end+start)/2;
            if(nums[middle] == target) return middle;

            // if left side is sorted
            if(nums[start] <= nums[middle]) {
                if(target < nums[middle] && target >= nums[start]) {
                    end = middle-1;
                } else {
                    start = middle+1;
                }
            // else if right side is sorted
            } else if(nums[middle] <= nums[end]) {
                if(target > nums[middle] && target <= nums[end]) {
                    start = middle + 1;
                } else {
                    end = middle - 1;
                }
            }
        }
        return -1;
    }
}
