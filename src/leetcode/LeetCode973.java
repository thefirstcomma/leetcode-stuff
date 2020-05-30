package leetcode;

import java.util.Arrays;
import java.util.Comparator;

import static java.util.Arrays.deepToString;

public class LeetCode973 {

    public static void main(String[] args) {
        int[][] m1 = {{1,3},{-2,2}};
        int[][] m2 = {{3,3},{5,-1},{-2,4}};
        int[][] m3 = {{-5,4},{-6,-5},{4,6}};
        System.out.println(deepToString(kClosest(m1, 1)));
        System.out.println(deepToString(kClosest(m2, 2)));
        System.out.println(deepToString(kClosest(m3, 2)));
    }

    public static int[][] kClosest(int[][] points, int K) {
        int[][] result = new int[K][2];
        double[][] list = new double[points.length][2];

        for(int i = 0; i < points.length; i++) {
            double d = Math.sqrt((Math.pow(points[i][0],2)) + (Math.pow(points[i][1],2)));
            list[i][0] = d;
            list[i][1] = i;
        }
        Arrays.sort(list, Comparator.comparingDouble(o -> o[0]));

        for(int i = 0; K > 0; i++, K--) {
            int index = (int) list[i][1];
            result[i][0] = points[index][0];
            result[i][1] = points[index][1];
        }
        return result;
    }
}
