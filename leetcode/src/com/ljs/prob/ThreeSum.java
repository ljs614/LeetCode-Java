package com.ljs.prob;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSum {
	//	public List<List<Integer>> threeSum(int[] nums) {
	//		List<List<Integer>> ans = new ArrayList<List<Integer>>();
	//		if(nums.length<3) {
	//			return ans;
	//		}
	//		Set<Integer> dupl = new HashSet<>();
	//		Arrays.sort(nums);
	//		for(int i=0; i<nums.length; i++) {
	//			if(!dupl.contains(nums[i])) {
	//				List<Integer> list = twoSum(nums, i);
	//				int x = nums[i];
	//				for(int j=0; j<list.size();) {
	//					int y = list.get(j++);
	//					int z = list.get(j++);
	//					List<Integer> temp = new ArrayList<>();
	//					temp.add(x);
	//					temp.add(y);
	//					temp.add(z);
	//					ans.add(temp);
	//					for(int n : temp) {
	//						System.out.print(n+" ");
	//					}
	//					System.out.println();
	//					
	//				}
	//			}
	//			dupl.add(nums[i]);
	//			
	//		}
	//		
	//		
	//		for(int i=0; i<nums.length; i++) {
	//			if(i>0 && nums[i-1]==nums[i]) {
	//				continue;
	//			}
	//		}
	//		
	//		
	//		
	//		
	//		
	//		
	//		return ans;
	//	}

	public List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> ans = new ArrayList<List<Integer>>();
		if(nums.length<3) {
			return ans;
		}
		Arrays.sort(nums);
		for(int i=0; i<nums.length-2; i++) {
			if(i>0 && nums[i-1]==nums[i]) {
				continue;
			}
			if(nums[i]>0) {
				return ans;
			}
			int j=i+1;
			int k=nums.length-1;
			while(j<k) {
				int t = nums[j]+nums[k];
				if(nums[i]+t==0) {
					ans.add(Arrays.asList(nums[i], nums[j], nums[k]));
					System.out.println(nums[i]+","+nums[j]+","+nums[k]);
					while(j<k && nums[j]==nums[j+1]) {j++;}
					j++;
				}else if(nums[i]+t<0) {
					while(j<k && nums[j]==nums[j+1]) {j++;}
					j++;
				}else {
					while(j<k && nums[k-1]==nums[k]) {k--;}
					k--;
				}
			}
			
		}


		return ans;
	}




	public void twoSum(int[] nums, int n, List<List<Integer>> ans) {
		int i=n+1;
		int j=nums.length-1;
		while(i<j) {
			int k = nums[i]+nums[j];
			if(nums[n]+k==0) {
				ans.add(Arrays.asList(nums[n], nums[i], nums[j]));
				System.out.println(nums[n]+","+nums[i]+","+nums[j]);
				while(nums[i]==nums[i+1]) {i++;}
				i++;
			}else if(nums[n]+k<0) {
				while(nums[i]==nums[i+1]) {i++;}
				i++;
			}else {
				while(nums[j-1]==nums[j]) {j--;}
				j--;
			}
		}
	}
}
