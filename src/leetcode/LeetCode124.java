package leetcode;

import thirtyday_leetcode_2020.Week5.Day29;

public class LeetCode124 {

    static int max = Integer.MIN_VALUE;

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static void main(String[] args) {
        TreeNode a1 = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        System.out.println(maxPathSum(a1));

        TreeNode b1 = new TreeNode(-10, new TreeNode(9), new TreeNode(20));
        b1.right.left = new TreeNode(15);
        b1.right.right = new TreeNode(7);
        System.out.println(maxPathSum(b1));

        TreeNode c1 = new TreeNode(1, new TreeNode(-100), new TreeNode(3));
        c1.right.left = new TreeNode(-15);
        c1.right.right = new TreeNode(-7);
        c1.left.left = new TreeNode((150));
        System.out.println(maxPathSum(c1));
    }

    public static int maxPathSum(TreeNode root) {
        recursive(root);
        return max;
    }

    public static int recursive(TreeNode node) {
        if(node == null) return 0;
        int left = Math.max(0, recursive(node.left));
        int right = Math.max(0, recursive(node.right));
        max = Math.max(max, left + right + node.val);
        return Math.max(left, right) + node.val;
    }
}
