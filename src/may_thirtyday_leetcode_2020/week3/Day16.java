package may_thirtyday_leetcode_2020.week3;

// equiv to LeetCode328
public class Day16 {
    static class ListNode {
        ListNode next;
        int val;
        ListNode() {}
        ListNode(int i) {
            val = i;
        }
        ListNode(int i, ListNode next) {
            val = i;
            this.next = next;
        }
    }
    public static void main(String[] args) {
        ListNode a = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));
        ListNode b = new ListNode(5, new ListNode(6, new ListNode(7, new ListNode(8))));
        a.next.next.next.next = b;

        ListNode x = new ListNode(1, new ListNode(2, new ListNode(3)));
        x.next.next.next = new ListNode(4, new ListNode(5));
        ListNode r1 = oddEvenList(x);
        print(r1);
    }

    public static void print(ListNode ln) {
        while(ln != null) {
            System.out.print(ln.val + ", ");
            ln = ln.next;
        }
        System.out.println();
    }

    public static ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null || head.next.next == null) return head;
        ListNode second = new ListNode(-1);
        ListNode secondPointer = second;
        ListNode curr = head;
        int i = 1;

        while(curr != null) {
            ListNode temp = curr;
            if(i % 2 == 1 && curr.next != null) {
                second.next = new ListNode(curr.next.val);
                second = second.next;
                curr.next = curr.next.next;
                i++;
            }
            i++;
            if(curr.next == null) {
                temp.next = secondPointer.next;
                break;
            }
            curr = curr.next;
        }
        return head;
    }
}
