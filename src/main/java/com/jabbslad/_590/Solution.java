package com.jabbslad._590;

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
};

public class Solution {
    public void postorder(Node root, List<Integer> result) {
        if (root == null)
            return;

        for (Node child : root.children)
            postorder(child, result);

        result.add(root.val);
    }


    public List<Integer> postorder(Node root) {
        List<Integer> result = new LinkedList<>();
        postorder(root, result);
        return result;
    }
}
