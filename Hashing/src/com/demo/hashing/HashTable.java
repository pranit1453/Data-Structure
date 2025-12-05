package com.demo.hashing;

public class HashTable {
	Node[] heads;

	class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public HashTable() {
		heads = new Node[10];
		for (int i = 0; i < heads.length; i++) {
			heads[i] = null;
		}
	}

	public HashTable(int size) {
		heads = new Node[size];
		for (int i = 0; i < heads.length; i++) {
			heads[i] = null;
		}
	}

	public void insertData(int data) {
		Node newNode = new Node(data);
		int pos = data % heads.length;

		if (heads[pos] != null) {
			newNode.next = heads[pos];
		}
		heads[pos] = newNode;
	}

	public void displayHashTable() {
		for (int i = 0; i < heads.length; i++) {
			Node temp = heads[i];
			System.out.print(i + "(Bucket)--->");
			while (temp != null) {
				System.out.print(temp.data + "--->");
				temp = temp.next;
			}
			System.out.print("null");
			System.out.println();
		}
	}

	public boolean searchData(int data) {
		int pos = data % heads.length;
		Node temp = heads[pos];
		while (temp != null) {
			if (temp.data == data) {
				System.out.println(data + " found in bucket " + pos);
				return true;
			}
			temp = temp.next;
		}
		System.out.println(data + " not found in bucket at " + pos);
		return false;
	}
}
