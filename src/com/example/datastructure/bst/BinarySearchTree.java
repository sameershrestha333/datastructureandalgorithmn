package com.example.datastructure.bst;

import static org.hamcrest.CoreMatchers.nullValue;

public class BinarySearchTree {
	// since BT has reference to only to the root(as head in linkedlist)
	// so data member
	private TreeNode root;

	// for inserting
	public void insert(Integer data) {
		if (root == null)
			this.root = new TreeNode(data);
		else
			root.insert(data);
	}

	// for finding
	public TreeNode find(Integer data) {
		if (root != null)
			return root.find(data);

		return null;
	}

	public void delete(Integer data) {
		TreeNode toDelete = find(data);
		toDelete.delete();
	}

	public Integer max() {
		if (this.root != null)
			return root.max();
		return null;
	}

	public Integer min(){
		if(this.root!=null)
			return root.min();
		return null;		
	}

	/**
	 * this method use iteration approach because we also need track of the
	 * parent
	 * 
	 * * @param data
	 */
	/*
	 * public void delete(Integer data) {
	 * 
	 *//**
		 * we need track of 3 things 1. Node to be deleted 2. Parent node 3.
		 * wheater it is left or right child of parent
		 *//*
		 * // 1. Node to be deleted TreeNode current = this.root;
		 * 
		 * // 2. Parent node TreeNode parent = this.root;
		 * 
		 * // 3. wheater it is left or right child of parent boolean isLeftChild
		 * = false;
		 * 
		 * // if tree is empty if (current == null) return;
		 * 
		 * // current value is not equal to be deleted // we have to check
		 * current ==null because loop must be exit if tree to // end while
		 * (current != null && current.getData() != data) { // as long as the
		 * data doesnot match // we set the parent to current parent = current;
		 * 
		 * // move the current node // boolean value keeps the track in which
		 * way // the current node went if (data < current.getData()) { current
		 * = current.getLeftChild(); isLeftChild = true; } else { current =
		 * current.getRightChild(); isLeftChild = false; }
		 * 
		 * } // end of while loop // after teh loop we will get either current
		 * pointing to node to be // delete // or null // saying data is not
		 * found in the tree. if (current == null) { return; } // case 1.if node
		 * is leaf node(ie no left or right child if (current.getLeftChild() ==
		 * null && current.getRightChild() == null) { // if there is single data
		 * in tree if (current == root) { root = null; } else { if (isLeftChild)
		 * parent.setLeftChild(null); else parent.setRightChild(null); } } //
		 * case 2 else if (current.getRightChild() == null) { // if there is
		 * single data in tree if (current == root) { root =
		 * current.getLeftChild(); } else if (isLeftChild)
		 * parent.setLeftChild(current.getLeftChild()); else {
		 * parent.setLeftChild(current.getRightChild()); } } else if
		 * (current.getLeftChild() == null) { // if there is single data in tree
		 * if (current == root) { root = current.getRightChild(); } else if
		 * (isLeftChild) parent.setLeftChild(current.getRightChild()); else {
		 * parent.setLeftChild(current.getRightChild()); } }
		 * 
		 * }
		 */

}
