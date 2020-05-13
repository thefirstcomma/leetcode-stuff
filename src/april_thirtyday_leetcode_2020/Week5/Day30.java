package april_thirtyday_leetcode_2020.Week5;

public class Day30 {

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
        TreeNode a1 = new TreeNode(0, new TreeNode(1), new TreeNode(0));
        TreeNode a2 = new TreeNode(1, new TreeNode(0), new TreeNode(0));
        a1.right.left = new TreeNode(0);
        a1.left.right = a2;
        a1.left.left  = new TreeNode(0, null, new TreeNode(1));
        System.out.println(isValidSequence(a1, new int[] {0,1,0,1}));
        System.out.println(isValidSequence(a1, new int[] {0,0,1}));
        System.out.println(isValidSequence(a1, new int[] {0,1,1}));
    }

    public static boolean isValidSequence(TreeNode root, int[] arr) {
        return dpsPreorder(root, arr, 0);
    }

    public static boolean dpsPreorder(TreeNode node, int[] arr, int index) {
        if(node == null || index >= arr.length)
            return false;
        else if(node.val == arr[index] && index == arr.length-1)
            return (node.left == null && node.right == null);

        return (node.val == arr[index] &&
                (dpsPreorder(node.left, arr, index+1) || dpsPreorder(node.right, arr, index+1)));
    }
}
