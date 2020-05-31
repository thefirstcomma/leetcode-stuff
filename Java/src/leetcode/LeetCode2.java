package leetcode;

public class LeetCode2 {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        ListNode l2 = new ListNode(4);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(5);
        ListNode l5 = new ListNode(6);
        ListNode l6 = new ListNode(4);

        l1.next = l2;
        l2.next = l3;
        l4.next = l5;
        l5.next = l6;

        printnode(l1);
        printnode(l4);

        ListNode result = addTwoNumbers(l1, l4);
        printnode(result);


        ListNode a = new ListNode(2);
        ListNode b = new ListNode(4);
        ListNode c = new ListNode(9);
        ListNode d = new ListNode(5);
        ListNode e = new ListNode(6);
        a.next = b;
        b.next = c;
        d.next = e;

        System.out.println();
        printnode(a);
        printnode(d);
        ListNode result2 = addTwoNumbers(a, d);
        printnode(result2);
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode start = new ListNode(-1);
        ListNode ref = start;
        boolean carry = false;

        while(l1 != null || l2 != null) {
            int x;
            int y;

            if(l1 == null) {
                x = 0;
            } else {
                x = l1.val;
            }
            if(l2 == null) {
                y = 0;
            } else {
                y = l2.val;
            }

            int sum = x + y;

            if(carry) {
                sum++;
            }

            if(sum >= 10) {
                carry = true;
                sum %= 10;
            } else {
                carry = false;
            }

            start.next = new ListNode(sum);
            start = start.next;
            if(l1 != null) {
                l1 = l1.next;
            }
            if(l2 != null) {
                l2 = l2.next;
            }
        }

        if(carry) {
            start.next = new ListNode(1);
        }
        return ref.next;
    }

    public static void printnode(ListNode l1) {
        while(l1 != null) {
            System.out.print(l1.val + ", ");
            l1 = l1.next;
        }
        System.out.println();
    }
}
