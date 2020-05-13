package leetcode;

import java.util.LinkedHashMap;

public class LeetCode146 {

    public static void main(String[] args) {
        LRUCache lru = new LRUCache(2);
        lru.put(1,1);
        lru.put(2,2);
        lru.put(3,3);
        System.out.println(lru.get(1));
        System.out.println(lru.get(2));
        lru.put(4,4);
        System.out.println(lru.get(3));
        lru.put(5,5);
        System.out.println(lru.get(4));
        System.out.println(lru.get(5));
        System.out.println(lru.get(3));
    }
}

class LRUCache {

    LinkedHashMap<Integer, Integer> hmap;
    int capacity;

    public LRUCache(int capacity) {
        hmap = new LinkedHashMap<>();
        this.capacity = capacity;
    }

    public int get(int key) {
        if(hmap.containsKey(key)) {
            int value = hmap.get(key);
            hmap.remove(key);
            hmap.put(key, value);
            return value;
        }
        return -1;
    }

    public void put(int key, int value) {
        if(hmap.containsKey(key)) {
            hmap.remove(key);
        }else if(hmap.size() >= capacity) {
            hmap.remove(hmap.keySet().iterator().next());
        }
        hmap.put(key, value);
    }
}
