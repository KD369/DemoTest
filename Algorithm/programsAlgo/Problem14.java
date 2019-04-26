package com.Algorithm;

public class Problem14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double c = Double.parseDouble(args[0]);
        double epsilon = 1.0e-15;  
        double t = c;              


        while (Math.abs(t - c/t) > epsilon*t) {
            t = (c/t + t) / 2.0;
        }

        
        System.out.println(t);
	}

}
