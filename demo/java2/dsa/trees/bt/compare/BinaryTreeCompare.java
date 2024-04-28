package demo.java2.dsa.trees.bt.compare;

import demo.java2.dsa.trees.bt.BinaryNode;

public class BinaryTreeCompare {

    public static boolean compare(BinaryNode a, BinaryNode b) {
        if (a == null && b == null) {
            /*
             * If both nodes don't have a value
             * they are equal in shape and 'value'
             */
            return true;
        }

        if (a == null || b == null) {
            /*
             * This is not possible:
             * a = null, b = null
             * because of the first check!
             * 
             * We check if one value is null.
             * This means we are in one of the
             * following states:
             * a = null , b = BinaryNode
             * a = BinaryNode, b = null
             * 
             * If we hit this condition, we
             * are not equal in shape
             */
            return false;
        }

        if (a.value != b.value) {
            /*
             * This is not possible:
             * a = null, b = null
             * because of the first check!
             * 
             * This is not possible:
             * a = null , b = BinaryNode
             * a = BinaryNode, b = null
             * because of the second check!
             * 
             * If we hit this condition, we
             * are equal in shape, but we need
             * to check if we are equal in value.
             * We are in this state:
             * a = BinaryNode, b = BinaryNode
             */
            return false;
        }
        /*
         * We compare the result of the left and right sub tree.
         * Only if both are equal we continue.
         */
        return BinaryTreeCompare.compare(a.left, b.left) &&
                BinaryTreeCompare.compare(a.right, b.right);
    }
}
