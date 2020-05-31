package leetcode;

public class LeetCode201 {
    public static void main(String[] args) {
        System.out.println(rangeBitwiseAnd(5, 7));
        System.out.println(rangeBitwiseAnd(40, 50));
        System.out.println(10000 & 2);
    }

    public static int rangeBitwiseAnd(int m, int n) {
        while(n > m) {
            n &= (n-1);
        }
        return n & m;
    }
}
