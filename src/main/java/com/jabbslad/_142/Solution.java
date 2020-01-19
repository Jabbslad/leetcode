package com.jabbslad._142;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class Solution {

    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        ListNode intersect = null;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                intersect = slow;
                break;
            }
        }

        if (intersect == null)
            return null;

        slow = head;
        fast = intersect;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode result = solution.detectCycle(new ListNode(1));

        assert null == result;
    }
}
