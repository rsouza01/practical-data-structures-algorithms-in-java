package com.rsouza01.google.alg.csscompactor;

import  java.util.Arrays;

public class CssCompactor {

    private static String compactColor(char[] color) {
        
        return "A";
    }
    
    public String compact(String color) {

        if(color == null) return "#FFFFFF";
        
        color = color.toLowerCase();
        
        if(color.length() == 4) return color;
        
        String compactColor = "#";
        
        compactColor += compactColor(new char[] {color.charAt(1), color.charAt(2)});
        compactColor += compactColor(new char[] {color.charAt(3), color.charAt(4)});
        compactColor += compactColor(new char[] {color.charAt(5), color.charAt(6)});
        
        return compactColor;
    }
}
