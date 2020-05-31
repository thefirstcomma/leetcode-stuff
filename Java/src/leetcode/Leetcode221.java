package leetcode;

public class Leetcode221 {

    public static void main(String[] args) {
        char[][] matrix = {{'1', '0', '1', '0', '0'},
                {'1', '0', '1', '1', '1'},
                {'1', '1', '1', '1', '1'},
                {'1', '0', '0', '1', '0'} };

        char[][] matrix2 = {{'1', '1', '1', '1', '0'},
                {'1', '1', '1', '1', '1'},
                {'1', '1', '1', '1', '1'},
                {'1', '0', '1', '1', '0'} };
        System.out.println(maximalSquare(matrix));
        System.out.println(maximalSquare(matrix2));
    }

    public static int alt1(char[][] matrix) {
        if(matrix.length == 0) return 0;
        int result = 0;
        int[][] cache = new int[matrix.length+1][matrix[0].length+1];

        for (int i = 1 ; i <= matrix.length; i++) {
            for (int j = 1; j <= matrix[0].length; j++) {
                if(matrix[i-1][j-1] == '1') {
                    cache[i][j] = Math.min(Math.min(cache[i][j-1] , cache[i-1][j-1]), cache[i-1][j]) + 1;
                    result = Math.max(cache[i][j], result);
                }
            }
        }
        return (int)Math.pow(result, 2);
    }

    public static int maximalSquare(char[][] matrix) {
        int size = 0;
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j] == '1') {
                    int temp = checkSquare(matrix, i, j);
                    size = Math.max(temp, size);
                }
            }
        }
        return size;
    }

    public static int checkSquare(char[][] matrix, int i, int j) {
        int counter = 1;
        for(int inc = 0; i < matrix.length && j < matrix[0].length; inc++){
            if(matrix[i][j] == '1') {
                for(int a = 1; a <= inc; a++) {
                    if (matrix[i-a][j] == '0' || matrix[i][j-a] == '0') {
                        return counter;
                    }
                }
                counter = (int)Math.pow(inc + 1, 2);
                i++;
                j++;
            } else {
                return counter;
            }
        }
        return counter;
    }
}
