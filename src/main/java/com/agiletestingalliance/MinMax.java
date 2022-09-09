package com.agiletestingalliance;

public class MinMax {

	public int foo(int first, int second) {
		if (second > first) {
			return second;
		}
		else {
			return first; 
		}
	}

	
	public String bar(String string) {
		if (string!=null || !string.equals("")) {
			return string;
		}
		if (string==null && string.equals("")) {
			return string;
		}
		return string;
	}
	

}
