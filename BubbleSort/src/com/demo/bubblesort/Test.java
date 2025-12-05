package com.demo.bubblesort;

import java.util.Arrays;

import com.demo.sort.BubbleSort;

public class Test {

	public static void main(String[] args) {
		int arr[] = { 13, 46, 24, 52, 20, 9 };
		int arr1[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] array1 = BubbleSort.bubbleSortAscend(arr);

		if (array1 != null) {
			System.out.println(Arrays.toString(array1));
		} else {
			System.out.println("Error");
		}

		System.out.println("=============================");

		int[] array2 = BubbleSort.bubbleSortDescend(arr);

		if (array2 != null) {
			System.out.println(Arrays.toString(array2));
		} else {
			System.out.println("Error");
		}

		System.out.println("=============================");

		int[] array3 = BubbleSort.bubbleSortAscendImproved(arr1);

		if (array3 != null) {
			System.out.println(Arrays.toString(array3));
		} else {
			System.out.println("Error");
		}

		System.out.println("=============================");

		int[] array4 = BubbleSort.bubbleSortDescendImproved(arr1);

		if (array4 != null) {
			System.out.println(Arrays.toString(array4));
		} else {
			System.out.println("Error");
		}

		System.out.println("=============================");
	}

}
