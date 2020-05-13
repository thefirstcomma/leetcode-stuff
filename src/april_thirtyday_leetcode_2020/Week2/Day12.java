package april_thirtyday_leetcode_2020.Week2;
import java.util.*;

// equivalent to LeetCode1046
public class Day12 {

    public static void main(String[] args) {
        int[] arr = {2,7,4,1,8,1};
        int[] arr2 = {4,1,1};
        System.out.println(lastStoneWeight(arr2));
    }

    public static int lastStoneWeight(int[] stones) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i: stones) {
            list.add(i);
        }
        Collections.sort(list);
        Collections.reverse(list);

        while(list.size() > 1) {
            int a = list.get(0), b = list.get(1);
            list.remove(1);
            list.remove(0);
            if(a != b) {
                int sub = a-b;
                int retIndex = helper(list, sub);
                list.add(retIndex, a-b);
            }
        }
        if(list.size() == 1)
            return list.get(0);
        else
            return 0;

    }

    public static int helper(ArrayList<Integer> list, int value) {
        for(int i = 0; i < list.size(); i++) {
            if(list.get(i) <= value) {
                return i;
            }
            if(i == list.size()-1) {
                return i+1;
            }
        }
        return 0;
    }

}
