package com.ljs.prob;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0|| strs[0].length() == 0){
            return "";
        }
        int mid = strs[0].length()/2 + 1;
        String temp = strs[0].substring(0,mid);
        String ans = "";
        boolean flag = true;
        while(true){
            for(int i=1; i<strs.length; i++){
                if(strs[i].indexOf(temp) !=0) {
                	flag = false;
                	break;
                }
            }
            if(flag) {
            	mid++;
            	if(ans.equals(temp)) {
            		break;
            	}
            	ans = temp;
            }else {
            	mid--;
            }
            flag = true;
            if(mid == 0 || mid >strs[0].length()) {
            	break;
            }else {
            	temp = strs[0].substring(0,mid);
            }
            
        }
        return ans;
    }
}
