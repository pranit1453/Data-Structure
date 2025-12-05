package com.demo.search;

public class SearchingServicesImpl implements SearchingServices {

	@Override
	public int linearSearch(int[] arr, int data) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == data) {
				return i;
			}
		}
		return -1;
	}

	@Override
	public int[] linearSearch2D(int[][] arr1, int data) {
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				if (arr1[i][j] == data) {
					return new int[] { i, j };
				}
			}
		}
		return new int[] {};
	}

	@Override
	public int binarySearch(int[] arr, int data) {
		// non recursive
		int low = 0;
		int high = 10;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] == data) {
				return mid;
			} else if (data < arr[mid]) {
				high = mid - 1;
			} else if (data > arr[mid]) {
				low = mid + 1;
			}
		}
		return -1;
	}

	@Override
	public int binarySearchRecurr(int[] arr, int data, int i, int j) {
		if (i <= j) {
			int mid = (i + j) / 2;
			if (arr[mid] == data) {
				return mid;
			} else if (data < arr[mid]) {
				binarySearchRecurr(arr, data, i, mid - 1);
			} else {
				binarySearchRecurr(arr, data, mid + 1, j);
			}
		}
		return -1;
	}

}
