package com.demo.sort;

import java.util.Arrays;

public class SortingServiceImpl implements SortingService {

	@Override
	public void bubbleSort(int[] arr) {
		for (int i = arr.length - 1; i >= 0; i--) {
			for (int j = 0; j <= i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
			System.out.println("Iterations are : " + i);
			System.out.println(Arrays.toString(arr));
		}

	}

	@Override
	public void bubbleSortImproved(int[] arr) {
		for (int i = arr.length - 1; i >= 0; i++) {
			boolean flag = false;
			for (int j = 0; j <= i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					flag = true;
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}

			System.out.println("Iterations are in bb sort aesc: " + i);
			System.out.println(Arrays.toString(arr));

			if (!flag) {
				break;
			}
		}

	}

	@Override
	public void bubbleSortImprovedDescending(int[] arr) {
		
		for (int i = arr.length - 1; i >= 0; i--) {
			boolean flag = false;
			for (int j = 0; j <= i - 1; j++) {
				if (arr[j] < arr[j + 1]) {
					flag = true;
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
			System.out.println("Iterations are in improved bb sort desc: " + i);
			System.out.println(Arrays.toString(arr));

			if (!flag) {
				break;
			}
		}

	}

}
