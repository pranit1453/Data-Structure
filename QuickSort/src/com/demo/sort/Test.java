package com.demo.sort;

import java.util.Arrays;

import com.demo.quicksort.Quick;
import com.demo.quicksort.QuickSort;

public class Test {

	public static void main(String[] args) {
		int arr[] = { 4, 1, 7, 9, 3, 2, 99, 45, 23, 0 };
		int[] array1 = QuickSort.quickSortAscend(arr, 0, arr.length - 1);

		if (array1 != null) {
			System.out.println(Arrays.toString(array1));
		} else {
			System.out.println("Error");
		}

		System.out.println("=============================");

		Quick.quickSortAscend(arr, 0, arr.length - 1);

	}

}
