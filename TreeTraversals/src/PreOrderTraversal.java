public class PreOrderTraversal {
    public static void preorder(TreeNode root) {
        if (root == null) return;

        System.out.println(root.data + " ");

        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.right.right = new TreeNode(5);

        preorder(root);
    }
}