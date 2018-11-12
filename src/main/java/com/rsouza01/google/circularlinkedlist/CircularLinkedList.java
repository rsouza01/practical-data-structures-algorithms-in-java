package com.rsouza01.google.circularlinkedlist;

public class CircularLinkedList {

    private Node first = null;
    private Node last = null;

    public CircularLinkedList() {
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void insertFirst(int data) {
        Node node = new Node(data);

        if(isEmpty()) {
            last = node;
        }
        node.setNext(first);
        first = node;
    }

    public int deleteFirst() {
        Node node = first;

        if(first.getNext() == null) {
            last = null;
        }
        first = node.getNext();
        return node.getData();
    }

    public void insertLast(int data) {
        Node node = new Node(data);

        if(isEmpty()) {
            first = node;
        } else {
            last.setNext(node);
            last = node;
        }
    }

    public void displayList() {
        System.out.println("List (first --> last) ");
        Node current = first;
        while(current != null) {
            current.displayNode();
            current = current.getNext();
        }
    }

}
