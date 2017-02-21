package com.example.datastructure.stack;

import java.util.LinkedList;

public class StackImplementLinkedList {
	LinkedList<Integer> stack;

	public StackImplementLinkedList() {
		stack = new LinkedList<Integer>();
	}

	public boolean isEmpty() {
		return stack.isEmpty();
	}

	public Integer size() {
		return stack.size();
	}

	// pushing the item
	public void push(int item) {
		stack.addLast(item);
	}

	/**
	 * Returns the topmost item and removes it
	 * 
	 * @return
	 */
	public Integer pop() {
		if (stack.isEmpty())
			throw new RuntimeException("Empty Stack");
		return stack.removeLast();
	}

	/**
	 * Returns the topmost item without removing it Peek and Pop methods should
	 * ideally be invoked after checking that the stack is not empty either in a
	 * 'if' condition or a 'while' loop
	 * 
	 * @return
	 */
	public Integer peek() {
		if (stack.isEmpty())
			throw new RuntimeException("Empty Stack");
		return stack.peek();
	}

	public static void main(String[] args) {
		StackImplementLinkedList stack = new StackImplementLinkedList();
		System.out.println(stack.isEmpty());
		stack.push(5);
		stack.push(4);
		stack.push(6);
		stack.push(10);
		System.out.println(stack.isEmpty());
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	}

}
