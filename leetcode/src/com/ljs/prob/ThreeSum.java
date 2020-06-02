package com.ljs.prob;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSum {
	public List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> ans = new ArrayList<List<Integer>>();
		if(nums.length<3) {
			return ans;
		}
		Set<Integer> dupl = new HashSet<>();
		Arrays.sort(nums);
		for(int i=0; i<nums.length; i++) {
			if(!dupl.contains(nums[i])) {
				List<Integer> list = twoSum(nums, i);
				int x = nums[i];
				for(int j=0; j<list.size();) {
					int y = list.get(j++);
					int z = list.get(j++);
					List<Integer> temp = new ArrayList<>();
					temp.add(x);
					temp.add(y);
					temp.add(z);
					ans.add(temp);
					for(int n : temp) {
						System.out.print(n+" ");
					}
					System.out.println();
					
				}
			}
			dupl.add(nums[i]);
			
		}
		
		return ans;
	}
	
	public List<Integer> twoSum(int[] nums, int n) {
		List<Integer> list = new ArrayList<>();
		Set<Integer> set = new HashSet<>();
		for(int i=n+1; i<nums.length; i++) {
			int y=nums[i];
			int z = -(nums[n]+y);
			boolean isDupl = false;
			if(set.contains(z)) {
				if(z>y) {
					int temp = y;
					y=z;
					z=temp;
				}
				for(int j=0; j<list.size();) {
					if(y==list.get(j) && z==list.get(j+1)) {
						isDupl = true;
						break;
					}
				j+=2;
				}
				if(!isDupl) {				
					list.add(y);
					list.add(z);
				}
			}
			set.add(nums[i]);
			
		}
		return list;
	}
}
