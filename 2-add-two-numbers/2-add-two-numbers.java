/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
         ListNode head = new ListNode(0, l1);

		int carry = 0;
		boolean toggle = false;
		while (l1 != null) {
			int sum = 0;
			if (toggle) {
				sum = l1.val + carry;
			} else {
				sum = l1.val + l2.val + carry;
			}

			carry = sum / 10;
			sum %= 10;

			l1.val = sum;

			if (l1.next == null && l2.next != null && !toggle) {
				l1.next = l2.next;
				toggle = true;
			} else if (l1.next != null && l2.next == null && !toggle) {
				toggle = true;
			} else if (l1.next == null && carry > 0) {
				l1.next = new ListNode();
				toggle = true;
			}

			if (!toggle) {
				l2 = l2.next;
			}
			l1 = l1.next;
		}

		return head.next;
    }
}
