package com.rsouza01.google.binarysearchtree;

public class App {
	
	public static void main (String[] args) {

		BinarySearchTree bst = new BinarySearchTree();

		bst.insert(50, "Cinquenta");
		bst.insert(2, "Dois");
		bst.insert(5, "Cinco");
		bst.insert(12, "Doze");
		bst.insert(85, "Oitenta e Cinco");

		//System.out.println("Min = " + bst.findMin().key);
		//System.out.println("Max = " + bst.findMax().key);

		/*
		Node deleted = bst.delete(2);
		if(deleted != null) {
			System.out.println("Deleted = " + deleted.key);
		} else {
			System.out.println("Not found.");
		}

		System.out.println("Min = " + bst.findMin().key);

		bst.delete(85);
		System.out.println("Max = " + bst.findMax().key);
		*/
		
		System.out.println(bst.toString());
	}
}
