package com.example.datastructure.queue;

import java.util.LinkedList;

import com.example.datastructure.stack.StackImplementLinkedListGeneric;

public class MyqueueGeneric<T> {
	private LinkedList<T> queue;

	public MyqueueGeneric() {
		queue = new LinkedList<T>();
	}

	// isEmpty
	public boolean isEmpty() {
		return queue.isEmpty();
	}

	public Integer size() {
		return queue.size();
	}

	// enqueue
	public void enqueue(T item) {
		queue.addLast(item);
	}

	/**
	 * return the first index element and removes it
	 * 
	 * @return
	 */
	public T dequeue() {
		if (queue.isEmpty())
			throw new RuntimeException("Empty queue");
		return queue.removeFirst();
	}

	public T peek() {
		if (queue.isEmpty())
			throw new RuntimeException("Empty queue");
		return queue.peek();
	}
	public static void main(String[] args) {
		 MyqueueGeneric<Integer> queue = new MyqueueGeneric<Integer>();
		System.out.println(queue.isEmpty());
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		queue.enqueue(4);
		System.out.println(queue.isEmpty());
		System.out.println(queue.peek());
		System.out.println(queue.dequeue());
		System.out.println(queue.peek());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		
		
	}

}
