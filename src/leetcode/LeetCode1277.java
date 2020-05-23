package leetcode;

public class LeetCode1277 {

    public static void main(String[] args) {
        int[][] matrix = {{1,0,1,0,1},
                {1,1,1,1,1},
                {0,1,1,1,1},
                {0,1,1,1,1},
                {1,1,0,1,1},
        };
        System.out.println(countSquares(matrix));
        print(matrix);
    }

    public static void print(int[][] matrix) {
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.print(anInt + ", ");
            }
            System.out.println();
        }
    }

    public static int countSquares(int[][] matrix) {
        int counter = 0;
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                if(i > 0 && j > 0 && matrix[i][j] > 0) {
                    matrix[i][j] = Math.min(matrix[i-1][j-1], Math.min(matrix[i-1][j], matrix[i][j-1])) + 1;
                }
                counter += matrix[i][j];
            }
        }
        return counter;
    }
}
