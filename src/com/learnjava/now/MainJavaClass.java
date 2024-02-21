package com.learnjava.now;

public class MainJavaClass {

	public static void main(String[] args) {
		SelectionSort s = new SelectionSort();
		int[] arrayvalues = {7,5,8,3,2,4};
		s.selectionSortDemo(arrayvalues,6);
		for(int array : arrayvalues) {
			System.out.println(array);
		}
		
	}

}
