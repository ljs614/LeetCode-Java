package com.ljs.prob;

public class ReverseInteger {
	public int reverse(int x) {
		String s = String.valueOf(x);
		int result = 1;
		if(s.charAt(0)=='-') {
			result = -1;
			s = s.substring(1);
		}
		String temp = "";
		for(int i=s.length()-1; i>=0; i--) {
			temp+=s.charAt(i)+"";
		}
		
		try {			
			result *= Integer.parseInt(temp);
		}catch(Exception e) {	
			result = 0;
		}
		
		return result;
	}
}
