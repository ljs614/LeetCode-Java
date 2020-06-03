package com.ljs.prob;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinations {
    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<String>();
        Map<String, List<String>> lettersMap = new HashMap<>();
        lettersMap.put("2", Arrays.asList("a","b","c"));
        lettersMap.put("3", Arrays.asList("d","e","f"));
        lettersMap.put("4", Arrays.asList("g","h","i"));
        lettersMap.put("5", Arrays.asList("j","k","l"));
        lettersMap.put("6", Arrays.asList("m","n","o"));
        lettersMap.put("7", Arrays.asList("p","q","r","s"));
        lettersMap.put("8", Arrays.asList("t","u","v"));
        lettersMap.put("9", Arrays.asList("w","x","y","z"));
        
        if(digits.length()<2) {
        	return lettersMap.get(digits)!=null ? lettersMap.get(digits) : ans;
        }
        String firstLetter = digits.charAt(0)+"";
        String tempDigits = digits.substring(1);

		List<String> temp = letterCombinations(tempDigits);
		List<String> letters = lettersMap.get(firstLetter+"");
		for(String s : letters) {
			for(String t : temp) {
				ans.add(s+t);
			}
		}
        return ans;	
    }
}
