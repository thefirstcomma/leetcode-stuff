package may_thirtyday_leetcode_2020.week2;

// equiv to Leetcode367
public class Day9 {

    public static void main(String[] args) {
        System.out.println(isPerfectSquare(808201));
        // System.out.println(isPerfectSquare(14));
        // System.out.println(isPerfectSquare(100));
    }
    public static boolean isPerfectSquare(int num) {
        int i = 1;
        int high = num;
        if(num == 1) return true;

        while(i < high) {
            int middle = (high - i)/2 + i;
            long squared = (long)middle * middle;
            System.out.println("Middle: " + middle + " Squared: " + squared);
            if(squared == num) {
                return true;
            } else if(squared > num) {
                high = middle - 1;
            } else {
                i = middle + 1;
            }
        }
        return false;
    }
}
