package leetcode;

import java.util.Stack;
public class LeetCode155 {

    public static class MinStack {

        int min = Integer.MAX_VALUE;
        Stack<Integer> stack = new Stack<>();

        public void push(int x) {
            if(x <= min){
                stack.push(min);
                min=x;
            }
            stack.push(x);
        }

        public void pop() {
            if(stack.pop() == min)
                min=stack.pop();
        }

        public int top() {
            return stack.peek();
        }

        public int getMin() {
            return min;
        }

        public void print() {
            System.out.println(stack.toString());
        }

    }

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
//        minStack.push(2);
//        minStack.push(0);
//        minStack.push(3);
//        minStack.push(0);

        minStack.push(2);
        minStack.print();
        minStack.push(0);
        minStack.print();
        minStack.push(3);
        minStack.print();
        minStack.push(0);
        minStack.print();

        System.out.println("\n" + minStack.getMin());
        minStack.pop();
        minStack.print();
        System.out.println(minStack.getMin());
        minStack.pop();
        minStack.print();
        System.out.println(minStack.getMin());
        minStack.pop();
        minStack.print();
        System.out.println(minStack.getMin());
    }
}
