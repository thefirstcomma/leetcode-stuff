package leetcode;

public class LeetCode278 {

    public static void main(String[] args) {
        System.out.println(firstBadVersion(5));
    }

    public static boolean isBadVersion(int n) {
        return n >= 4;
    }
    public static int firstBadVersion(int n) {
        int low = 1, result = -1;
        while(low <= n) {
            int middle = (n-low)/2 + low;
            if(isBadVersion(middle)) {
                result = middle;
                n = middle-1;
            } else {
                low = middle+1;
            }
        }

        return result;
    }
}
