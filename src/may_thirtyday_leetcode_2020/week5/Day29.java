package may_thirtyday_leetcode_2020.week5;

import java.util.*;

// equiv to LeetCode207
public class Day29 {

    public static void main(String[] args) {
        System.out.println(canFinish(2, new int[][] {{1,0}}));
        System.out.println(canFinish(2, new int[][] {{1,0}, {0,1}}));
    }

    public static boolean canFinish(int numCourses, int[][] prerequisites) {
        Queue<Integer> queue = new LinkedList<>();
        int[] arr = new int[numCourses];
        for(int i = 0; i < prerequisites.length; i++) {
            arr[prerequisites[i][1]]++;
        }
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 0)
                queue.offer(i);
        }
        while(!queue.isEmpty()) {
            int x = queue.poll();
            for(int[] prereq : prerequisites) {
                if(x == prereq[0]) {
                    arr[prereq[1]]--;
                    if(arr[prereq[1]] == 0)
                        queue.offer(prereq[1]);
                }
            }
        }
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] != 0)
                return false;
        }
        return true;
    }
}
