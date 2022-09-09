package com.agiletestingalliance;

public class MinMax {

	public int f(int a, int b) {
		if (b > a) {
			return b;
		}
		else {
			return a; 
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
