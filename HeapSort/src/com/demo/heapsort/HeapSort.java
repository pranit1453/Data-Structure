package com.demo.heapsort;

import java.util.Arrays;

public class HeapSort {

	public static void heapSortAscend(int[] arr) {

		for (int i = (arr.length / 2) - 1; i >= 0; i--) {
			heapify(arr, arr.length, i);
		}

		int n = arr.length;
		for (int i = n - 1; i >= 0; i--) {
			int temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;

			heapify(arr, i, 0);
		}
		System.out.println(Arrays.toString(arr));

	}

	private static void heapify(int[] arr, int heapSize, int rootIndex) {
		int largest = rootIndex;
		int left = 2 * rootIndex + 1;
		int right = 2 * rootIndex + 2;

		if (left < heapSize && arr[left] > arr[largest]) {
			largest = left;
		}

		if (right < heapSize && arr[right] > arr[largest]) {
			largest = right;
		}

		if (largest != rootIndex) {
			int temp = arr[rootIndex];
			arr[rootIndex] = arr[largest];
			arr[largest] = temp;

			heapify(arr, heapSize, largest);
		}
	}

}
