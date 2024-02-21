package com.learnjava.now;

public class BinarySearchDemo {
	
	public int binarySearch(int[]A, int n, int value) {
		int l = 0;
		int r = n - 1;
		while(l < r) {
			int mid = (int) Math.floor((l+ r)/2);
			System.out.println(mid);
			if(A[mid] == value) {
				return A[mid];
			}
			else if(value < A[mid]) {
				r = mid - 1;
			}
			else if(value > A[mid]) {
				l = mid + 1;
			}
		}
		return -1;
		
	}
}
