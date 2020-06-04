package com.ljs.june2020;

import java.util.Arrays;
import java.util.Comparator;

public class Week1_3rd {
	public int twoCitySchedCost(int[][] costs) {
		int ans = 0;
		int[][] arr = new int[costs.length][2];
		for(int i=0; i<costs.length; i++) {
			arr[i][0] = i;
			arr[i][1] = costs[i][0]-costs[i][1];
		}
		Arrays.sort(arr, Comparator.comparingInt(o1 -> o1[1]));
		int index = 0;
		for(int i=0; i<arr.length; i++) {
			if(i >= arr.length/2) {
				index = 1;
			}
			if(index == 0 && arr[i][1]==arr[i+1][1] && i+1 == arr.length/2 && costs[arr[i][0]][0]>costs[arr[i+1][0]][0]) {
				int[] temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
			}
			ans += costs[arr[i][0]][index];
			
		}

		return ans;
	}


}
