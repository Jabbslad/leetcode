package com.jabbslad._589;

import java.util.LinkedList;
import java.util.List;

class Node {
    public int val;
    public List<Node> children;

    public Node() {
    }

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}

public class Solution {

    private List<Integer> preorder(Node root, List<Integer> result) {
        if (root == null)
            return result;

        result.add(root.val);
        for (Node child : root.children)
            preorder(child, result);

        return result;
    }

    public List<Integer> preorder(Node root) {
        List<Integer> result = new LinkedList<>();
        preorder(root, result);
        return result;
    }
}
