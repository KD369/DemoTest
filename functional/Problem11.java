package com.functional;

public class Problem11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int x = Integer.parseInt(args[0]);
	        int y = Integer.parseInt(args[1]);

	        // compute distance to (0, 0)
	        double dist = Math.sqrt(x*x + y*y);
	 
	        // output distance
	        System.out.println("distance from (" + x + ", " + y + ") to (0, 0) = " + dist);
	}

}
