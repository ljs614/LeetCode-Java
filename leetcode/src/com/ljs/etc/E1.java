package com.ljs.etc;

import java.util.*;

public class E1 {
	// 재귀라는데 ....
	//	input 3
	//	output 123
	//	       132
	//	       213
	//	       231
	//	       312
	//	       321
	public void solution(int num) {

		int[] arr= new int[num];
		for(int i=0; i<num; i++){
			arr[i]=i+1;
		}
		List<String> list = permutation(arr);
		for(String s : list){
			System.out.println(s);

		}
	}


	public List<String> permutation(int[] arr)  {
		int LEN = arr.length;
		List<String> list = new ArrayList<>();
		for(int i=0; i<LEN; i++){
			int index=0;
			int[] numArr = new int[LEN-1];
			for(int j=0; j<LEN;j++){
				if(arr[i]!=arr[j]){
					numArr[index++]=arr[j];
				}}
			if(LEN-1>1){
				List<String> temp= permutation(numArr);
				for(String s : temp){
					list.add(arr[i]+s);
				}
			} else{
				list.add(""+arr[i]+numArr[0]);
			}

		}
		return list;
	}                    


}

