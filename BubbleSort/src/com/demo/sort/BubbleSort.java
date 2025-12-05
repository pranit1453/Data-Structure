package com.demo.sort;

public class BubbleSort {

	public static int[] bubbleSortAscend(int[] arr) {
		int iterationCount = 0;
		for (int i = arr.length - 1; i >= 0; i--) {
			for (int j = 0; j <= i - 1; j++) {
				iterationCount++;
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		System.out.println("Total iterations: " + iterationCount);
		return arr;
	}

	public static int[] bubbleSortDescend(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr.length - i; j++) {
				if (arr[j - 1] < arr[j]) {
					int temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}
			}
			System.out.println("Iteration: " + i);
		}
		return arr;
	}

	public static int[] bubbleSortAscendImproved(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			boolean flag = false;
			for (int j = 1; j < arr.length - i; j++) {
				if (arr[j - 1] > arr[j]) {
					flag = true;
					int temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}
			}
			System.out.println("Iteration: " + i);
			if (flag) {
				break;
			} else {
				continue;
			}
		}
		return arr;
	}

	public static int[] bubbleSortDescendImproved(int[] arr) {
		for (int i = arr.length - 1; i >= 0; i--) {
			for (int j = 0; j <= i - 1; j++) {
				if (arr[j] < arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		return arr;
	}

}
