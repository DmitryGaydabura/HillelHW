package com.example.lesson6.allBooksByAuthor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookLogic {
    public static Map<String, List<String>> createDataBaseMap() {

        Map<String, List<String>> dataBase = williamShakespeareCreate();
        jKRowlingCreate(dataBase);
        stephenKingCreate(dataBase);
        reneGoscinnyCreate(dataBase);
        erleStanleyGardnerCreate(dataBase);

        return dataBase;
    }

    private static void erleStanleyGardnerCreate(Map<String, List<String>> dataBase) {
        List<String> booksESG = new ArrayList<>();
        booksESG.add(("Mystery"));
        booksESG.add(("Perry Mason"));
        dataBase.put(new Author("Erle Stanley Gardner").name,booksESG);
    }

    private static void reneGoscinnyCreate(Map<String, List<String>> dataBase) {
        List<String> booksRG = new ArrayList<>();
        booksRG.add(("Franco-Belgian comics"));
        booksRG.add(("Asterix"));
        booksRG.add(("Lucky Luke"));
        booksRG.add(("Iznogoud"));
        dataBase.put(new Author("Rene Goscinny").name,booksRG);
    }

    private static void stephenKingCreate(Map<String, List<String>> dataBase) {
        List<String> booksSK = new ArrayList<>();
        booksSK.add(("Horror"));
        booksSK.add(("thriller"));
        booksSK.add(("science fiction"));
        booksSK.add(("It"));
        booksSK.add(("The Shining"));
        booksSK.add(("The Stand"));
        booksSK.add(("Pet Sematary"));
        dataBase.put(new Author("Stephen King").name,booksSK);
    }

    private static void jKRowlingCreate(Map<String, List<String>> dataBase) {
        List<String> booksJKR = new ArrayList<>();
        booksJKR.add(("Harry Potter"));
        booksJKR.add(" Fantastic Beasts and Where to Find Them");
        booksJKR.add((" Cormoran Strike"));
        booksJKR.add((" Young Adult,fantasy"));
        booksJKR.add((" crime fiction"));
        dataBase.put(new Author("J.K. Rowling").name,booksJKR);
    }

    private static Map<String, List<String>> williamShakespeareCreate() {
        Map<String,List<String>> dataBase = new HashMap<>();
        List<String> booksWS = new ArrayList<>();
        booksWS.add(("Romeo and Juliet"));
        booksWS.add(("Macbeth"));
        booksWS.add(("Hamlet"));
        dataBase.put(new Author("William Shakespeare").name,booksWS);
        return dataBase;
    }
}
