package may_thirtyday_leetcode_2020.week3;

import java.util.ArrayList;
import java.util.List;

// equiv to LeetCode230
public class Day20 {

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
        TreeNode root = new TreeNode(3, new TreeNode(1), new TreeNode(4));
        root.left.right = new TreeNode(2);

        TreeNode a = new TreeNode(5, null, new TreeNode(6));
        a.left = new TreeNode(3, new TreeNode(2), new TreeNode(4));
        a.left.left.left = new TreeNode(1);

        System.out.println(kthSmallest(root, 2));
        System.out.println(kthSmallest(a, 3));
    }

    public static int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        goLeft(root, list);
        return list.get(k-1);
    }

    public static void goLeft(TreeNode root, ArrayList<Integer> list) {
        if(root == null) {
            return;
        }
        goLeft(root.left, list);
        list.add(root.val);
        goLeft(root.right, list);
    }

}
