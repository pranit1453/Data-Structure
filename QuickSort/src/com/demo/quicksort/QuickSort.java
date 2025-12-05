package com.demo.quicksort;

public class QuickSort {

	public static int[] quickSortAscend(int[] arr, int low, int high) {
		// Base case
		if (low < high) {
			// Find pivot index
			int pivotIndex = partition(arr, low, high);
			// Sort left sub array
			quickSortAscend(arr, low, pivotIndex - 1);
			// Sort right sub array
			quickSortAscend(arr, pivotIndex + 1, high);
		}
		return arr;
	}

	private static int partition(int[] arr, int low, int high) {
		// Choose last element as pivot
		int pivot = arr[high];
		int i = low - 1;
		for (int j = low; j < high; j++) {
			if (arr[j] <= pivot) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
			System.out.println("Iterations: "+j);
		}
		// Place pivot in correct position
		int temp = arr[i + 1];
		arr[i + 1] = arr[high];
		arr[high] = temp;
		// Return pivot index
		return i + 1;
	}

}
