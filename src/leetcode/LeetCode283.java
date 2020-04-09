package leetcode;

public class LeetCode283 {

    public static void main(String[] args) {
        int[] arr = {0,1,0,3,12};
        int[] arr2 = {1};
        int[] arr3 = {1,1};
        moveZeroes(arr);
        moveZeroes(arr2);
        moveZeroes(arr3);
        printarr(arr);
        printarr(arr2);
        printarr(arr3);
    }

    public static void moveZeroes(int[] nums) {
        int j = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != 0 && nums[j] == 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
            if(nums[j] != 0) {
                j++;
            }
        }
    }

    // O(n^2) solution, inplace
    public static void alt1(int[] nums) {
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 0) {
                for(int j = i+1; j < nums.length; j++) {
                    if(nums[j] != 0) {
                        int temp = nums[j];
                        nums[j] = nums[i];
                        nums[i] = temp;
                        break;
                    }
                }
            }
        }
    }

    public static void printarr(int[] arr) {
        for(int value: arr) {
            System.out.print(value + ", ");
        }
        System.out.println();
    }
}
