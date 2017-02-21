package com.example.datastructure.bst;

import org.junit.validator.PublicClassValidator;

public class TreeNode {

	private Integer data;

	private TreeNode leftChild;
	private TreeNode rightChild;

	private boolean isDeleted = false;

	// constructor
	public TreeNode(Integer data) {
		super();
		this.data = data;
	}

	// getter and setter
	public Integer getData() {
		return data;
	}

	/**
	 * Here we will create setter for data because we want to make data member
	 * immutable
	 * 
	 * @return
	 */

	/*
	 * public void setData(Integer data) { this.data = data; }
	 */
	public TreeNode getLeftChild() {
		return leftChild;
	}

	public void setLeftChild(TreeNode leftChild) {
		this.leftChild = leftChild;
	}

	public TreeNode getRightChild() {
		return rightChild;
	}

	public void setRightChild(TreeNode rightChild) {
		this.rightChild = rightChild;
	}

	/**
	 * This method use to find the data in recursive way
	 * 
	 * @param data
	 * @return: return the data if not present return null;
	 */
	public TreeNode find(Integer data) {
		if (data == this.data && !isDeleted)
			return this;
		if (data < this.data && leftChild != null)
			return leftChild.find(data);
		if (rightChild != null)
			return rightChild.find(data);
		return null;
	}

	/**
	 * this method is used to insert the data in bst in recursive way
	 * 
	 * @param data
	 */
	public void insert(Integer data) {
		if (data < this.data) {
			if (leftChild == null)
				this.leftChild = new TreeNode(data);
			else
				this.leftChild.insert(data);

		} else {
			if (rightChild == null)
				this.rightChild = new TreeNode(data);
			else
				this.rightChild.insert(data);

		}

	}

	public void delete() {
		this.isDeleted = true;
	}

	public boolean isDeleted() {
		return isDeleted;
	}

	public Integer max() {
		
		if(this.rightChild==null)
			return this.data;
		return this.rightChild.max();
	}

	public Integer min() {
		if(this.leftChild==null)
			return this.data;
		
		return this.leftChild.min();
	}

}
