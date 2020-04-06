package thirtyday_leetcode_2020;
import java.util.*;

// equivalent to LeetCode49
public class Day6 {

    /**
     * Input: ["eat", "tea", "tan", "ate", "nat", "bat"],
     *
     * Output:
     * [
     *   ["ate","eat","tea"],
     *   ["nat","tan"],
     *   ["bat"]
     * ]
     *
     */

    public static void main(String[] args) {
        String[] strA = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> l1 = groupAnagrams(strA);

        for(int i = 0; i < l1.size(); i++) {
            for(int j = 0; j < l1.get(i).size(); j++) {
                System.out.print(l1.get(i).get(j) + ", ");
            }
            System.out.println();
        }
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> charList = new ArrayList<>();

        for(int i = 0; i < strs.length; i++) {
            for(int j = 0; j < strs[i].length(); j++) {
                if(charList.contains(strs[i].charAt(j))) {

                }
            }
        }
        return charList;
    }
}
