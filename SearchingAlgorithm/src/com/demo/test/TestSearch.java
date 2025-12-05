package com.demo.test;

import java.util.Arrays;
import java.util.Scanner;

import com.demo.search.SearchingServices;
import com.demo.search.SearchingServicesImpl;

public class TestSearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		SearchingServices services = new SearchingServicesImpl();

		int[] arr = { 1, 2, 3, 8, 9, 4, 5, 6, 50, 44 };
		int[][] arr1 = { { 1, 2, 3 }, { 9, 8, 7 }, { 6, 4, 5 } };
		System.out.print("Data to Search : ");
		int data = sc.nextInt();
		System.out.println("========================================");
		int pos = services.linearSearch(arr, data);
		if (pos != -1) {
			System.out.println(pos);
		} else {
			System.out.println("Not Found!!!");
		}

		System.out.println("========================================");

		int[] pos1 = services.linearSearch2D(arr1, data);
		if (pos1 != null) {
			System.out.println(Arrays.toString(pos1));
		} else {
			System.out.println("Not Found!!!");
		}
		System.out.println("========================================");

		int pos3 = services.binarySearch(arr, data);
		if (pos3 != -1) {
			System.out.println(pos3);
		} else {
			System.out.println("Not Found!!!");
		}

		System.out.println("========================================");

		int pos4 = services.binarySearchRecurr(arr, data, 0, 10);
		if (pos4 != -1) {
			System.out.println(pos4);
		} else {
			System.out.println("Not Found!!!");
		}
	}

}
