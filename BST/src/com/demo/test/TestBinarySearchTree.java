package com.demo.test;

import com.demo.bst.BinarySearchTree;

public class TestBinarySearchTree {

	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		bst.insertNode(31);
		bst.insertNode(15);
		bst.insertNode(17);
		bst.insertNode(18);
		bst.insertNode(10);
		bst.insertNode(40);
		bst.insertNode(32);
		bst.insertNode(45);
		bst.insertNode(33);
		System.out.println("Inorder");
		bst.inOrder();
		System.out.println("preorder");
		bst.preOrder();
		System.out.println("postorder");
		bst.postOrder();

		bst.search(33);
		bst.searchNonRecurr(31);
		bst.search(38);

		bst.deleteNode(18);
		bst.inOrder();
		bst.deleteNode(32);
		bst.inOrder();
		bst.deleteNode(15);
		bst.inOrder();

	}

}
