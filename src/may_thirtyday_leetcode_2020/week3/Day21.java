package may_thirtyday_leetcode_2020.week3;

// equiv to LeetCode1277
public class Day21 {

    public static void main(String[] args) {

    }

    public static int countSquares(int[][] matrix) {
        int[] indicies = new int[matrix.length];
        int counter = 0;
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j] == 1)
                    counter++;
            }
        }
        return counter;
    }
}
