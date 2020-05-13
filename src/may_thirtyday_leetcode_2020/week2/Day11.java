package may_thirtyday_leetcode_2020.week2;

import java.util.Arrays;

// equivalent to Leetcode733
public class Day11 {

    public static void main(String[] args) {
        int[][] a = {{1,1,1},{1,1,0},{1,0,1}};
        System.out.println(Arrays.deepToString(floodFill(a, 1,1,2)));
    }

    public static int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        flood(image, sr, sc, image[sr][sc], newColor);
        return image;
    }

    public static void flood(int[][] image, int sr, int sc, int oldNumber, int newColor) {
        if(sr < 0 || sr > image.length-1 || sc < 0 || sc > image[0].length-1 ||
                image[sr][sc] == newColor || image[sr][sc] != oldNumber)
            return;
        image[sr][sc] = newColor;
        flood(image, sr-1, sc, oldNumber, newColor);
        flood(image, sr+1, sc, oldNumber, newColor);
        flood(image, sr, sc-1, oldNumber, newColor);
        flood(image, sr, sc+1, oldNumber, newColor);
    }
}
