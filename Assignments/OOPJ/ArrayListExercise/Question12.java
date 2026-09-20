package org.zarreen;

import java.util.TreeSet;

public class Question12 {
    public static void main(String[] args) {

        TreeSet<String> colors = new TreeSet<>();

        colors.add("Yellow");
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");

        System.out.println(colors);
        
        TreeSet<String> colors1 = new TreeSet<>();
        
        colors1.add("Black");
        colors1.add("Orange");
        
        colors.addAll(colors1);
        
        System.out.println(colors);
    }
}