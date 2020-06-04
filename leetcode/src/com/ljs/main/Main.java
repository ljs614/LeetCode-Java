package com.ljs.main;

import java.util.List;

import com.ljs.june2020.Week1_3rd;
import com.ljs.prob.LetterCombinations;
import com.ljs.prob.ThreeSum;

public class Main {
	public static void main(String[] args) {
		Week1_3rd w = new Week1_3rd();
		int[][] costs = {{10,20},{30,200},{400,50},{30,20}};
		System.out.println(w.twoCitySchedCost(costs));
	}
}

