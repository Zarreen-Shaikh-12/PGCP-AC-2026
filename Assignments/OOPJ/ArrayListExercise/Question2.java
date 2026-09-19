package org.zarreen;

import java.util.ArrayList;

public class Question2 {

	public static void main(String[] args) {
		ArrayList<String> colors = new ArrayList<>();

        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        
        colors.add(0, "Black");

        System.out.println(colors);
	}

}
