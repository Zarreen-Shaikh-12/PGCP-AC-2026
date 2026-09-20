package org.zarreen;

import java.util.TreeSet;

public class Question13 {
    public static void main(String[] args) {

        TreeSet<String> colors = new TreeSet<>();

        colors.add("Yellow");
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");

        System.out.println(colors);
        System.out.println(colors.descendingSet());
    }
}