package com.ljs.main;

import com.ljs.etc.E1;
import com.ljs.prob.MaxArea;
import com.ljs.prob.MyAtoI;
import com.ljs.prob.ReverseInteger;
import com.ljs.prob.ZigzagConversion;

public class Main {
	public static void main(String[] args) {
		MaxArea m = new MaxArea();
		int[] arr = {1,8,6,2,5,4,8,3,7};
		System.out.println(m.maxArea(arr));
	}
}

