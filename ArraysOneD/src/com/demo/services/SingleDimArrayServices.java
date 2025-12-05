package com.demo.services;

import java.util.Scanner;

import com.demo.arraysbean.My1DArray;

public class SingleDimArrayServices implements SingleDimArray {

	Scanner sc = new Scanner(System.in);
	My1DArray arrob = new My1DArray();

	@Override
	public void accept(int[] arr1) {
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = sc.nextInt();
		}

	}

	@Override
	public void display(int[] arr1) {
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + "\t");
		}
		System.out.println();

	}

	@Override
	public boolean addAtEnd(int data) {
		if (arrob.getCount() < arrob.getArr().length) {
			arrob.getArr()[arrob.getCount()] = data;
			arrob.setCount(arrob.getCount() + 1);
			return true;
		}
		return false;
	}

}
