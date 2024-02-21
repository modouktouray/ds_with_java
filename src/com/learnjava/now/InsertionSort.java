package com.learnjava.now;

public class InsertionSort {
	public void insertionSort(int[]A, int n) {
		for(int i = 1; i < n; i++) {
			int temp = A[i];
			int position = i;
			while(position > 0 && A[position - 1] > temp) {
				position = position - 1;
			}
			A[position] = temp;
			
		}
	}
}
