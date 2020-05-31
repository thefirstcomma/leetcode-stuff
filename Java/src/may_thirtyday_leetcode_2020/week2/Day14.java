package may_thirtyday_leetcode_2020.week2;

import java.util.*;

// equiv to Leetcode208
public class Day14 {

    public static void main(String[] args) {
        Trie obj = new Trie();
        obj.insert("apple");
        boolean param_2 = obj.search("apple");
        boolean param_3 = obj.startsWith("apps");
        System.out.println(param_2 + ", " + param_3);
    }
}

class Trie {

    class TrieNode {

        boolean isEnd;
        TrieNode[] chars;

        public TrieNode(){
            chars = new TrieNode[26];
            isEnd = false;
        }

        public boolean contains(char c) {
            return chars[c - 'a'] != null;
        }

        public void put(char c, TrieNode node) {
            chars[c - 'a'] = node;
        }

        public TrieNode get(char c) {
            return chars[c - 'a'];
        }

        public void setEndTrue() {
            isEnd = true;
        }
    }

    TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    public void insert(String word) {
        TrieNode node = root;
        for (int i = 0; i < word.length(); i++) {
            char currChar = word.charAt(i);
            if (!node.contains(currChar)) {
                node.put(currChar, new TrieNode());
            }
            node = node.get(currChar);
        }
        node.setEndTrue();
    }

    public boolean search(String word) {
        TrieNode node = root;
        for(int i = 0; i < word.length(); i++) {
            char currChar = word.charAt(i);
            if(!node.contains(currChar)) {
                return false;
            }
            node = node.get(currChar);
        }
        return node.isEnd;
    }

    public boolean startsWith(String prefix) {
        TrieNode node = root;
        for(int i = 0; i < prefix.length(); i++) {
            char c = prefix.charAt(i);
            if(!node.contains(c)) {
                return false;
            }
            node = node.get(c);
        }
        return true;
    }
}

// using a HashMap
//class Trie {
//    HashMap<Integer, String> hmap;
//    int counter;
//
//    /** Initialize your data structure here. */
//    public Trie() {
//        hmap = new HashMap<>();
//        counter = 0;
//    }
//
//    /** Inserts a word into the trie. */
//    public void insert(String word) {
//        hmap.put(counter, word);
//        counter++;
//    }
//
//    /** Returns if the word is in the trie. */
//    public boolean search(String word) {
//        return hmap.containsValue(word);
//    }
//
//    /** Returns if there is any word in the trie that starts with the given prefix. */
//    public boolean startsWith(String prefix) {
//        for(int i = 0; i < hmap.size(); i++) {
//            String currWord = hmap.get(i);
//            if(currWord.length() >= prefix.length() &&
//                    currWord.substring(0, prefix.length()).equals(prefix))
//                return true;
//        }
//        return false;
//    }
//}

