package leetcode;

import java.util.Arrays;

public class LeetCode977 {

    public static void main(String[] args) {
        int[] a1 = {-4,-1,0,3,10};
        int[] a2 = {-7,-3,2,3,11};
        System.out.println(Arrays.toString(sortedSquares(a1)));
        System.out.println(Arrays.toString(sortedSquares(a2)));
    }

    public static int[] sortedSquares(int[] A) {
        int[] result = new int[A.length];
        int start = 0, end = A.length-1;
        for(int i = result.length-1; i >= 0; i--) {
            if(Math.abs(A[start]) > Math.abs(A[end])) {
                result[i] = A[start] * A[start];
                start++;
            } else {
                result[i] = A[end] * A[end];
                end--;
            }
        }
        return result;
    }
}
