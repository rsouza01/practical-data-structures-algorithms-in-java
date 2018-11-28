package com.rsouza01.google.alg.csscompactor;

import  java.util.Arrays;

public class App {
	
	public static void main (String[] args) {


		CssCompactor css = new CssCompactor();
		
		String compactColor1 = css.compact("#ababcd");
		String compactColor2 = css.compact(null);

		System.out.println("CssCompactor 1 - " + compactColor1);

		System.out.println("CssCompactor 2 - " + compactColor2);
		
	}

}
