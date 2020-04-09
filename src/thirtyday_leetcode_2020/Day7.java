package thirtyday_leetcode_2020;
import java.util.*;

public class Day7 {

    public static void main(String[] args) {
        int[] arr = {1,3,2,3,5,0};
        System.out.println(countElements(arr));
    }

    public static int countElements(int[] arr) {
        int counter = 0;
        HashSet<Integer> hset = new HashSet<>();

        for(int i = 0; i < arr.length; i++) {
            hset.add(arr[i]);
        }

        for(int i = 0; i < arr.length; i++) {
            if(hset.contains(arr[i]+1))
                counter++;
        }
        return counter;
    }

    // O(n^2) solution
    public static int alt1(int[] arr) {
        int counter = 0;

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr.length; j++) {
                if(i == j) continue;
                if(arr[i] == arr[j]-1) {
                    counter++;
                    break;
                }
            }
        }
        return counter;
    }
}
