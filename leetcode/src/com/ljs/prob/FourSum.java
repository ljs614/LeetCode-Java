package com.ljs.prob;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
	public List<List<Integer>> fourSum(int[] nums, int target) {
		List<List<Integer>> ans = new ArrayList<List<Integer>>();
		if(nums.length<4) {
			return ans;
		}
		Arrays.sort(nums);
		for(int i=0; i<nums.length-3; i++) {
			if(i>0 && nums[i-1]==nums[i]) {
				continue;
			}
			for(int j=i+1; j<nums.length-2; j++){
				if(j>i+1 && nums[j-1]==nums[j]) {
					continue;
				}
				int x=j+1;
				int y=nums.length-1;
				while(x<y) {
					int t = nums[x]+nums[y];
					if(nums[i]+nums[j]+t==target) {
						ans.add(Arrays.asList(nums[i], nums[j], nums[x], nums[y]));
						while(x<y && nums[x]==nums[x+1]) {x++;}
						x++;
					}else if(nums[i]+nums[j]+t<target) {
						while(x<y && nums[x]==nums[x+1]) {x++;}
						x++;
					}else {
						while(x<y && nums[y-1]==nums[y]) {y--;}
						y--;
					}
				}
			}
		}
		return ans;
	}
}
