package com.demo.test;

import com.demo.linkedlist.CircularLinkedList;

public class list {

	public static void main(String[] args) {
		CircularLinkedList clist = new CircularLinkedList();
		clist.addNode(10);
		clist.addNode(20);
		clist.addNode(30);
		clist.addNode(40);
		clist.displayList();
		clist.displayListRev();
		clist.addByPos(50, 2);
		clist.displayList();
		clist.addByPos(100, 6);
		clist.displayList();
		System.out.println("==================================================");
		clist.deleteByPos(1);
		clist.displayList();
		clist.deleteByPos(2);
		clist.displayList();
		clist.deleteByPos(4);
		clist.displayList();
		System.out.println("==================================================");
		clist.addByValue(1000,40);
		clist.addByValue(1001,30);
		clist.addByValue(1002,20);
		clist.displayList();
		System.out.println("==================================================");
		clist.deleteByValue(40);
		clist.displayList();
	}

}
