package com.example.datastructure.recursion;

import java.util.Arrays;

public class MergeSorter {

	public void sorter(int[] data) {
		MergeSort(data, 0, data.length - 1);
	}

	private void MergeSort(int[] data, int start, int end) {
		if (start < end) {
			int mid = (int) Math.floor((start + end) / 2);
			MergeSort(data, start, mid);
			MergeSort(data, mid + 1, end);
			Merge(data, start, mid, end);
		}

	}

	private void Merge(int[] data, int start, int mid, int end) {
		// getting size for array lef and right;
		int n1 = mid - start + 1;
		int n2 = end - mid;
		// creating two temp array
		int[] left = new int[n1];
		int[] right = new int[n2];
		// coping the data in left array
		for (int i = 0; i < n1; i++) {
			left[i] = data[start + i];
		}
		// coping the data in right array
		for (int j = 0; j < n2; j++) {
			right[j] = data[mid + 1 + j];
		}
		// initializing i and j
		int i = 0, j = 0;
		for (int k = start; k <= end; k++) {
			if ((j >= n2) || (i < n1 && left[i] <= right[j])) {

				data[k] = left[i];
				i++;
			} else {
				data[k] = right[j];
				j++;
			}

		}

	}

	public static void main(String[] args) {
		MergeSorter sorter = new MergeSorter();
		int[] data = { 4, 1, 6, 9, 5 };
		sorter.sorter(data);
		System.out.println(Arrays.toString(data));
	}

}
