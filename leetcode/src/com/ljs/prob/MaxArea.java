package com.ljs.prob;

public class MaxArea {

    public int maxArea(int[] height) {
        int max = 0;
        int j = height.length-1;
        for(int i=0; i<j;) {
        	int h = 0;
        	int w = j-i;
        	if(height[i]<height[j]) {
        		h = height[i];
        		i++;
        	}else {
        		h = height[j];
        		j--;
        	}
        	int area = h * w;
        	if(max<area) {
        		max = area;
        	}
        }
    	return max;
    }
}
