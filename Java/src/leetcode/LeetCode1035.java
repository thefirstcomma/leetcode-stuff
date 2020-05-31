package leetcode;

import java.util.Arrays;

public class LeetCode1035 {

    public static void main(String[] args) {
        System.out.println(maxUncrossedLines(new int[] {2,5,1,2,5}, new int[] {10,5,2,1,5,2}));
        System.out.println(maxUncrossedLines(new int[] {1,2,3,4}, new int[] {4,3,2,1}));
        System.out.println(maxUncrossedLines(new int[] {1,2,4}, new int[] {1,4,2}));
    }

    public static int maxUncrossedLines(int[] A, int[] B) {
        int[][] dp = new int[A.length+1][B.length+1];
        for(int i = 0; i < A.length; i++) {
            for(int j = 0; j < B.length; j++) {
                if(B[j] == A[i]) {
                    dp[i+1][j+1] = 1 + dp[i][j];
                } else {
                    dp[i+1][j+1] = Math.max(dp[i+1][j], dp[i][j+1]);
                }
            }
        }
        System.out.println(Arrays.deepToString(dp));
        return dp[A.length][B.length];
    }
}