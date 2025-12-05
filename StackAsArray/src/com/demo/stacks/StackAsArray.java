package com.demo.stacks;

import java.util.Arrays;

public class StackAsArray {
	private int[] arr;
	private int top;

	public StackAsArray() {
		super();
		this.arr = new int[10];
		this.top = -1;
	}

	public StackAsArray(int size) {
		super();
		this.arr = new int[size];
		this.top = -1;
	}

	public int[] getArr() {
		return arr;
	}

	public void setArr(int[] arr) {
		this.arr = arr;
	}

	public int getTop() {
		return top;
	}

	public void setTop(int top) {
		this.top = top;
	}

	@Override
	public String toString() {
		return "StackAsArray [arr=" + Arrays.toString(arr) + ", top=" + top + "]";
	}

	public boolean isFull() {
		return top == arr.length - 1;
	}

	public boolean isEmpty() {
		return top == -1;
	}

	public void push(int num) {
		if (!isFull()) {
			top++;
			arr[top] = num;
			System.out.println("Data get push : " + num);
		} else {
			System.out.println("Stack is Full");
		}
	}

	public int pop() {
		if (!isEmpty()) {
			int num = arr[top];
			top--;
			System.out.println("Data get pop : " + num);
			return num;
		} else {
			System.out.println("Stack is Empty");
			return -1;
		}
	}

}
