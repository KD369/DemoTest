package com.Algorithm;

import com.kvd.util.Utility;

public class Problem13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int p = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);
		int r = Integer.parseInt(args[2]);
		
		Utility util = new Utility();
		System.out.println(util.monthlyPayment(p, y, r));
		
	}

}
