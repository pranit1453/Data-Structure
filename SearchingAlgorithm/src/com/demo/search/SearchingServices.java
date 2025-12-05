package com.demo.search;

public interface SearchingServices {

	int linearSearch(int[] arr, int data);

	int[] linearSearch2D(int[][] arr1, int data);

	int binarySearch(int[] arr, int data);

	int binarySearchRecurr(int[] arr, int data, int i, int j);

}
