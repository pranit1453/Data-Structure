package com.demo.arraysbean;

import java.util.Arrays;

public class My1DArray {
	private int[] arr;
	private int count;

	public My1DArray() {
		arr = new int[10];
		count = 0;
	}

	public My1DArray(int[] arr, int count) {
		super();
		this.arr = arr;
		this.count = count;
	}

	public My1DArray(int size) {
		super();
		arr = new int[size];
		count = 0;
	}

	public int getCapacity() {
		return arr.length;
	}

	public int getSize() {
		return count;
	}

	public int[] getArr() {
		return arr;
	}

	public void setArr(int[] arr) {
		this.arr = arr;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public String toString() {
		return "My1DArray [arr=" + Arrays.toString(arr) + "]";
	}

}
