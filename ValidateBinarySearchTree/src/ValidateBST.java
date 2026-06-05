class TreeNode {
    int data;
    TreeNode left, right;

    TreeNode(int data) {
        this.data = data;
    }
}

public class ValidateBST {
    public static boolean isValidBST(TreeNode root, long min, long max) {
        if (root == null) return true;

        if (root.data <= min || root.data >= max) {
            return false;
        }

        return isValidBST(root.left, min, root.data) && isValidBST(root.right, root.data, max);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(15);

        root.right.left = new TreeNode(6);

        boolean result = isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
        System.out.println("isValidBST: " + result);
    }
}