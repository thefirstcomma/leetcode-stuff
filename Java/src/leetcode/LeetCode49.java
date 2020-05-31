package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class LeetCode49 {

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
        printList(l1);
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hmap = new HashMap<>();
        for(int i = 0; i < strs.length; i++) {
            String sortedStr = sorted(strs[i]);
            if(!hmap.containsKey(sortedStr)) {
                hmap.put(sortedStr, new ArrayList<>());
            }
            hmap.get(sortedStr).add(strs[i]);
        }

        return new ArrayList(hmap.values());
    }

    public static String sorted(String str) {
        char[] temp = str.toCharArray();
        Arrays.sort(temp);
        return new String(temp);
    }

    public static void printList(List<List<String>> list) {
        System.out.println("[");
        for (List<String> strings : list) {
            System.out.print("[");
            for (String string : strings) {
                System.out.print(string + ", ");
            }
            System.out.print("]\n");
        }
        System.out.println("]");
    }
}
