package com.demo.bst;

public class BinarySearchTree {
	Node root;

	class Node {
		int data;
		Node left;
		Node right;

		public Node(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}

	public BinarySearchTree() {
		this.root = null;
	}

	public void insertNode(int data) {
		root = insertData(root, data);
	}

	private Node insertData(Node root, int data) {
		Node newNode = new Node(data);
		if (root == null) {
			root = newNode;
			return root;
		} else {
			if (data < root.data) {
				root.left = insertData(root.left, data);
			} else {
				root.right = insertData(root.right, data);
			}
			return root;
		}
	}

	public void inOrder() {
		inOrderTraversal(root);
		System.out.println();
	}

	private void inOrderTraversal(Node root2) {
		if (root2 != null) {
			inOrderTraversal(root2.left);
			System.out.println(root2.data + ",");
			inOrderTraversal(root2.right);
		}
	}

	public void preOrder() {
		preOrderTraversal(root);
		System.out.println();
	}

	private void preOrderTraversal(Node root2) {
		if (root2 != null) {
			System.out.println(root2.data + ",");
			preOrderTraversal(root2.left);
			preOrderTraversal(root2.right);
		}
	}

	public void postOrder() {
		postOrderTraversal(root);
		System.out.println();
	}

	private void postOrderTraversal(Node root2) {
		if (root2 != null) {
			preOrderTraversal(root2.left);
			preOrderTraversal(root2.right);
			System.out.println(root2.data + ",");
		}
	}

	public void deleteNode(int data) {
		root = deleteData(root, data);
	}

	private Node deleteData(Node root, int data) {
		if (root == null) {
			return root;
		} else if (data < root.data) {
			root.left = deleteData(root.left, data);
		} else if (data > root.data) {
			root.right = deleteData(root.right, data);
		} else {
			// 1. the node is leaf node
			if (root.left == null && root.right == null) {
				return null;
			}
			// 2. the node has 1 child
			else if (root.left == null) {
				return root.right;
			} else if (root.right == null) {
				return root.left;
			}
			// 3. the node has 2 children
			root.data = minValue(root.right);
			root.right = deleteData(root.right, root.data);

			root.data = maxValue(root.left);
			root.left = deleteData(root.left, root.data);
		}
		return null;
	}

	private int maxValue(Node left) {
		int max = root.data;
		while (root.right != null) {
			max = root.right.data;
			root = root.right;
		}
		return max;
	}

	private int minValue(Node right) {
		int min = root.data;
		while (root.left != null) {
			min = root.left.data;
			root = root.left;
		}
		return min;
	}

	public boolean search(int data) {
		return searchBinaryTree(root, data);
	}

	private boolean searchBinaryTree(Node root, int data) {
		if (root != null) {
			if (root.data == data) {
				System.out.println(data + " data found");
				return true;
			} else if (data < root.data) {
				return searchBinaryTree(root.left, data);
			} else if (data > root.data) {
				return searchBinaryTree(root.right, data);
			}
		}
		System.out.println(data + " data not found");
		return false;
	}

	public boolean searchNonRecurr(int data) {
		return searchBinaryTreeNonRecurr(root, data);
	}

	private boolean searchBinaryTreeNonRecurr(Node root, int data) {
		if (root != null) {
			Node temp = root;
			while (temp != null) {
				if (temp.data == data) {
					System.out.println(data + " data found");
					return true;
				} else if (data < temp.data) {
					temp = temp.left;
				} else if (data > temp.data) {
					temp = temp.right;
				}
			}
		}
		System.out.println(data + " data not found");
		return false;
	}
}
