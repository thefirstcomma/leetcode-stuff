package leetcode;
import java.util.*;

public class LeetCode3 {

    public static void main(String[] args) {
        String test1 = "dvxdxf";
        String test2 = "bbbbb";
        String test3 = "dvxdf";
        String test4 = "pwwkew";
        String test5 = "abcabcbb";

        System.out.println(test1 + ": " + lengthOfLongestSubstring(test1));
        System.out.println(test2 + ": " + lengthOfLongestSubstring(test2));
        System.out.println(test3 + ": " + lengthOfLongestSubstring(test3));
        System.out.println(test4 + ": " + lengthOfLongestSubstring(test4));
        System.out.println(test5 + ": " + lengthOfLongestSubstring(test5));
    }

    public static int lengthOfLongestSubstring(String s) {
        int result = 0;
        for(int i = 0; i < s.length(); i++) {
            for(int j = i+1; j < s.length(); j++) {
                if(s.charAt(i) == s.charAt(j) || j == s.length()-1) {
                    result = Math.max(Math.abs(i - j), result);
                    if(result == 4)
                        System.out.printf("%s - i:%d j:%d chars: %c & %c%n", s, i, j, s.charAt(i), s.charAt(j));
                    break;
                }
            }
        }
        return result;
    }

    public static void printhset(HashSet<Character> hset) {
        for(char c: hset) {
            System.out.print(c + ", ");
        }
        System.out.println();
    }

}
