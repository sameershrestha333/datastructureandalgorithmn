package com.example.datastructure.linkedlist;

public class LinkedList {
	// since head is the only reference to the linkedList so.
	private Node head;

	/**
	 * the method takes int data and insert to the linked list
	 * 
	 * @param data
	 */
	public void insertAtHead(int data) {

		Node newNode = new Node(data);
		newNode.setNextNode(this.head);
		this.head = newNode;

	}

	/**
	 * this method return the list of linked list
	 * 
	 * @return
	 */

	public int length() {
		int length = 0;
		Node current = this.head;
		while (current != null) {
			length++;
			current = current.getNextNode();
		}
		return length;

	}

	/**
	 * this method remove the data from the linkedList
	 */
	public void remove() {
		this.head = this.head.getNextNode();
	}

	public Node search(int data) {
		Node current = this.head;
		while (current != null) {
			if (data == current.getData()) {
				return current;
			}

			current = current.getNextNode();

		}
		return null;
	}

	@Override
	public String toString() {
		String result = "{";

		Node current = this.head;
		while (current != null) {
			result += current.toString() + ",";
			current = current.getNextNode();
		}
		result += "}";

		return result;
	}
}
