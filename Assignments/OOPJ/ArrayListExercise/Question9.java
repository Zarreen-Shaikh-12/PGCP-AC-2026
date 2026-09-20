package org.zarreen;

import java.util.ArrayList;
import java.util.Collections;

public class Question9 {

	public static void main(String[] args) {
		ArrayList<String> colors = new ArrayList<>();

        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");

        System.out.println(colors);
        
        Collections.shuffle(colors);
        
        System.out.println(colors);
	}

}
