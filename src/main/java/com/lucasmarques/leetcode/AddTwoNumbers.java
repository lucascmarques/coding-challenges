package com.lucasmarques.leetcode;

import lombok.Data;

/**
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
 *
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 *
 *
 *
 * Example 1:
 *
 *
 * Input: l1 = [2,4,3], l2 = [5,6,4]
 * Output: [7,0,8]
 * Explanation: 342 + 465 = 807.
 * Example 2:
 *
 * Input: l1 = [0], l2 = [0]
 * Output: [0]
 * Example 3:
 *
 * Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
 * Output: [8,9,9,9,0,0,0,1]
 *
 * Refer to <a href="https://leetcode.com/problems/add-two-numbers/">Add Two Numbers</a>
 */
public class AddTwoNumbers {

    @Data
    private static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode dummy = new ListNode(0);

        ListNode pointerSum = dummy;
        ListNode pointerL1 = l1;
        ListNode pointerL2 = l2;
        int addition = 0;

        while (pointerL1 != null || pointerL2 != null || addition != 0) {
            int sum = addition;
            if (pointerL1 != null) {
                sum += pointerL1.val;
                pointerL1 = pointerL1.next;
            }
            if (pointerL2 != null) {
                sum += pointerL2.val;
                pointerL2 = pointerL2.next;
            }
            addition = sum / 10;
            pointerSum.next = new ListNode(sum % 10);
            pointerSum = pointerSum.next;
        }

        return dummy.next;

    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));
        System.out.println(addTwoNumbers(l1, l2));
    }

}
