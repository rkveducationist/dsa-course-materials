class TreeNode {
    int data;
    TreeNode left, right;

    TreeNode(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}

public class PostOrderTraversal {
    public static void postorder(TreeNode root) {
        if (root == null) return;

        postorder(root.left);
        postorder(root.right);

        System.out.println(root.data + " ");
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.right.right = new TreeNode(5);

        postorder(root);
    }
}