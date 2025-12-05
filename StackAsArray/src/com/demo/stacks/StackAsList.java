package com.demo.stacks;

public class StackAsList {
	Node top;

	public StackAsList() {
		this.top = null;
	}

	public boolean isEmpty() {
		return top == null;
	}

	public void push(int data) {
		Node newNode = new Node(data);
		if (!isEmpty()) {
			newNode.next = top;
		}
		top = newNode;
		System.out.println("Pushed : " + data);
	}

	public int pop() {
		if (!isEmpty()) {
			Node temp = top;
			top = top.next;
			temp.next = null;
			return temp.data;
		} else {
			System.out.println("Stack is empty");
			return -1;
		}

	}
}
