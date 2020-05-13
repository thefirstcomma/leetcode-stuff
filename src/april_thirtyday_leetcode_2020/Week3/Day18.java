package april_thirtyday_leetcode_2020.Week3;

// equivalent to LeetCode64
public class Day18 {

    public static void main(String[] args) {
        int[][] grid = {{1,3,1},
                        {1,5,1},
                        {4,2,1}};
        System.out.println(minPathSum(grid));
    }

    public static int minPathSum(int[][] grid) {
        if(grid.length == 0) return 0;
        int row = grid.length;
        int col = grid[0].length;
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                if(i == 0 && j != 0)
                    grid[i][j] = grid[i][j] + grid[i][j-1];
                else if(i != 0 && j == 0)
                    grid[i][j] = grid[i][j] + grid[i-1][j];
                else if(i != 0 && j != 0)
                    grid[i][j] = grid[i][j] + Math.min(grid[i][j-1], grid[i-1][j]);
            }
        }
        return grid[row-1][col-1];
    }

}
