package demo.java2.dsa.trees.bt.dfs;

import demo.java2.dsa.trees.bt.BinaryNode;
import demo.java2.dsa.trees.bt.DataSample;

public class BTPreOrder {

    public static void main(String[] args) {
        BTPreOrder.traverse(DataSample.getExampleBinaryTree());
    }

    public static void traverse(BinaryNode root) {
        walk(root);
        System.out.println();
    }

    public static void walk(BinaryNode node) {
        if (node == null) {
            return;
        }
        System.out.print(node.value + " ");
        walk(node.left);
        walk(node.right);
    }
}