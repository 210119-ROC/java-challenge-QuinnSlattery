package com.revature.eval.java.core;

public class EvalTestingClass {


	
	public static void main(String[] args) {
		
		boolean test = shouldWakeUp(false, 12);
		System.out.println(test);
}


	public static boolean shouldWakeUp(boolean isBarking, int hourOfDay) {
		if(isBarking && hourOfDay < 22 && hourOfDay > 8) {
		return true;
		} else {
		return false;	
		}
	}
		
}

