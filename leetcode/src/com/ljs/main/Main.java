package com.ljs.main;

import java.util.List;

import com.ljs.prob.LetterCombinations;
import com.ljs.prob.ThreeSum;

public class Main {
	public static void main(String[] args) {
		LetterCombinations l = new LetterCombinations();
		List<String> list = l.letterCombinations("");
		for(String s:list) {
			System.out.println(s);
		}
	}
}

