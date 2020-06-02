package june_thirtyday_leetcode_2020;

import java.util.List;

//equiv to LeetCode237
public class Day2 {

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public static void main(String[] args) {
        ListNode root = new ListNode(4);
        root.next = new ListNode(1);
        root.next.next = new ListNode(5);
        root.next.next.next = new ListNode(7);
        print(root);
        deleteNode(root.next);
        print(root);
    }

    public static void print(ListNode root) {
        while(root != null) {
            System.out.print(root.val + ", ");
            root = root.next;
        }
        System.out.println();
    }

    public static void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
