package com.example.datastructure.recursion.quicksort;

import java.util.Arrays;

public class QuickSorter {

	public void sorter(Integer[] data) {
		quicksort(data, 0, data.length - 1);

	}

	/**
	 * this is quick sort which uses the recursion approach
	 * 
	 * @param data
	 * @param start
	 * @param end
	 */
	public void quicksort(Integer[] data, int start, int end) {
		if (start < end) {
			int pivot = partition(data, start, end);
			quicksort(data, start, pivot - 1);
			quicksort(data, pivot + 1, end);
		}

	}

	/**
	 * this method gives the index of pivot element after the partition.
	 * 
	 * @param data
	 * @param start
	 * @param end
	 * @return
	 */
	private int partition(Integer[] data, int start, int end) {
		int pivot = data[end];
		int i = start;
		for (int j = start; j <= end - 1; j++) {
			if (data[j] < pivot) {
				// swaping
				int temp = data[j];
				data[j] = data[i];
				data[i] = temp;

				/*
				 * int tmp = data[i]; data[i] = data[j]; data[j] = tmp;
				 */
				i++;
			}
		} // end of for loop
		data[end] = data[i];
		data[i] = pivot;

		return i;
	}

	public static void main(String[] args) {
		Integer[] data = { 25, 5, 7, 2, 18, 23, 12, 18 };
		new QuickSorter().sorter(data);
		System.out.println(Arrays.toString(data));
	}

}
