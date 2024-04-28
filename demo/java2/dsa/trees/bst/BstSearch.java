package demo.java2.dsa.trees.bst;

import demo.java2.dsa.trees.bt.BinaryNode;
import demo.java2.dsa.trees.bt.DataSample;

public class BstSearch {

    public static boolean find(BinaryNode node, int value) {
        if (node == null) {
            return false;
        }
        if (node.value == value) {
            return true;
        }
        if (value > node.value) {
            return find(node.right, value);
        }
        if (value < node.value) {
            return find(node.left, value);
        }
        // Not Possible
        return false;
    }

    public static boolean search(BinaryNode root, int value) {
        return BstSearch.find(root, value);
    }

    public static void main(String[] args) {
        BinaryNode bst = DataSample.getExampleBinarySearchTree();
        System.out.println(BstSearch.search(bst, 12));
        System.out.println(BstSearch.search(bst, 21));
    }
}
