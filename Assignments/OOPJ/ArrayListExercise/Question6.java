package org.zarreen;

import java.util.ArrayList;

public class Question6 {

	public static void main(String[] args) {
		ArrayList<String> colors = new ArrayList<>();

        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");

        System.out.println(colors);
        
        System.out.println(colors.contains("Green"));
	}

}
