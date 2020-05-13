package leetcode;

public class LeetCode1232 {

    public static void main(String[] args) {
        int[][] arr = {{1,2},{2,3},{3,4},{4,5},{5,6},{6,7}};
        System.out.println(checkStraightLine(arr));

        int[][] arr2 = {{1,1},{2,2},{3,4},{4,5},{5,6},{7,7}};
        System.out.println(checkStraightLine(arr2));
    }

    public static boolean checkStraightLine(int[][] coordinates) {
        if(coordinates.length < 2) return false;
        double slope = (coordinates[1][1] - coordinates[0][1]) / (1.0 * (coordinates[1][0] - coordinates[0][0]));
        for(int i = 1; i < coordinates.length; i++) {
            double currValue = (coordinates[i][1] - coordinates[0][1]) / (1.0 * (coordinates[i][0] - coordinates[0][0]));
            if(currValue != slope) {
                return false;
            }
        }
        return true;
    }
}
