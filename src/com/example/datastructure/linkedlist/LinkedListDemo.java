package com.example.datastructure.linkedlist;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.insertAtHead(35);
		list.insertAtHead(15);

		list.insertAtHead(25);

		list.insertAtHead(5);
		list.insertAtHead(6);
		System.out.println(list);
		/*System.out.println("Length : "+list.length());
		System.out.println("========= After Removing ===============");
		list.remove();
		System.out.println(list);
		System.out.println("Length : "+list.length());*/
		
		System.out.println("========= Searching ===============");
		System.out.println("Found :"+list.search(250));
		
	}

}
