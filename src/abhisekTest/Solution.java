package abhisekTest;

import java.util.*;
import java.lang.*;


class Solution {
	    public void Sub(String s) {
	    	String result = "";
	    	String reverse = "";
	    	for (int i=1;i<=s.length();i++) {
	    		for (int j = i+1;j<=s.length();j++) {
	    			String subString  = s.substring(i, j);
	    			reverse = reverse(subString);
	    			System.out.println(reverse);
	    		}
	    	}
	    }
   
	public String reverse(String s) {
		int k = s.length();
		String rev = "";
		for (int m = k-1;m>=0;m--) {
			rev = rev + s.charAt(m);
		}
		return rev;
	}    
    
    public static void main(String [] args) {
    	Solution sol = new Solution();
    	sol.Sub("abhisek");
    	
    }
}


