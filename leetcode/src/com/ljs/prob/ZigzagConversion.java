package com.ljs.prob;

public class ZigzagConversion {
	public String convert(String s, int numRows) {
		String[] temp = new String[numRows];
		int index = 0;
		int step = 1;
		for(int i=0; i<s.length(); i++) {
			if(temp[index] == null) {
				temp[index] = "";
			}
			temp[index]+=s.charAt(i)+"";
			if(index == numRows-1) {
				step = -1;
			} else if (index ==0) {
				step = 1;
			}
			index += step;
		}
		
		String ans = "";
		for(String str : temp) {
			if(str != null) {
				ans+=str;
			}
		}
		return ans;
	}
}


