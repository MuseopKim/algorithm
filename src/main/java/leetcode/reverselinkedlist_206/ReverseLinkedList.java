package leetcode.reverselinkedlist_206;

/**
 * https://leetcode.com/problems/reverse-linked-list
 */
public class ReverseLinkedList {

    public ListNode reverseList(ListNode head) {
        ListNode node = head;
        ListNode prev = null;

        while (node != null) {
            ListNode next = node.next;
            node.next = prev;
            prev = node;
            node = next;
        }

        return prev;
    }

    private static class ListNode {

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
