package com.ljs.prob;

import java.util.Arrays;

public class ThreeSumClosest {
    public int threeSumClosest(int[] nums, int target) {
        int ans = 1000000;
		Arrays.sort(nums);
		for(int i=0; i<nums.length-2; i++) {
			int j=i+1;
			int k=nums.length-1;
			while(j<k) {
				int t = nums[i]+nums[j]+nums[k];
				if(Math.abs(t-target)<Math.abs(ans-target)) {
					ans = t;
				}
                if(t-target<0){
                    j++;
                }else{
                    k--;
                }
			}
		}
    	return ans;
    }
}