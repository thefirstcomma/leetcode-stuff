package leetcode;

import java.util.*;

public class LeetCode66 {

    public static void main(String[] args) {
        int[] a1 = {1,9,9};
        int[] a2 = {9};
        int[] a3 = {9,9,9,9};
        int[] a4 = {1,1,1};
        int[] a5 = {0};
        int[] a6 = {1};

        System.out.println(Arrays.toString(plusOne(a1)));
        System.out.println(Arrays.toString(plusOne(a2)));
        System.out.println(Arrays.toString(plusOne(a3)));
        System.out.println(Arrays.toString(plusOne(a4)));
        System.out.println(Arrays.toString(plusOne(a5)));
        System.out.println(Arrays.toString(plusOne(a6)));
    }

    public static int[] plusOne(int[] digits) {
        for(int i = digits.length-1; i >= 0; i--) {
            if(digits[i] + 1 == 10) {
                digits[i] = 0;
            } else {
                digits[i] += 1;
                return digits;
            }
        }

        int[] res = new int[digits.length + 1];
        res[0] = 1;
        return res;
    }
}
