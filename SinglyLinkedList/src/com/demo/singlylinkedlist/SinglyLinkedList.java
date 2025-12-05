package com.demo.singlylinkedlist;

public class SinglyLinkedList {
	static Node head;

	public static void addAtEnd(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return;
		}
		Node current = head;
		while (current.next != null) {
			current = current.next;
		}
		current.next = newNode;
	}

	public static void display() {
		Node current = head;
		if (head == null) {
			System.out.println("Empty List....");
		}
		while (current != null) {
			System.out.print(current.data + " -> ");
			current = current.next;
		}
		System.out.print("null");

	}

	public static void addAtAnyPos(int data, int pos) {
		Node newNode = new Node(data);

		if (pos == 1) {
			newNode.next = head;
			head = newNode;
		} else {
			Node current = head;
			while (current != null && current.data != pos) {
				current = current.next;
			}
		}

	}
}
