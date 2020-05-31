package may_thirtyday_leetcode_2020.week3;

import java.util.Stack;

// equiv to LeetCode901
public class Day19 {

    public static void main(String[] args) {
        StockSpanner S = new StockSpanner();
        int p1 = S.next(100); // returns 1
        int p2 = S.next(80); // returns 1
        int p3 = S.next(60); // returns 1
        int p4 = S.next(70); // returns 2
        int p5 = S.next(60); // returns 1
        int p6 = S.next(75); // returns 4
        int p7 = S.next(85); // returns 6
        System.out.println(p1 + ", " + p2 + ", " + p3 + ", " + p4 + ", " + p5 + ", " + p6 + ", " + p7);
    }

    static class StockSpanner {

        Stack<int[]> stack;

        public StockSpanner() {
            stack  = new Stack<>();
        }

        public int next(int price) {
            int counter = 1;
            // stack --> [[price, counter], [price, counter], ...]
            while(!stack.isEmpty() && stack.peek()[0] <= price) {
                counter += stack.pop()[1];
            }
            stack.push(new int[] {price, counter});
            return counter;
        }

    }

}
