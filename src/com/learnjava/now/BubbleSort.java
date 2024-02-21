package com.learnjava.now;

public class BubbleSort {
	public void bubbleSort(int []A, int n) {
		for(int pass = n-1; pass >= 0; pass--) {
			for(int i = 0; i < pass; i++) {
				if(A[i] > A[i + 1]) {
					int temp = A[i];
					A[i] = A[i + 1];
					A[i + 1] = temp;
				}
			}
		}
	}
}
