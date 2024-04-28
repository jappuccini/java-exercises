package demo.java2.dsa.trees.bt.bfs;

import demo.java2.dsa.trees.bt.BinaryNode;
import demo.java2.dsa.trees.bt.DataSample;

public class BTBFS {

    public static void main(String[] args) {
        BTBFS.traverse(DataSample.getExampleBinaryTree());
    }

    public static void traverse(BinaryNode root) {
        BinaryNodeQueue q = new BinaryNodeQueue();
        q.enque(root);
        while (!q.isEmpty()) {
            BinaryNode currentNode = q.dequeue();
            System.out.print(currentNode.value + " ");
            if (currentNode.left != null) {
                q.enque(currentNode.left);
            }
            if (currentNode.right != null) {
                q.enque(currentNode.right);
            }
        }
    }
}