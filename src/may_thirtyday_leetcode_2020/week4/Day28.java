package may_thirtyday_leetcode_2020.week4;

import java.util.Arrays;

// equiv to LeetCode338
public class Day28 {

    public static void main(String[] args) {
        int[] a = countBits(4);
        System.out.println(Arrays.toString(a));
    }

    public static int[] countBits(int num) {
        int[] result = new int[num + 1];
        for(int i = 1; i < num+1; i++) {
            int counter = 0;
            String bits = Integer.toBinaryString(i);
            for(int j = 0; j < bits.length(); j++) {
                if(bits.charAt(j) == ('1'))
                    counter++;
            }
            result[i] = counter;
        }
        return result;
    }
}
