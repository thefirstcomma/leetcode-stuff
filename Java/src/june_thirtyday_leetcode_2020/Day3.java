package june_thirtyday_leetcode_2020;

import java.util.Arrays;

// equiv to LeetCode1029
public class Day3 {

    public static void main(String[] args) {
        int[][] matrix = {{10, 20}, {30, 200}, {400, 50}, {30, 20}};
        System.out.println(twoCitySchedCost(matrix));

        int[][] m2 = {{20, 15}, {70, 30}, {100, 1}, {10, 10}};
        System.out.println(twoCitySchedCost(m2));
    }

    public static int twoCitySchedCost(int[][] costs) {
        int[] diff = new int[costs.length];
        int path = 0;

        for(int i = 0; i < costs.length; i++) {
            diff[i] = costs[i][1] - costs[i][0];
            path += costs[i][0];
        }

        Arrays.sort(diff);

        for(int i = 0; i < costs.length / 2; i++) {
            path += diff[i];
        }

        return path;
    }
}
