package com.jabbslad._965;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class Solution {
    
    private boolean isUnivalTree(TreeNode root, int val) {
        if (root == null)
            return true;

        if (root.val != val)
            return false;

        return isUnivalTree(root.left, val) && isUnivalTree(root.right, val);
    }

    public boolean isUnivalTree(TreeNode root) {
        return isUnivalTree(root, root.val);
    }
}
