package org.zarreen;

import java.util.ArrayList;

public class Question4 {

	public static void main(String[] args) {
		ArrayList<String> colors = new ArrayList<>();

        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        
        colors.add(0, "Black");
        
        colors.set(2, "Pink");
        
        System.out.println(colors.get(2));

        System.out.println(colors);
	}

}
