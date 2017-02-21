package com.example.datastructure.stack;

import java.util.LinkedList;

public class StackImplementLinkedListGeneric<T> {
	 LinkedList<T> stack;

	public StackImplementLinkedListGeneric() {
		stack = new LinkedList<T>();
	}

	public boolean isEmpty() {
		return stack.isEmpty();
	}

	public Integer size() {
		return stack.size();
	}

	// pushing the item
	public void push(T item) {
	
		stack.addLast(item);
	}

	/**
	 * Returns the topmost item and removes it
	 * 
	 * @return
	 */
	public T pop() {
		if(stack.isEmpty())
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
	public T peek() {
		if(stack.isEmpty())
			throw new RuntimeException("Empty Stack");
		return stack.peek();
	}

	public static void main(String[] args) {
		StackImplementLinkedListGeneric<String> stack = new StackImplementLinkedListGeneric<String>();
		System.out.println("====== String =======");

		System.out.println(stack.isEmpty());
		stack.push("a");
		stack.push("b");
		stack.push("c");
		stack.push("d");
		System.out.println(stack.isEmpty());
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());

		System.out.println("====== Integer=======");

		StackImplementLinkedListGeneric<Integer> intStack = new StackImplementLinkedListGeneric();
		System.out.println(intStack.isEmpty());
		intStack.push(1);
		intStack.push(2);
		intStack.push(3);
		intStack.push(4);
		System.out.println(intStack.isEmpty());
		System.out.println(intStack.peek());
		System.out.println(intStack.pop());
		System.out.println(intStack.peek());
		System.out.println(intStack.pop());
		System.out.println(intStack.pop());
		System.out.println(intStack.pop());
		
		System.out.println("====== Float=======");

		StackImplementLinkedListGeneric<Float> floatStack = new StackImplementLinkedListGeneric<Float>();
		System.out.println(floatStack.isEmpty());
		floatStack.push((float) 1.0);
		floatStack.push((float) 2.0);
		floatStack.push((float) 3.0);
		floatStack.push((float) 4.0);
		System.out.println(floatStack.isEmpty());
		System.out.println(floatStack.peek());
		System.out.println(floatStack.pop());
		System.out.println(floatStack.peek());
		System.out.println(floatStack.pop());
		System.out.println(floatStack.pop());
		System.out.println(floatStack.pop());
	}

}
