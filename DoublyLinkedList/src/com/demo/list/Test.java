package com.demo.list;

import com.demo.linkedlist.DoublyLinkedList;

public class Test {

	public static void main(String[] args) {
		DoublyLinkedList dlist = new DoublyLinkedList();
		dlist.addNode(1);
		dlist.addNode(2);
		dlist.addNode(3);
		DoublyLinkedList.display();
		DoublyLinkedList.addAfterValue(4, 3);
		DoublyLinkedList.display();

	}

}
