package com.demo.test;

import java.util.stream.IntStream;

import com.demo.sort.SortingService;
import com.demo.sort.SortingServiceImpl;

public class TestSort {

	public static void main(String[] args) {
		int[] arr = { 21, 2, 5, 1, 7, 8, 10, 3 };
		SortingService service = new SortingServiceImpl();
		service.bubbleSort(arr);
		//IntStream.of(arr).forEach(e -> System.out.print(e + "\t"));
		System.out.println("================================");
		service.bubbleSortImproved(arr);
		//IntStream.of(arr).forEach(e -> System.out.print(e + "\t"));
		System.out.println("================================");
		service.bubbleSortImprovedDescending(arr);
		//IntStream.of(arr).forEach(e -> System.out.print(e + "\t"));
		System.out.println("================================");

	}

}
