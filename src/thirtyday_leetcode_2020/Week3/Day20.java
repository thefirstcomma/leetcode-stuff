package thirtyday_leetcode_2020.Week3;

// equivalent to LeetCode1008
public class Day20 {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            val = x;
        }
    }

    public static void main(String[] args) {
        int[] nums = {8,5,1,7,10,12};
        TreeNode as = bstFromPreorder(nums);
        printPre(as);
    }

    public static void printPre(TreeNode tn) {
        if(tn == null) return;
        System.out.print(tn.val + ", ");
        printPre(tn.left);
        printPre(tn.right);
    }

    public static TreeNode bstFromPreorder(int[] preorder) {
        if(preorder.length == 0) return null;
        TreeNode root = new TreeNode(preorder[0]);
        TreeNode head = root;

        for (int i = 1; i < preorder.length; i++) {
            head = root;
            while(true) {
                if(head.val > preorder[i]) {
                    if(head.left == null) {
                        head.left = new TreeNode(preorder[i]);
                        break;
                    } else {
                        head = head.left;
                    }
                } else {
                    if(head.right == null) {
                        head.right = new TreeNode(preorder[i]);
                        break;
                    } else {
                        head = head.right;
                    }
                }
            }
        }
        return root;
    }
}
