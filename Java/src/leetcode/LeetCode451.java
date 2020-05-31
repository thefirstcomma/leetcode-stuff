package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LeetCode451 {

    public static void main(String[] args) {
        System.out.println(frequencySort("tree"));
        System.out.println(frequencySort("cccaaa"));
        System.out.println(frequencySort("Abcsdfweraffff"));
    }

    public static String frequencySort(String s) {
        StringBuilder sb = new StringBuilder();
        HashMap<Character, Integer> hmap = new HashMap<>();
        List<Character>[] arr = new List[s.length() + 1];

        for(char c: s.toCharArray()) {
            hmap.put(c, hmap.getOrDefault(c, 0) + 1);
        }
        for(char c : hmap.keySet()) {
            int freq = hmap.get(c);
            if(arr[freq] == null) {
                arr[freq] = new ArrayList<>();
            }
            arr[freq].add(c);
        }

        for(int i = arr.length-1; i >= 0; i--) {
            if(arr[i] != null) {
                for(char c : arr[i]) {
                    for(int j = 0; j < i; j++) {
                        sb.append(c);
                    }
                }
            }
        }

        return sb.toString();
    }
}
