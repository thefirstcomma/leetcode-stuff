package may_thirtyday_leetcode_2020.week3;

import java.util.*;

// equiv to Leetcode567
public class Day18 {

    public static void main(String[] args) {
        System.out.println(checkInclusion("ab", "aaeidbacsooo"));
    }

    public static boolean checkInclusion(String s1, String s2) {
        int[] count = new int[26];
        int left = 0, right = 0;

        for(char c : s1.toCharArray()) {
            count[c - 'a']++;
        }

        for(char c : s2.toCharArray()) {
            right++;
            if(count[c - 'a']-- > 0) {
                if((right - left == s1.length())) {
                    return true;
                }
            } else {
                while(s2.charAt(left) != c)  {
                    count[s2.charAt(left++) - 'a']++;
                }
                count[s2.charAt(left++) - 'a']++;
            }
        }
        return false;
    }

}
