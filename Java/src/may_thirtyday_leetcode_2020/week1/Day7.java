package may_thirtyday_leetcode_2020.week1;

// equivalent to Leetcode993
public class Day7 {

    static TreeNode parentX = null;
    static TreeNode parentY = null;
    static int depthX = -1, depthY = -1;

    public static class TreeNode {
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
        TreeNode root = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        root.left.right = new TreeNode(4);
        root.right.right = new TreeNode(5);
        System.out.println(isCousins(root, 4, 5));
        System.out.println(isCousins(root, 1,3));
    }

    public static boolean isCousins(TreeNode root, int x, int y) {
        dfs(root, null, x, y, 0);
        return (depthX == depthY) && (parentX != parentY);
    }

    public static void dfs(TreeNode root, TreeNode parent, int x, int y, int depth) {
        if(root == null) return;
        if(x == root.val) {
            parentX = parent;
            depthX = depth;
        } else if(y == root.val) {
            parentY = parent;
            depthY = depth;
        } else {
            dfs(root.left, root, x, y, depth+1);
            dfs(root.right, root, x, y, depth+1);
        }
    }
}
