package com.demo.test;

import com.demo.stacks.StackAsArray;

public class StackTest {

	public static void main(String[] args) {
		StackAsArray sa = new StackAsArray(5);
		sa.push(10);
		sa.push(2);
		sa.push(30);
		sa.push(80);
		sa.push(15);
		System.out.println("------------------------");
		System.out.println(sa.pop());
		System.out.println(sa.pop());
		System.out.println(sa.pop());
		System.out.println(sa.pop());
		System.out.println(sa.pop());
		System.out.println(sa.pop());
		System.out.println(sa.pop());
	}

}
