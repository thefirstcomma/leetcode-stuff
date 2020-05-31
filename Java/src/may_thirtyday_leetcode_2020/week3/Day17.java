package may_thirtyday_leetcode_2020.week3;

import java.util.*;

// equiv to LeetCode438 && Day18
public class Day17 {

    public static void main(String[] args) {
        List<Integer> list = findAnagrams("cbaebabacd", "abc");
        System.out.println(list.toString());
    }

    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new LinkedList<>();
        if(p.length() > s.length() || s.length() == 0 || p.length() == 0) return list;

        Map<Character, Integer> map = new HashMap<>();
        for(char c : p.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int counter = map.size();
        int begin = 0, end = 0;

        while(end < s.length()){
            char c = s.charAt(end);
            if(map.containsKey(c)){
                map.put(c, map.get(c)-1);
                if(map.get(c) == 0)
                    counter--;
            }
            end++;

            while(counter == 0){
                char tempc = s.charAt(begin);
                if(map.containsKey(tempc)){
                    map.put(tempc, map.get(tempc) + 1);
                    if(map.get(tempc) > 0)
                        counter++;
                }
                if(end - begin == p.length()) {
                    list.add(begin);
                }
                begin++;
            }
        }
        return list;
    }

    public static List<Integer> alt1(String s, String p) {
        List<Integer> list = new ArrayList<>();
        if (s == null || s.length() == 0 || p == null || p.length() == 0) return list;

        int[] hash = new int[256];
        for (char c : p.toCharArray()) {
            hash[c]++;
        }

        int left = 0, right = 0, count = p.length();
        while (right < s.length()) {
            if (hash[s.charAt(right++)]-- >= 1)
                count--;

            if (count == 0)
                list.add(left);

            if (right - left == p.length() && hash[s.charAt(left++)]++ >= 0)
                count++;
        }
        return list;
    }

}
