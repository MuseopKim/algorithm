package leetcode.palindromelinkedlist_234;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * https://leetcode.com/problems/palindrome-linked-list
 * <p>
 * Definition for singly-linked list. public class ListNode { int val; ListNode next; ListNode() {} ListNode(int val) { this.val =
 * val; } ListNode(int val, ListNode next) { this.val = val; this.next = next; } }
 */
public class PalindromeLinkedList {

    public boolean isPalindrome(ListNode head) {
        List<Integer> values = new ArrayList<>();

        ListNode node = head;
        while (node != null) {
            values.add(node.val);
            node = node.next;
        }

        int left = 0;
        int right = values.size() - 1;

        while (left < right) {
            if (values.get(left) != values.get(right)) {
                return false;
            }

            left += 1;
            right -= 1;
        }

        return true;
    }

    public boolean deque(ListNode head) {
        Deque<Integer> deque = new LinkedList<>();

        ListNode node = head;
        while (node != null) {
            deque.add(node.val);
            node = node.next;
        }

        // 홀수인 경우도 함께 고려
        while (!deque.isEmpty() && deque.size() > 1) {
            if (deque.pollFirst() != deque.pollLast()) {
                return false;
            }
        }

        return true;
    }

    private class ListNode {

        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
