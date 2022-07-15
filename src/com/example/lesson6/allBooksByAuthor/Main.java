package com.example.lesson6.allBooksByAuthor;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<String, List<String>> dataBase = BookLogic.createDataBaseMap();

        System.out.println("List of available Authors: ");
        System.out.println(dataBase.keySet());

        System.out.println("Type in author's full name to show the full list of his/her books:");
        Scanner in = new Scanner(System.in);
        String authorName = in.nextLine();

        System.out.println(listBooksByAuthors(authorName,dataBase));

    }

    public static List<String> listBooksByAuthors(String authorName, Map<String, List<String>> dataBase) {
        return dataBase.get(authorName);
    }
}
