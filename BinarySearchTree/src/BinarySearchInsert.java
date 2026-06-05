class TreeNode {
    int data;
    TreeNode left, right;

    TreeNode(int data) {
        this.data = data;
    }
}

public class BinarySearchInsert {
    public static TreeNode insert(TreeNode root, int value) {
        if (root == null) {
            return new TreeNode(value);
        }

        if (value < root.data) {
            root.left = insert(root.left, value);
        } else {
            root.right = insert(root.right, value);
        }

        return root;
    }

    public static void inorder(TreeNode root) {
        if (root == null) return;

        inorder(root.left);
        System.out.println(root.data + " ");
        inorder(root.right);
    }

    public static boolean search(TreeNode root, int key) {
        if (root == null) return false;

        if (key == root.data) return true;

        if (key < root.data) {
            return search(root.left, key);
        } else {
            return search(root.right, key);
        }
    }

    public static void main(String[] args) {
        int[] values = {10, 5, 15, 2, 7, 20};

        TreeNode root = null;

        for (int val: values) {
            root = insert(root, val);
        }

        System.out.println("Inorder Traversal");
        inorder(root);

        System.out.println(search(root, 15));
        System.out.println(search(root, 17));
    }
}