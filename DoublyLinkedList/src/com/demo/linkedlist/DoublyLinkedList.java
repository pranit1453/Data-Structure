package com.demo.linkedlist;

public class DoublyLinkedList {
	static Node head;

	public static void addAfterValue(int data, int value) {

		Node newNode = new Node(data);

		Node temp = head;

		while (temp != null && temp.data != value) {
			temp = temp.next;
		}
		if (temp != null) {
			newNode.next = temp.next;
			newNode.prev = temp;
			if (temp.next != null) {
				temp.next.prev = newNode;
			}

			temp.next = newNode;
		}
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

	public void addNode(int val) {
		Node newNode = new Node(val);
		// if list is empty add at the head
		if (head == null) {
			head = newNode;
		} else {
			Node temp = head;
			// place temp at the last node
			while (temp.next != null) {
				temp = temp.next;
			}
			newNode.prev = temp;
			temp.next = newNode;
		}

	}

}
