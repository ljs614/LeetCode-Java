package com.ljs.prob;

import com.leetcode.construct.ListNode;

public class AddTwoNumbers {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode ans = new ListNode();
		ListNode temp = ans;
		int sum = 0;
		int carry = 0;
		while(l1 !=null || l2 !=null) {
			if(l1 != null) {
				sum+=l1.val;
				l1 = l1.next;
			}
			if(l2 != null) {
				sum+=l2.val;
				l2 = l2.next;
			}
			temp.next = new ListNode(sum%10);
			temp = temp.next;
			carry = sum/10;
			sum = carry;
		}
		if(carry == 1) {
			temp.next = new ListNode(1);
		}
		return ans.next;
	}
}
