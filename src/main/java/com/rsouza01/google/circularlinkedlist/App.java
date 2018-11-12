package com.rsouza01.google.circularlinkedlist;

public class App {
	
	public static void main (String[] args) {

		CircularLinkedList cll = new CircularLinkedList();
		cll.insertFirst(1);
		cll.insertFirst(2);
		cll.insertFirst(3);
		cll.insertFirst(4);

		cll.displayList();
	}
}
