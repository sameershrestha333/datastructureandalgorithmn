package com.example.datastructure.queue;

import java.util.LinkedList;

import com.example.datastructure.stack.StackImplementLinkedListGeneric;

public class Myqueue {
	private LinkedList<Integer> queue;

	public Myqueue() {
		queue = new LinkedList<Integer>();
	}

	// isEmpty
	public boolean isEmpty() {
		return queue.isEmpty();
	}

	public Integer size() {
		return queue.size();
	}

	// enqueue
	public void enqueue(Integer item) {
		queue.addLast(item);
	}

	/**
	 * return the first index element and removes it
	 * 
	 * @return
	 */
	public Integer dequeue() {
		if (queue.isEmpty())
			throw new RuntimeException("Empty queue");
		return queue.removeFirst();
	}

	public Integer peek() {
		if (queue.isEmpty())
			throw new RuntimeException("Empty queue");
		return queue.peek();
	}
	public static void main(String[] args) {
		 Myqueue queue = new Myqueue();
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
