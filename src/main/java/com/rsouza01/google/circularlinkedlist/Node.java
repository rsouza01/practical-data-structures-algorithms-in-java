package com.rsouza01.google.circularlinkedlist;

public class Node {
    private int data;
    private Node next;

    public Node(int data) {
        this.data = data;
    }

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    public void displayNode() {
        System.out.println("{ " + data + " }");
    }

    /**
     * @return the next
     */
    public Node getNext() {
        return next;
    }

    /**
     * @param next the next to set
     */
    public void setNext(Node next) {
        this.next = next;
    }

    /**
     * @return the data
     */
    public int getData() {
        return data;
    }
}
