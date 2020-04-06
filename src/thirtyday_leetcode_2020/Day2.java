package thirtyday_leetcode_2020;
import java.util.*;

// equivalent to LeetCode202
public class Day2 {
    public static void main(String[] args) {
        int a = 19;
        int b = 86;
        int c = 33;
        int d = 44;
        int e = 55;
        int f = 66;
        int g = 77;
        System.out.println(isHappy(a));
        System.out.println(isHappy(b));
        System.out.println(isHappy(c));
        System.out.println(isHappy(d));
        System.out.println(isHappy(e));
        System.out.println(isHappy(f));
        System.out.println(isHappy(g));

    }

    public static boolean isHappy(int n) {
        int size = String.valueOf(n).length();
        HashSet<Integer> hset = new HashSet<>();
        while(!hset.contains(n)) {
            hset.add(n);
            int sum = 0;
            while(size > 0) {
                sum = (sum + (int)Math.pow((n % 10), 2));
                n /= 10;
                size--;
            }
            size = String.valueOf(sum).length();
            if(sum == 1) {
                return true;
            }
            n = sum;
        }
        System.out.println(hset.size());
        return false;
    }

    // O(1) time and space, since size is ALWAYS <= 3 and maxCycle is a constant 50
    public static boolean alt1(int n) {
        int size = String.valueOf(n).length(), maxCycle = 50;
        while(maxCycle > 0) {
            int sum = 0;
            while(size > 0) {
                sum = (sum + (int)Math.pow((n % 10), 2));
                n /= 10;
                size--;
            }
            size = String.valueOf(sum).length();
            if(sum == 1) {
                return true;
            }
            n = sum;
            maxCycle--;
        }
        return false;
    }

}
