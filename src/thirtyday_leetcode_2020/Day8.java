package thirtyday_leetcode_2020;

// equivalent to LeetCode876
public class Day8 {

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);
        l1.next = l2; l2.next = l3; l3.next = l4; l4.next = l5;
        ListNode result = middleNode(l1);
    }

    public static ListNode middleNode(ListNode head) {
        ListNode result = new ListNode(-1);
        if(head.next == null) return head;
        int counter = 0;
        int dualCounter = 0;
        ListNode temp = head;
        while(temp != null) {
            counter++;
            temp = temp.next;
        }

        if(counter % 2 == 0) {
            counter++;
        }

        while(dualCounter < counter/2+1) {
            result = head;
            head = head.next;
            dualCounter++;
        }

        return result;
    }

    public static void printNode(ListNode l1) {
        while(l1 != null) {
            System.out.print(l1.val + ", ");
            l1 = l1.next;
        }
    }

}
