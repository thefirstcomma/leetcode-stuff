package may_thirtyday_leetcode_2020.week2;

import java.lang.reflect.Array;
import java.util.*;

// equiv to Leetcode208
public class Day14 {

    public static void main(String[] args) {
        Trie obj = new Trie();
        obj.insert("apple");
        boolean param_2 = obj.search("apple");
        boolean param_3 = obj.startsWith("app");
        System.out.println(param_2 + ", " + param_3);
    }
}

// using binary search/array list
class Trie {

    class TrieNode{
        Map<Character, TrieNode> charToNode;
        boolean isEnd = false;
        public TrieNode(){
            charToNode = new HashMap();
        }


    }

    TrieNode head;

    public Trie() {
        head = new TrieNode();
    }

    public void insert(String word) {
        if(word == null)
            return;
        TrieNode node = head;
        for(char ch : word.toCharArray()) {
            if(!node.charToNode.containsKey(ch)){
                node.charToNode.put(ch, new TrieNode());
            }
            node = node.charToNode.get(ch);
        }
        node.isEnd = true;


    }

    public boolean search(String word) {
        if(word == null)
            return false;
        TrieNode node = head;
        for(char ch : word.toCharArray()) {
            if(!node.charToNode.containsKey(ch)){
                return false;
            }
            node = node.charToNode.get(ch);

        }
        return node.isEnd;

    }

    public boolean startsWith(String prefix) {
        if(prefix == null)
            return false;
        TrieNode node = head;
        for(char ch : prefix.toCharArray()) {
            if(!node.charToNode.containsKey(ch)){
                return false;
            }
            node = node.charToNode.get(ch);

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

