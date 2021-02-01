package com.revature.eval.java.core;

public class EvalTestingClass {


	
	public static void main(String[] args) {
		
		String test = reverse("hello");
		System.out.println(test);
		
}


	static public String reverse(String string) {
		char[] myArray = string.toCharArray();	
		System.out.println(myArray);
		String returnString = "";
		
		for(int i = 1; i <= string.length(); i++) {
			returnString = returnString + myArray[string.length() - i];
		}
		return returnString;
	}
}