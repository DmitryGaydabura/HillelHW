package com.example.lesson4.hashCode;

import java.util.ArrayList;
import java.util.List;

public class Logic {
    public static String chooseRandColor(){
        int randomInt = (int)(Math.random()*10);
        List<String> listOfColors = new ArrayList<>(10);
        fillMyList(listOfColors);
        return listOfColors.get(randomInt);
    }

    private static void fillMyList(List<String> list) {
        list.add("Red");
        list.add("Orange");
        list.add("Yellow");
        list.add("Green");
        list.add("Blue");
        list.add("Purple");
        list.add("Brown");
        list.add("Black");
        list.add("Grey");
        list.add("White");
    }

    public static int chooseRandYear(){
        int randomInt = (int)(Math.random()*10);
        return 2010 + randomInt;
    }


    public static void equalsCheck(List<Car> list ) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if(list.get(i).equalsByColor(list.get(j)) && i != j)
                    System.out.println("Car\"" + i + "\" has same color as Car\"" + j +"\" (" + list.get(i).color + ")");
            }

        }
        System.out.println("\n");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if(list.get(i).equalsByYear(list.get(j)) && i != j)
                    System.out.println("Car\"" + i + "\" has same year as Car\"" + j +"\" (" + list.get(i).year + ")");
            }

        }
    }
}
