package com.ljs.etc;

public class E1 {
// 재귀라는데 ....
//	input 3
//	output 123
//	       132
//	       213
//	       231
//	       312
//	       321
	
	
	public void solution(int n) {
		
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i]=i+1;
		}
		
		for(int i=0; i<n; i++) {
			String[] strArr = permutation(i+1, arr);
			for(String s : strArr) {
				System.out.println(arr[i]+s);
			}
		}
		
	}
	
	public String[] permutation(int n, int[] arr){
		int LEN = arr.length;
		String[] strArr = new String[LEN-1];
		int[] temp = new int[LEN-1];
		int index = 0;
		for(int i=0; i<LEN; i++) {
			if(i+1 != n) {
				temp[index++] = arr[i];
			}
		}
		for(int i = 0; i<temp.length; i++) {
		}
		return strArr;
	}
	
}
