package com.demo.test;

import com.demo.services.ArrayServices;

public class ArrayTest {

	public static void main(String[] args) {

		ArrayServices services = new ArrayServices();
		int[] arr = { 1,2,3,4,5};
		int[] newarr = services.sumOfArray(arr);
		if (newarr != null) {
			for (int a : newarr) {
				System.out.print(a + ",");
			}
		}
	}

}
