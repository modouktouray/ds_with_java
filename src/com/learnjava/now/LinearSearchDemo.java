package com.learnjava.now;

public class LinearSearchDemo {
	public double linearSearch(double A[], double target) {
		for(int i = 0; i < A.length; i++) {
			if(A[i]==target) {
				return i;
			}
		}
		return -1;
	}
	
}
