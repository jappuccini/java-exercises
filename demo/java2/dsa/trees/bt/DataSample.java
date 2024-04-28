package demo.java2.dsa.trees.bt;

public class DataSample {
    public static BinaryNode getExampleBinaryTree() {
        BinaryNode root = new BinaryNode(7);
        root.left = new BinaryNode(23);
        root.left.left = new BinaryNode(5);
        root.left.right = new BinaryNode(4);
        root.right = new BinaryNode(3);
        root.right.left = new BinaryNode(18);
        root.right.right = new BinaryNode(21);
        return root;
    }

    public static BinaryNode getExampleBinarySearchTree() {
        BinaryNode root = new BinaryNode(17);
        root.left = new BinaryNode(15);
        root.left.left = new BinaryNode(4);
        root.left.right = new BinaryNode(16);
        root.right = new BinaryNode(50);
        root.right.left = new BinaryNode(25);
        root.right.left.left = new BinaryNode(21); // 18-25
        root.right.left.right = new BinaryNode(30); // 26 - 50
        return root;
    }
}
