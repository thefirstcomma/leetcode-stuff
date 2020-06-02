package leetcode;

public class LeetCode226 {

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
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2, new TreeNode(1), new TreeNode(3));
        root.right = new TreeNode(7, new TreeNode(6), new TreeNode(9));
        print(root);
        TreeNode result = invertTree(root);
        print(result);
    }

    public static TreeNode invertTree(TreeNode root) {
        if(root == null)
            return null;

        TreeNode tempLeft = root.left, tempRight = root.right;

        root.left = invertTree(tempRight);
        root.right = invertTree(tempLeft);
        return root;
    }

    public static void print(TreeNode root) {
        if(root == null) return;

        print(root.left);
        System.out.print(root.val + ", ");
        print(root.right);
    }
}
