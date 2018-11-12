package com.rsouza01.google.stack;

public class App {
	
	public static void main (String[] args) {

		System.out.println(invertString("123456"));
	}

	public static String invertString(String string) {

		String invertedString = "";
		Stack stack = new Stack(string.length());

		for(int i = 0; i < string.length(); i++) {
			stack.push((long)string.charAt(i));
		}

		while(!stack.isEmpty()) {
			invertedString += (char)stack.pop();
		}

		
		return invertedString;
	}
}
