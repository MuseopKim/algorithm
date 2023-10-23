package leetcode.addtwonumbers_2;

import java.math.BigInteger;

/**
 * https://leetcode.com/problems/add-two-numbers
 */
public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode reversed1 = reverseList(l1);
        ListNode reversed2 = reverseList(l2);

        BigInteger number1 = convertListToInteger(reversed1);
        BigInteger number2 = convertListToInteger(reversed2);
        BigInteger sum = number1.add(number2);

        return convertIntegerToReversedList(sum);
    }

    private ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode node = head;

        while (node != null) {
            ListNode next = node.next;
            node.next = prev;
            prev = node;
            node = next;
        }

        return prev;
    }

    private BigInteger convertListToInteger(ListNode node) {
        StringBuilder builder = new StringBuilder();

        while (node != null) {
            builder.append(node.val);
            node = node.next;
        }

        return new BigInteger(builder.toString());
    }

    private ListNode convertIntegerToReversedList(BigInteger value) {
        ListNode prev = null;
        ListNode node = null;

        for (char number : String.valueOf(value).toCharArray()) {
            node = new ListNode(Character.getNumericValue(number));
            node.next = prev;
            prev = node;
        }

        return node;
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
