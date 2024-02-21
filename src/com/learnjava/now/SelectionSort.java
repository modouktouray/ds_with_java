package com.learnjava.now;

public class SelectionSort {
	public void selectionSortDemo(int []A, int n) {
		for(int i = 0; i < n; i++) {
			int position = i;
			for(int j = i +1; j < n; j++) {
				if(A[j] < A[position]) {
					position = j;
				}
			}
			int temp = A[i];
			A[i] = A[position];
			A[position] = temp;
		}
	}
}
