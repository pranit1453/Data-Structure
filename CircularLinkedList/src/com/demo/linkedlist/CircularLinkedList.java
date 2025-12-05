package com.demo.linkedlist;

public class CircularLinkedList {

	static Node head;

	public void addNode(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			newNode.next = newNode.prev = newNode;
			head = newNode;
		} else {
			Node trav = head.prev;

			newNode.next = head;
			newNode.prev = trav;
			head.prev = newNode;
			trav.next = newNode;
		}
	}

	public void displayList() {

		if (head == null) {
			System.out.println("List is Empty!!!");
		}
		Node trav = head;
//		while (trav.next != head) {
//			System.out.print(trav.data + "-->");
//			trav = trav.next;
//		}
//		System.out.print(trav.data + "-->");
		do {
			System.out.print(trav.data + "<-->");
			trav = trav.next;
		} while (trav != head);
		System.out.println("head");

	}

	public void displayListRev() {
		if (head == null) {
			System.out.println("List is Empty!!!");
		}
		Node trav = head.prev;
		do {
			System.out.print(trav.data + "<-->");
			trav = trav.next;
		} while (trav != head.prev);
		System.out.println("head");

	}

	public void addByPos(int data, int pos) {
		Node newNode = new Node(data);
		if (pos == 1) {
			newNode.next = head;
			newNode.prev = head.prev;
			head.prev = newNode;
			head = newNode;
		} else {
			Node trav = head;
			int count = 1;
			while (trav.next != head && count <= pos - 2) {
				trav = trav.next;
				count++;
			}
			newNode.next = trav.next;
			newNode.prev = trav;
			trav.next = newNode;
			newNode.next.prev = newNode;
		}

	}

	public void deleteByPos(int pos) {
		if (head == null || pos <= 0) {
			System.out.println("List is Empty");
		}
		if (pos == 1) {
			if (head.next == head) {
				head = null;
			} else {
				Node trav = head.prev;
				head.next.prev = trav;
				trav.next = head.next;
				Node temp = head;
				head = head.next;
				temp.next = null;
			}
		} else {
			Node trav = head;
			int count = 1;
			while (trav.next != head && count < pos) {
				trav = trav.next;
				count++;
			}
			if (count == pos) {
				trav.prev.next = trav.next;
				trav.next.prev = trav.prev;

				trav.next = null;
				trav.prev = null;
			} else {
				System.out.println("Position is out of bounds.");
			}
		}

	}

	public void addByValue(int data, int val) {
		Node newNode = new Node(data);
		Node trav = head;
		if (trav.data == val) {
			newNode.next = head;
			newNode.prev = head.prev;
			head.prev = newNode;
			head = newNode;
		} else {
			while (trav.next != head && trav.data != val) {
				trav = trav.next;
			}
			newNode.next = trav.next;
			newNode.prev = trav;
			trav.next = newNode;
			newNode.next.prev = newNode;
		}
	}

	public void deleteByValue(int val) {
		if (head == null) {
			System.out.println("List is Empty");
		}
		Node trav = head;
		if (trav.data == val) {
			if (head.next == head) {
				head = null;
			} else {
				head = head.next;
				head.prev = trav;
				trav.next = head;
			}
		} else {
			while (trav.next != head && trav.data != val) {
				trav = trav.next;
			}
			if (trav.data == val) {
				trav.prev.next = trav.next;
				trav.next.prev = trav.prev;

				trav.next = null;
				trav.prev = null;
			} else {
				System.out.println("Position is out of bounds.");
			}
		}

	}

}
