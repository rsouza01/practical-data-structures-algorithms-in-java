package com.rsouza01.google.binarysearchtree;

public class BinarySearchTree {

    private Node root = null;

    public Node findMin() {

        Node current = root;
        Node last = null;

        while(current != null) {
            last = current;
            current = current.leftChild;
        }

        return last;
    }

    public Node findMax() {

        Node current = root;
        Node last = null;

        while(current != null) {
            last = current;
            current = current.rightChild;
        }

        return last;
    }

    public void insert(int key, String value) {

        Node newNode = new Node(key, value);

        if(root == null) {
            root = newNode;
        } else {
            Node currentNode = root;
            Node parentNode = null;

            while(true) {
                parentNode = currentNode;
                if(key < currentNode.key) {
                    currentNode = currentNode.leftChild;
                    if(currentNode == null) {
                        parentNode.leftChild = newNode;
                        return;
                    }
                } else {
                    currentNode = currentNode.rightChild;
                    if(currentNode == null) {
                        parentNode.rightChild = newNode;
                        return;
                    }
                }
            }
        }
    }

    public Node delete(int key) {

        if(root == null) return null;

        Node currentNode = root;
        Node parentNode = null;

        boolean isLeftChild = false;

        while(currentNode != null && currentNode.key != key) {

            parentNode = currentNode;

            if(key < currentNode.key) {
                currentNode = currentNode.leftChild;
                isLeftChild = true;
            } else {
                currentNode = currentNode.rightChild;
                isLeftChild = false;
            }
        }

        if(currentNode == null) return null;

        Node nodeToDelete = currentNode;

        if(nodeToDelete.isLeaf()) {
            
            if(nodeToDelete == root) {
                root = null;
            } else if(isLeftChild) {
                parentNode.leftChild = null;
            }
            else {
                parentNode.rightChild = null;
            }
            return nodeToDelete;
        } else if(nodeToDelete.rightChild == null) {
            if(nodeToDelete == root) {
                root = nodeToDelete.leftChild;
            } else if(isLeftChild) {
                parentNode.leftChild = nodeToDelete.leftChild;
            } else {
                parentNode.rightChild = nodeToDelete.leftChild;
            }
        } else if(nodeToDelete.leftChild == null) {
            if(nodeToDelete == root) {
                root = nodeToDelete.rightChild;
            } else if(isLeftChild) {
                parentNode.leftChild = nodeToDelete.rightChild;
            } else {
                parentNode.rightChild = nodeToDelete.rightChild;
            }
        } else {
            Node successor = setUpAndGetSuccessor(nodeToDelete);
            
            if(nodeToDelete == root) {
                root = successor;
            } else if(isLeftChild) {
                parentNode.leftChild = successor;
            } else {
                parentNode.rightChild = successor;
            }        

            successor.leftChild = nodeToDelete.leftChild;
            successor.rightChild = nodeToDelete.rightChild;
        }

        return null;
    }

    private Node setUpAndGetSuccessor(Node node) {

        Node successor = node.rightChild;
        Node successorParent = node.rightChild;

        while(successor.leftChild != null) {
            successorParent = successor;
            successor = successor.leftChild;
        }

        if(successor.rightChild != null) {
            successorParent.leftChild = successor.rightChild;
        }

        return successor;
    }
}
