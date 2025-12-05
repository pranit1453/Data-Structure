package com.demo.quicksort;

import java.util.Arrays;

public class Quick {
	public static void quickSortAscend(int[] arr, int start, int end) {
		if (start < end) {
			int part = partition(arr, start, end);
			quickSortAscend(arr, start, part - 1);
			quickSortAscend(arr, part + 1, end);
		}
	}

	private static int partition(int[] arr, int start, int end) {
		int pivot = start;
		int i = start;
		int j = end;
		while (i < j) {
			while (i < end && arr[i] <= arr[pivot]) {
				i++;
			}
			while (j > 0 && arr[j] > arr[pivot]) {
				j--;
			}

			if (i < j) {
				swap_i_j(arr, i, j);
			}
		}

		if (pivot != j) {
			swap_pivot(arr, pivot, j);
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("pivot position : "+j+" Pivot number : "+arr[j]);
		System.out.println(arr[j] + "  Swapped with "+arr[pivot]);
		return j;
	}

	private static void swap_pivot(int[] arr, int pivot, int j) {
		int temp = arr[pivot];
		arr[pivot] = arr[j];
		arr[j] = temp;
	}

	private static void swap_i_j(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
