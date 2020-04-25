package thirtyday_leetcode_2020.Week4;

// equivalent to LeetCode201
public class Day23 {

    public static void main(String[] args) {
        System.out.println(134217728 & 134217727); // why is this == 1??????
        System.out.println(rangeBitwiseAnd(10, 10000));
        // System.out.println(rangeBitwiseAnd(40, 50));
    }

    public static int rangeBitwiseAnd(int m, int n) {
        while(n > m) {
            System.out.println("N: " + n);
            n &= (n-1);
            System.out.println("New N: " + n);
        }
        return n & m;
    }
}
