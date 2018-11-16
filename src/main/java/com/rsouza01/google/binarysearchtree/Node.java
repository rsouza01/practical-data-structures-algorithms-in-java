package com.rsouza01.google.binarysearchtree;

public class Node {
    public int key;
    public String value;
    public Node leftChild;
    public Node rightChild;

    public Node(int key, String value) {
        super();
        this.key = key;
        this.value = value;
    }

    public boolean isLeaf() {
        return this.leftChild == null && this.rightChild == null;
    }
}
