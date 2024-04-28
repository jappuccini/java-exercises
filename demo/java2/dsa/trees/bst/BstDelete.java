package demo.java2.dsa.trees.bst;

import demo.java2.dsa.trees.bt.BinaryNode;
import demo.java2.dsa.trees.bt.DataSample;

public class BstDelete {

    public static void delete(BinaryNode parent, BinaryNode node, int value) {
        if (node == null) {
            return;
        }
        if (node.value == value) {
            // Base Cases
            // 1. No child
            if (node.left == null && node.right == null) {
                if (parent.left == node) {
                    parent.left = null;
                }
                if (parent.right == node) {
                    parent.right = null;
                }
            }

            // 2. only left child
            if (node.left != null && node.right == null) {
                if (parent.left == node) {
                    parent.left = node.left;
                }
                if (parent.right == node) {
                    parent.right = node.left;
                }
            }
            // 3. only right child
            if (node.left == null && node.right != null) {
                if (parent.left == node) {
                    parent.left = node.right;
                }
                if (parent.right == node) {
                    parent.right = node.right;
                }
            }

            // 4. both childs
            if (node.left != null && node.right != null) {
                /*
                 * Here we have two options.
                 * 
                 * Replace the current node with the
                 * largest element on the small side.
                 * (go left of current node and then go as
                 * far as possible right) if we reach the
                 * largest element on the small side
                 * there are again two base cases
                 * no childs or one child on the left side
                 * this is the same as before
                 * 
                 * Replace the current node with the
                 * smallest element on the large side.
                 * (go right of current node and the go as
                 * far as possible left) if we reach the
                 * smallest element on the large side
                 * there are again two base cases
                 * no childs or one child on the right side
                 * this is the same as before
                 * 
                 * There is only on question left.
                 * Which one do we take?
                 * The side with the bigger height.
                 * Because a tree get's more and more
                 * balanced if we remove from a high
                 * side of two nodes. This can be
                 * achieved with a calculated height
                 * of the current node. But it is out of
                 * scope of this course.
                 */
                /*
                 * We decide to implement the first case.
                 * We search the largest element on the
                 * small side.
                 */
                BinaryNode largest = BstDelete.findLargest(node, node.left);
                if (parent == null) { // In case we need to delte the root node
                    largest.left = node.left;
                    largest.right = node.right;
                    node.left = null;
                    node.right = null;
                } else {
                    if (parent.left == node) {
                        parent.left = largest;
                    }
                    if (parent.right == node) {
                        parent.right = largest;
                    }
                }

            }
        }
        if (value > node.value) {
            delete(node, node.right, value);
        }
        if (value <= node.value) {
            delete(node, node.left, value);
        }

    }

    public static void remove(BinaryNode root, int value) {
        BstDelete.delete(null, root, value);
    }

    public static BinaryNode findLargest(BinaryNode parent, BinaryNode node) {
        // Base Case
        // 1. We found the largest node
        if (node.right == null) {
            if (node.left == null) {
                parent.right = null;
                return node;
            }
            if (node.left != null) {
                parent.right = node.left;
                return node;
            }

        }
        return findLargest(node, node.right);
    }

    public static void main(String[] args) {
        BinaryNode bst = DataSample.getExampleBinarySearchTree();
        // BstDelete.remove(bst, 50);
        // BstDelete.remove(bst, 17);
    }
}
