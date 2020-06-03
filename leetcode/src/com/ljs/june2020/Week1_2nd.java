package com.ljs.june2020;

import com.leetcode.construct.ListNode;

public class Week1_2nd {
    public void deleteNode(ListNode node) {
        	node.val = node.next.val;
        	node.next = node.next.next;
        
    }
}
