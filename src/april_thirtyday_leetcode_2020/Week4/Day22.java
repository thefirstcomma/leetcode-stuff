package april_thirtyday_leetcode_2020.Week4;

// equivalent to LeetCode560
public class Day22 {

    public static void main(String[] args) {
        int[] arr = {28,54,7,-70,22,65,-6};
        int[] arr2 = {2,1,5,3,3,2,1};
        int[] arr3 = {0,0,0,0,0,0,0,0,0,0};
        System.out.println(subarraySum(arr, 100));
        System.out.println(subarraySum(arr2, 6));
        System.out.println(subarraySum(arr3, 0));
    }

    public static int subarraySum(int[] nums, int k) {
        int counter = 0;
        for(int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                if(sum == k) {
                    counter++;
                }
            }
        }
        return counter;
    }

}
