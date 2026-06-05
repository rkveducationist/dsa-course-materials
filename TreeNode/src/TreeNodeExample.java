class TreeNode {
    int data;
    TreeNode left, right;

    TreeNode(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}

public class TreeNodeExample {
    public static void main(String[] args) {
        // create nodes
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(20);
        root.right = new TreeNode(30);

        root.left.left = new TreeNode(40);
        root.right.right = new TreeNode(50);

        System.out.println("Root: " + root.data);
        System.out.println("Left Child: " + root.left.data);
        System.out.println("Right Child: " + root.right.data);
    }
}