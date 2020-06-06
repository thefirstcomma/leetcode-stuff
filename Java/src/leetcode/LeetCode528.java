package leetcode;

import java.util.Random;

public class LeetCode528 {

    static class Solution {

        Random rand;
        int sum = 0;
        double [] arr;

        public Solution(int[] w) {
            rand = new Random();
            arr = new double[w.length];
            for (int value : w) {
                sum += value;
            }
            arr[0] = 1.0 * w[0] / sum;
            for (int i = 1; i < arr.length-1; i++) {
                arr[i] = 1.0 * w[i] / sum + arr[i-1];
            }
            arr[arr.length-1] = 1.0;
        }

        public int pickIndex() {
            double val = rand.nextDouble();
            for(int i = 1; i < arr.length; i++) {
                if(val < arr[i] && val > arr[i-1]) {
                    return i;
                }
            }
            return 0;
        }
    }

    public static void main(String[] args) {
        Solution obj = new Solution(new int[] {1,3,4,6});
        System.out.print(obj.pickIndex()  + ", " + obj.pickIndex()  + ", ");
        System.out.print(obj.pickIndex()  + ", " + obj.pickIndex()  + ", ");
        System.out.print(obj.pickIndex()  + ", " + obj.pickIndex()  + ", ");
        System.out.print(obj.pickIndex()  + ", " + obj.pickIndex()  + ", ");
        System.out.print(obj.pickIndex()  + ", " + obj.pickIndex()  + ", ");
        System.out.print(obj.pickIndex()  + ", " + obj.pickIndex()  + ", ");
        System.out.print(obj.pickIndex()  + ", " + obj.pickIndex()  + ", ");
        System.out.print(obj.pickIndex()  + ", " + obj.pickIndex()  + ", ");
        System.out.print(obj.pickIndex()  + ", " + obj.pickIndex()  + ", ");
        System.out.print(obj.pickIndex()  + ", " + obj.pickIndex()  + ", ");
        System.out.print(obj.pickIndex()  + ", " + obj.pickIndex()  + ", ");
        System.out.print(obj.pickIndex()  + ", " + obj.pickIndex()  + ", ");
        System.out.print(obj.pickIndex()  + ", " + obj.pickIndex()  + "\n");
    }
}
