package leetcode;

import java.util.HashSet;

public class LeetCode387 {

    public static void main(String[] args) {
        System.out.println(firstUniqChar("leetcode"));
        System.out.println(firstUniqChar("aaabcdbc"));
        System.out.println(firstUniqChar("aaaaaaffffffaaaad"));
        System.out.println(firstUniqChar("aaaaaaffddddaafadfafafafd"));
    }

    public static int firstUniqChar(String s) {
        int[] alphabet = new int[26];
        for(char c : s.toCharArray()) {
            alphabet[c - 'a'] += 1;
        }

        for(int i = 0; i < s.length(); i++) {
            if(alphabet[s.charAt(i) - 'a'] == 1) return i;
        }
        return -1;
    }

    public static int alt1(String s) {
        HashSet<Character> hset = new HashSet<>();

        if(s.length() == 1) return 0;
        for(int i = 0; i < s.length(); i++) {
            if(hset.contains(s.charAt(i))) {
                continue;
            }
            if(i == s.length()-1) return s.length()-1;
            hset.add(s.charAt(i));
            for(int j = i; j < s.length(); j++) {
                if(i == j) continue;
                if(s.charAt(i) == s.charAt(j)) {
                    break;
                } else if(j == s.length()-1) {
                    return i;
                }
            }
        }
        return -1;
    }
}
