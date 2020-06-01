package com.ljs.june2020;

import com.leetcode.construct.TreeNode;

public class Week1_1st {
    public TreeNode invertTree(TreeNode root) {
        if(root.left != null) {
        	invertChild(root);
        	invertTree(root.right);
        	invertTree(root.left);
        }
    	return root;
    }
    
    public void invertChild(TreeNode parent) {
    	TreeNode temp = parent.left;
    	parent.left = parent.right;
    	parent.right = temp;
    }
}
