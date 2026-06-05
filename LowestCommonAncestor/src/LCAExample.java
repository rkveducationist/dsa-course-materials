class TreeNode {
    int data;
    TreeNode left, right;

    TreeNode(int data) {
        this.data = data;
    }
}

public class LCAExample {
    public static TreeNode findLCA(TreeNode root, int p, int q) {
        if (root == null) return null;

        if (root.data == p || root.data == q) {
            return root;
        }

        TreeNode left = findLCA(root.left, p, q);
        TreeNode right = findLCA(root.right, p, q);

        if (left != null && right != null) {
            return root;
        }

        return (left != null) ? left : right;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        TreeNode lca = findLCA(root, 5, 4);
        System.out.println("LCA: " + lca.data);
    }
}