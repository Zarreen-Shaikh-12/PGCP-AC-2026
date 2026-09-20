package org.zarreen;

import java.util.ArrayList;
import java.util.Collections;

public class Question8 {

	public static void main(String[] args) {
		ArrayList<String> colors = new ArrayList<>();

        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");

        System.out.println(colors);
        
//        Collections.sort(colors);
        
        ArrayList<String> copiedColors = new ArrayList<>();

        for (int i = 0; i < colors.size(); i++) {
            copiedColors.add("");
        }

        Collections.copy(copiedColors, colors);
        
        System.out.println(copiedColors);
        
//        System.out.println(colors.contains("Green"));
	}

}
