package com.example.lesson4.hashCode;

import java.util.List;

public class Utility {

    public static void printField(List<Car> list) {
        String[] A = fillArrayWithX(list);
        System.out.println("        0   1   2   3   4   5   6   7   8   9  ");
        //System.out.println("  |   |   |   |   |   |   |   |   |   |  ");
        System.out.println("        v   v   v   v   v   v   v   v   v   v  ");
        String[] colors = {"Red   ","Orange","Yellow","Green ","Blue  ","Purple","Brown ","Black ","Grey  ","White "};

        for (int i = 0; i < 10; i++) {
            System.out.println("      +---+---+---+---+---+---+---+---+---+---+");
            System.out.println(colors[i]+"| " + A[i*10] + " | " + A[i*10 + 1] + " | " + A[i*10 + 2] + " | " + A[i*10 + 3] + " | " + A[i*10 + 4] + " | " + A[i*10 + 5] + " | " + A[i*10 + 6] + " | " + A[i*10 + 7] + " | " + A[i*10 + 8] + " | " + A[i*10 + 9] + " |");
        }
        System.out.println("      +---+---+---+---+---+---+---+---+---+---+");


    }

    private static String[] fillArrayWithX(List<Car> list) {
        String[] A = new String[100];
        for (int i = 0; i < 100; i++) {
            A[i] = " ";
        }
        for (int i = 0; i < 10; i++) {
            int m = list.get(i).year - 2010;
            int n;

            if ("Orange".equals(list.get(i).color)) {
                n = 1;
            } else if ("Yellow".equals(list.get(i).color)) {
                n = 2;
            } else if ("Green".equals(list.get(i).color)) {
                n = 3;
            } else if ("Blue".equals(list.get(i).color)) {
                n = 4;
            } else if ("Purple".equals(list.get(i).color)) {
                n = 5;
            } else if ("Brown".equals(list.get(i).color)) {
                n = 6;
            } else if ("Black".equals(list.get(i).color)) {
                n = 7;
            } else if ("Grey".equals(list.get(i).color)) {
                n = 8;
            } else if ("White".equals(list.get(i).color)) {
                n = 9;
            } else {
                n = 0;
            }


            A[10 * n + m ] = "X";
        }
        return A;
    }
}
