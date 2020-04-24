package thirtyday_leetcode_2020.Week4;

// equivalent to LeetCode201
public class Day23 {

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
