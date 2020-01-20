package com.jabbslad._590;

import java.util.Deque;
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

    public List<Integer> postorder(Node root) {
        LinkedList<Integer> result = new LinkedList<>();
        Deque<Node> stack = new LinkedList<>();
        stack.add(root);

        while (!stack.isEmpty()) {
            int size = stack.size();
            for (int i = 0; i < size; i++) {
                Node curr = stack.poll();
                result.addFirst(curr.val);
                for (Node child : curr.children)
                    stack.push(child);
            }
        }
        return result;
    }
}
