package may_thirtyday_leetcode_2020.week1;

import java.util.*;

// equivalent to Leetcode771
public class Day2 {

    public static void main(String[] args) {
        System.out.println(numJewelsInStones("aA", "aAAbbbb"));
    }

    public static int numJewelsInStones(String J, String S) {
        int counter = 0;
        HashSet<Character> hset = new HashSet<>();
        for(int i = 0; i < J.length(); i++) {
            hset.add(J.charAt(i));
        }

        for(int j = 0; j < S.length(); j++) {
            if(hset.contains(S.charAt(j))) counter++;
        }
        return counter;
    }
}
