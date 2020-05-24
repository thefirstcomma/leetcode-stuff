package may_thirtyday_leetcode_2020.week4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// equiv to Leetcode986
public class Day23 {

    public static void main(String[] args) {
        int[][] maA = {{0,2},{5,10},{13,23},{24,25}};
        int[][] maB = {{1,5},{8,12},{15,24},{25,26}};
        int[][] r1 = intervalIntersection(maA, maB);
        print(r1);
    }

    public static void print(int[][] arrs) {
        for (int[] arr : arrs) {
            for (int j = 0; j < arrs[0].length; j++) {
                System.out.print(arr[j] + ", ");
            }
            System.out.println();
        }
    }

    public static int[][] intervalIntersection(int[][] A, int[][] B) {
        int i = 0, j = 0;
        int x = -1, y = -1;
        ArrayList<int[]> list = new ArrayList<>();
        while(i < A.length && j < B.length) {
            x = Math.max(A[i][0], B[j][0]);
            y = Math.min(A[i][1], B[j][1]);
            if (x <= y)
                list.add(new int[]{x, y});

            if(A[i][1] < B[j][1]) {
                i++;
            } else {
                j++;
            }
        }

        return list.toArray(new int[list.size()][]);
    }
    
}
