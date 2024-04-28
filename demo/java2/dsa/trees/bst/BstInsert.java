package demo.java2.dsa.trees.bst;

import demo.java2.dsa.trees.bt.BinaryNode;
import demo.java2.dsa.trees.bt.DataSample;

public class BstInsert {

    public static void insert(BinaryNode parent, BinaryNode node, int value) {
        if (node == null) {
            BinaryNode newNode = new BinaryNode(value);
            if (value < parent.value) {
                parent.left = newNode;
            } else {
                parent.right = newNode;
            }
            return;
        }
        if (value <= node.value) {
            BstInsert.insert(node, node.left, value);
        }
        if (value > node.value) {
            BstInsert.insert(node, node.right, value);
        }
    }

    public static void add(BinaryNode root, int value) {
        BstInsert.insert(null, root, value);
    }

    public static void main(String[] args) {
        BinaryNode bst = DataSample.getExampleBinarySearchTree();
        BstInsert.add(bst, 17);
        BstInsert.add(bst, 18);
        BstInsert.add(bst, 100);
        BstInsert.add(bst, 28);
    }
}
