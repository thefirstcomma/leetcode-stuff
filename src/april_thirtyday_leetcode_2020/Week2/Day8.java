package april_thirtyday_leetcode_2020.Week2;

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
        ListNode l6 = new ListNode(6);
        l1.next = l2; l2.next = l3; l3.next = l4; l4.next = l5;
        //l5.next = l6;
        System.out.print("Original: ");
        printNode(l1);
        ListNode result = alt2(l1);
        System.out.print("\nMiddle Splitted: ");
        printNode(result);
    }

    // fastCounter goes by += 2 and slowCounter is ++;
    public static ListNode middleNode(ListNode head) {
        ListNode slowCounter = head;
        ListNode fastCounter = head;
        while(fastCounter != null && fastCounter.next != null) {
            slowCounter = slowCounter.next;
            fastCounter = fastCounter.next.next;
        }
        return slowCounter;
    }

    // update pointer only when counter is even
    public static ListNode alt2(ListNode head) {
        ListNode result = head;
        int counter = 0;

        while(head != null) {
            counter++;
            if(counter % 2 == 0) {
                result = result.next;
            }
            head = head.next;
        }
        return result;
    }

    // Iterate through list to get length, then iterate again div by 2.
    public static ListNode alt1(ListNode head) {
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
