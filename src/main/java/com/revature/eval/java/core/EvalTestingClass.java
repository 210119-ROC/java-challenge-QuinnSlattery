package com.revature.eval.java.core;

public class EvalTestingClass {


	
	public static void main(String[] args) {
		
		long test = SpeedConverter.toMilesPerHour(100);
		System.out.println(test);
}


	static class SpeedConverter {

		public static long toMilesPerHour(double kilometersPerHour) {
			
			if (kilometersPerHour < 0) {
				return -1;
			}else {
				long milesPerHour = Math.round(kilometersPerHour*(1 / 0.621371));
				return milesPerHour;
			}
		}
	}
}