package may_thirtyday_leetcode_2020.week4;

// equiv to LeetCode1008
public class Day24 {

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
        TreeNode r1 = bstFromPreorder(new int[] {8,5,1,7,10,12});
        // should output 8, 5, 1, 7, 10, 12
        printTree(r1);
    }

    public static void printTree(TreeNode node) {
        if(node == null) return;
        System.out.print(node.val + ", ");
        printTree(node.left);
        printTree(node.right);
    }

    public static TreeNode bstFromPreorder(int[] preorder) {
        // why does this helper1 not work, change of params is annoying
        // return helper(preorder, 0, Integer.MAX_VALUE);
        return helper2(preorder, Integer.MAX_VALUE);
    }

    public static TreeNode helper(int[] arr, int i, int rootVal) {
        if(i >= arr.length || arr[i] > rootVal) {
            return null;
        }
        TreeNode root = new TreeNode(arr[i]);
        i+=1;
        root.left = helper(arr, i, root.val);
        root.right = helper(arr, i, rootVal);
        return root;
    }

    static int i = 0;
    public static TreeNode helper2(int[] A, int bound) {
        if (i == A.length || A[i] > bound) return null;
        TreeNode root = new TreeNode(A[i++]);
        root.left = helper2(A, root.val);
        root.right = helper2(A, bound);
        return root;
    }

}
