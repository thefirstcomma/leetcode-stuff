package april_thirtyday_leetcode_2020.Week3;

// equivalent to LeetCode200
public class Day17 {

    public static void main(String[] args) {
        char[][] grid1 = {{'1','1','1','1','0'},
                        {'1','1','0','1','0'},
                        {'1','1','0','0','0'},
                        {'0','0','0','0','0'}};

        char[][] grid2 = {{'1','1','0','0','0'},
                        {'1','1','0','0','0'},
                        {'0','0','1','0','0'},
                        {'0','0','0','1','1'}};

        System.out.println(numIslands(grid1));
        System.out.println(numIslands(grid2));
    }

    public static int numIslands(char[][] grid) {
        int number = 0;
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[i].length; j++) {
                if(grid[i][j] == '1'){
                    isUniqueIsland(grid, i, j);
                    number++;
                }
            }
        }
        return number;
    }

    public static void isUniqueIsland(char[][] grid, int i, int j) {
        if(i < 0 || j < 0 || i > grid.length-1 || j > grid[0].length-1 || grid[i][j] == '0') {
            return;
        }
        grid[i][j] = '0';
        isUniqueIsland(grid, i-1, j);
        isUniqueIsland(grid, i+1, j);
        isUniqueIsland(grid, i, j-1);
        isUniqueIsland(grid, i, j+1);
    }
}
